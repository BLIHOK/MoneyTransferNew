import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun main() {
//        println("Введи сумму перевода")
        val amount = 100
        val fee = 0.0075
        val minFee = 35
        val resultFee = if (100 * 0.0075 > 35){
            100 * 0.0075
        } else {
            35
        }
//        println(
//            """
//        Сумма перевода: $amount
//        Размер комиссии составит: $resultFee
//        """.trimIndent()
//        )
        assertEquals(35, resultFee)
    }
}