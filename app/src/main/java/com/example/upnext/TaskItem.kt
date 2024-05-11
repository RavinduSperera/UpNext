package com.example.upnext

import android.content.Context
import androidx.core.content.ContextCompat
import java.time.LocalDate
import java.time.LocalTime
import java.util.UUID

class TaskItem(
    var name: String,
    var desc: String,
    var dueTime: LocalTime?,
    var completedDate: LocalDate?,
    var id: UUID = UUID.randomUUID()
) {

    fun isCompleted() = completedDate != null
    fun imageResource(): Int = if(isCompleted()) R.drawable.check_box_24 else R.drawable.check_box_blank_24
    fun imageColor(context: Context): Int = if(isCompleted()) green(context) else white(context)

    private fun green(context: Context) = ContextCompat.getColor(context, R.color.green)
    private fun white(context: Context) = ContextCompat.getColor(context, R.color.white)

}