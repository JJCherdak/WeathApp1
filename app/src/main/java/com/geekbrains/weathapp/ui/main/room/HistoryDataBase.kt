package com.geekbrains.weathapp.ui.main.room

import androidx.room.Database

@Database(entities = arrayOf(HistoryEntity::class), version = 1, exportSchema = false)
abstract class HistoryDataBase : RoomDatabase() {

    abstract fun historyDao(): HistoryDAO

}