package com.example.pertsepuluhdatasiswa.model

import androidx.lifecycle.ViewModel
import com.example.pertsepuluhdatasiswa.Repositori.RepositoriSiswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}