import org.junit.Assert
import org.junit.Test

class Problem738{
    @Test
    fun test1() {
        Assert.assertEquals(monotoneIncreasingDigits(10), 9)
    }
    @Test
    fun test2() {
        Assert.assertEquals(monotoneIncreasingDigits(1234), 1234)
    }
    @Test
    fun test3() {
        Assert.assertEquals(monotoneIncreasingDigits(332), 299)
    }
    @Test
    fun test4() {
        Assert.assertEquals(monotoneIncreasingDigits(668841), 667999)
    }
    @Test
    fun test5() {
        Assert.assertEquals(monotoneIncreasingDigits(999998), 899999)
    }
}