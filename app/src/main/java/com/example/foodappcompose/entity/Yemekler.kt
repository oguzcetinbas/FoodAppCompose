package com.example.foodappcompose.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "yemekler")
data class Yemekler(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "yemek_id") var yemekId: Int,
    @ColumnInfo(name = "yemekAdi") var yemekAdi: String,
    @ColumnInfo(name = "yemekResimAdi") var yemekResimAdi: String,
    @ColumnInfo(name = "yemekFiyat") var yemekFiyat: Int
)