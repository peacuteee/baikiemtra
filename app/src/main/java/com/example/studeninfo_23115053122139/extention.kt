package com.example.studeninfo_23115053122139

fun Double.toPassStatus(): String {
    return if (this >= 5.0) "Trạng thái: ĐẠT" else "Trạng thái: CHƯA ĐẠT"
}

fun String.toUppercaseName(): String {
    return this.uppercase()
}