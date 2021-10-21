package dev.cardoso.quotesmvvm.data.model

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import  dagger.hilt.components.SingletonComponent
import dev.cardoso.quotesmvvm.core.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn (SingletonComponent::class)
object Network  {
    @Singleton

    //proveo retrift
    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}