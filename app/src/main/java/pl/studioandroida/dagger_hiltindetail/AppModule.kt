package pl.studioandroida.dagger_hiltindetail

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class )
object AppModule {

    @Singleton
    @Provides
    fun provideTestString1() = "This is a string we will inject"



}