package com.unisoft.mvvm_arch_native_android

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface QuoteDao {
    @Query("SELECT * from quote")
    fun getQuotes(): LiveData<List<Quote>>
}