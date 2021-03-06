package pl.studioandroida.dagger_hiltindetail

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class )
object AppModule {

    @Singleton
    @Provides
    @Named("String1")
    fun provideTestString1() : String = "This is a string we will inject"


}