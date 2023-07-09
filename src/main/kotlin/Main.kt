fun main(args: Array<String>) {
    println("Введи сумму перевода")
    val amount = readln().toInt()
    val fee = 0.0075
    val minFee = 35
    val resultFee = if (amount * fee > minFee) {
        amount * fee
    }else {
        minFee
    }
//    println(
//        """
//        Сумма перевода: $amount
//        Размер комиссии составит: $resultFee
//        """.trimIndent()
//    )
}
