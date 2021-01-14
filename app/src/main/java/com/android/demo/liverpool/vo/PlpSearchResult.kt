package com.android.demo.liverpool.vo

import androidx.room.Entity
import androidx.room.TypeConverters
import com.android.demo.liverpool.db.LiverpoolTypeConverters


@Entity(primaryKeys = ["query"])
@TypeConverters(LiverpoolTypeConverters::class)
data class PlpSearchResult(
        val query: String,
        val totalCount: Int,
        val next: Int?
)
