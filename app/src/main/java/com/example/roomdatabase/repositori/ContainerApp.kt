package com.example.roomdatabase.repositori

import android.content.Context
import com.example.roomdatabase.room.DatabaseSiswa

interface ContainerApp {
    val repositorySiswa : RepositorySiswa
}

class ContainerDataApp(private val context: Context):
        ContainerApp{
            override val repositorySiswa: RepositorySiswa by lazy {
                OfflineRepositoriSiswa(
                    siswaDao = DatabaseSiswa.getDatabase(context).siswaDao()
                )
            }
        }

