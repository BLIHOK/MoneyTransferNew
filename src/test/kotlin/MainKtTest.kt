import com.sun.tools.javac.Main
import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainKtTest {


    @Test
    fun onlyForTest() {
        val IntForTest = 5
        val StringForTest = "Like"
        val forTest = onlyForTest(IntForTest, StringForTest)
        assertEquals("10 LikeLike", forTest)
    }

    @Test
    fun onlyForTestAnotherResult() {
        val IntForTest = 1
        val StringForTest = "Like"
        val forTest = onlyForTest(IntForTest, StringForTest)
        assertEquals("LikeLike", forTest)
    }

    @Test
    fun calculateFee() {

        val amount = 100
        val fee = 0.0075
        val minFee = 35

        val resultFee = if (amount * fee > minFee) amount * fee.toInt() else minFee

        val result = calculateFee(amount, fee, minFee)
        assertEquals(35, result)
    }
    @Test
    fun calculateFeeAnotherResult() {

        val amount = 10000
        val fee = 0.0075
        val minFee = 35

        val resultFee = if (amount * fee > minFee) amount * fee.toInt() else minFee

        val result = calculateFee(amount, fee, minFee)
        assertEquals(75, result)
    }

    @Test
    fun testMain() {
        val amount = 100
        val fee = 0.0075
        val minFee = 35

        val expectedOutput = """
            Сумма перевода: $amount
            Размер комиссии составит: ${calculateFee(amount, fee, minFee)}
        """.trimIndent()

        val outputStreamCaptor = SystemOutCaptor()
        System.setOut(PrintStream(outputStreamCaptor))

        main()

        assertEquals(expectedOutput, outputStreamCaptor.output.trim())
    }

    private class SystemOutCaptor : ByteArrayOutputStream() {
        val output: String
            get() = toString()
    }
}
