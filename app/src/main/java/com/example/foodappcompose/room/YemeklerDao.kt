package com.example.foodappcompose.room

import androidx.room.Dao
import androidx.room.Query
import com.example.foodappcompose.entity.Yemekler

@Dao
interface YemeklerDao {
    @Query("SELECT * FROM yemekler")
    suspend fun tumYemekler(): List<Yemekler>

}