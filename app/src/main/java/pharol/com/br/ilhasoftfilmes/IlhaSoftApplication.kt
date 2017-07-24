package pharol.com.br.ilhasoftfilmes

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication




class IlhaSoftApplication: DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

}
