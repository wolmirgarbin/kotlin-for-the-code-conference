package br.com.receitasdecodigo.site.utils

import br.com.receitasdecodigo.site.constants.BRAZILIAN_CURRENCY_SYMBOL
import java.text.DecimalFormat

// top level functions
fun realFormat(value: Double?): String {
    // validation of null
    value ?: fail("Name required")

    // String templates
    return "${BRAZILIAN_CURRENCY_SYMBOL} ${DecimalFormat("#,###.00").format(value)}"
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
