package com.gilbertohdz.calorytracker.di

import android.app.Application
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.gilbertohdz.core.data.preferences.DefaultPreferences
import com.gilbertohdz.core.domain.preferences.Preferences
import com.gilbertohdz.core.domain.usecase.FilterOutDigits
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

  @Provides
  @Singleton
  fun provideSharedPreferences(
    app: Application
  ): SharedPreferences {
    return app.getSharedPreferences("shared_pref", MODE_PRIVATE)
  }

  @Provides
  @Singleton
  fun providePreferences(sharedPreferences: SharedPreferences): Preferences {
    return DefaultPreferences(sharedPreferences)
  }

  @Provides
  @Singleton
  fun provideFilterOutDigits(): FilterOutDigits {
    return FilterOutDigits()
  }
}