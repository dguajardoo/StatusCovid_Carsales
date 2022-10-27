package com.example.covidmodule.utils.data

import com.example.covidmodule.data.util.IMapper
import com.example.covidmodule.data.util.Result
import com.example.covidmodule.data.util.State
import retrofit2.Response

suspend fun <D, V> requestWithMapper(
    mapper: IMapper<D, V>,
    call: suspend () -> Response<D>
): State<V> {
    return when (val result = safeRequest(call)) {
        is Result.Error -> State.Error(result.message)
        is Result.Success -> State.Success(mapper.execute(result.data))
    }
}

suspend fun <T> safeRequest(call: suspend () -> Response<T>): Result<T> {
    try {
        val result = call()
        if (result.isSuccessful) {
            return Result.Success(result.body())
        } else {
            return Result.Error(result.message())
        }
    } catch (ex: Exception) {
        return Result.Error(ex.message ?: "Error message.")
    }
}