fun main() {

    val amount = 100
    val fee = 0.0075
    val minFee = 35

    val resultFee = calculateFee(amount, fee, minFee)

    val resultString =
        println(
            """
        Сумма перевода: $amount
        Размер комиссии составит: $resultFee
    """.trimIndent()
        )

}


fun onlyForTest(someInt: Int, someString: String): String {
    val sumI = someInt * 2
    val sumS = someString + someString
    val concat = if (sumI > 5) "$sumI $sumS" else sumS
    return concat
}

fun calculateFee(amount: Int, fee: Double, minFee: Int): Int {
    val resultFee = if (amount * fee > minFee) {
        (amount * fee).toInt()
    } else {
        minFee
    }
    return resultFee
}
