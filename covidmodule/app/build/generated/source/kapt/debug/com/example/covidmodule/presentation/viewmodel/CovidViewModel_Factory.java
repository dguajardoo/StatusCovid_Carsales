// Generated by Dagger (https://dagger.dev).
package com.example.covidmodule.presentation.viewmodel;

import com.example.covidmodule.domain.usecase.GetStatusCovidUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.example.covidmodule.presentation.di.DefaultDispatcher")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CovidViewModel_Factory implements Factory<CovidViewModel> {
  private final Provider<GetStatusCovidUseCase> getStatusCovidUseCaseProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public CovidViewModel_Factory(Provider<GetStatusCovidUseCase> getStatusCovidUseCaseProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.getStatusCovidUseCaseProvider = getStatusCovidUseCaseProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public CovidViewModel get() {
    return newInstance(getStatusCovidUseCaseProvider.get(), dispatcherProvider.get());
  }

  public static CovidViewModel_Factory create(
      Provider<GetStatusCovidUseCase> getStatusCovidUseCaseProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new CovidViewModel_Factory(getStatusCovidUseCaseProvider, dispatcherProvider);
  }

  public static CovidViewModel newInstance(GetStatusCovidUseCase getStatusCovidUseCase,
      CoroutineDispatcher dispatcher) {
    return new CovidViewModel(getStatusCovidUseCase, dispatcher);
  }
}