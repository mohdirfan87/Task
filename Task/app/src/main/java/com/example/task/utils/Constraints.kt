package com.example.task.utils

import java.util.regex.Matcher
import java.util.regex.Pattern

fun isValidPhone(s: String?): Boolean {
    val p: Pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}")
    val m: Matcher = p.matcher(s)
    return m.find() && m.group().equals(s)
}
