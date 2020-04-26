package leetcode.google.license_key_formatting

import java.lang.StringBuilder

fun formatLicenseKey(key: String, partition: Int): String {
    val resultString = StringBuilder()
    val dashChar = '-'
    var temp = 0

    loop@for (i in key.lastIndex downTo 0) {
        when {
            key[i] == dashChar -> continue@loop
            temp < partition -> temp++
            else -> {
                temp = 1
                resultString.append(dashChar)
            }
        }

        resultString.append(key[i].toUpperCase())
    }

    var tempIndex = resultString.lastIndex
    for (i in 0 until resultString.length / 2) {
        val tempChar = resultString[i]
        resultString[i] = resultString[tempIndex]
        resultString[tempIndex] = tempChar
        tempIndex--
    }

    return resultString.toString()
}