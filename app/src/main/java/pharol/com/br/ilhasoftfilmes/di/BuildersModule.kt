package pharol.com.br.ilhasoftfilmes.di

import com.example.pharol.temminstore.di.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import pharol.com.br.ilhasoftfilmes.MainActivity
import javax.inject.Singleton

/**
 * Created by pharol on 7/22/17.
 */

@Module
abstract class BuildersModule {

    @PerActivity
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

}