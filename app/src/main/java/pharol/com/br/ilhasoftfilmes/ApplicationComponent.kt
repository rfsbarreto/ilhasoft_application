package pharol.com.br.ilhasoftfilmes

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import pharol.com.br.ilhasoftfilmes.di.ApplicationModule
import pharol.com.br.ilhasoftfilmes.di.BuildersModule
import javax.inject.Singleton

@Singleton
@Component(modules =
    arrayOf(AndroidInjectionModule::class,
            BuildersModule::class,
            ApplicationModule::class))
interface ApplicationComponent: AndroidInjector<IlhaSoftApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<IlhaSoftApplication>()

}