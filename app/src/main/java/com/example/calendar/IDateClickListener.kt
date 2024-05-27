package com.example.calendar

import java.time.LocalDate

interface IDateClickListener {
    fun onClickDate(date: LocalDate)
}
