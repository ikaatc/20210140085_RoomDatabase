package com.example.pertsepuluhdatasiswa

import android.app.Application
import com.example.pertsepuluhdatasiswa.Repositori.ContainerApp
import com.example.pertsepuluhdatasiswa.Repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}