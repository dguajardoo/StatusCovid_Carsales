package com.david.statuscovid_carsales.utils.presentation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.david.statuscovid_carsales.R
import com.david.statuscovid_carsales.databinding.ErrorLayoutBinding

class ErrorView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0, defStyleRes: Int = 0
) : ConstraintLayout(context, attrs, defStyle, defStyleRes) {

    private val binding = ErrorLayoutBinding.inflate(LayoutInflater.from(context), this, false)

    private var clickListener: () -> Unit = { }

    var errorMessage: String = ""
        set(value) {
            field = value
            binding.textViewError.text = value
        }

    init {
        addView(binding.root)
        loadAttrs(attrs)
        initListener()
    }

    private fun loadAttrs(attrs: AttributeSet?) {
        attrs?.let {
            val styledAttributes = context.obtainStyledAttributes(it, R.styleable.ErrorView, 0, 0)

            errorMessage = resources.getText(
                styledAttributes.getResourceId(
                    R.styleable.ErrorView_errorMessage, R.string.error_message
                )
            ).toString()

            styledAttributes.recycle()
        }
    }

    private fun initListener() {
        binding.buttonRetry.setOnClickListener {
            clickListener()
        }
    }

    fun show(message: String, call: () -> Unit) {
        errorMessage = message
        clickListener = call
    }

}