package com.aplikasi.trashbin.utils

import java.text.DecimalFormat

object FunctionHelper {

    fun rupiahFormat(price: Int): String {
        val formatter = DecimalFormat("#,###")
        return "" + formatter.format(price.toLong())
    }
}