package com.android.demo.liverpool.db


import androidx.room.Database
import androidx.room.RoomDatabase
import com.android.demo.liverpool.vo.*

/**
 * Main database description.
 */
@Database(
        entities = [
            Product::class,
            PlpSearchResult::class],
        version = 4,
        exportSchema = false
)
abstract class LiverpoolDb : RoomDatabase() {
    abstract fun productDao(): ProductDao
}
