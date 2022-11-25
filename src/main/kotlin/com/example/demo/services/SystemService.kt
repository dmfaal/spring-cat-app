package com.example.demo.services

import java.text.SimpleDateFormat
import java.util.Date

class SystemService {
    fun getTime(): String {
        val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm")
        val date = Date(System.currentTimeMillis())

        return formatter.format(date);
    }
}