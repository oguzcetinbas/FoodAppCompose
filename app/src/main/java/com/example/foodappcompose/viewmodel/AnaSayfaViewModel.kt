package com.example.foodappcompose.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.foodappcompose.entity.Yemekler
import com.example.foodappcompose.repo.YemeklerDaoRepository

class AnaSayfaViewModel(application: Application) : AndroidViewModel(application) {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()
    private var yrepo = YemeklerDaoRepository(application)

    init {

        yemekleriYukle()
        yemeklerListesi = yrepo.yemekleriGetir()
    }

    fun yemekleriYukle() {
        yrepo.tumYemekleriAl()
    }
}