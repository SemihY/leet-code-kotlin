import org.junit.Assert
import org.junit.Test

class Problem492 {
    @Test
    fun test1() {
        Assert.assertArrayEquals(constructRectangle(4), intArrayOf(2,2))
    }

    @Test
    fun test2() {
        Assert.assertArrayEquals(constructRectangle(37), intArrayOf(37,1))
    }

    @Test
    fun test3() {
        Assert.assertArrayEquals(constructRectangle(122122), intArrayOf(427,286))
    }
}