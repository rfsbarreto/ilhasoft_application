package pharol.com.br.ilhasoftfilmes.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

/**
 * Created by pharol on 7/22/17.
 */
@dagger.Module
abstract class ApplicationModule {

    @dagger.Provides
    @javax.inject.Singleton
    fun provideContext(application: android.app.Application): android.content.Context = application.applicationContext

//
//    @Provides
//    fun provideApplication(appContext: Application): Application = appContext
}