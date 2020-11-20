import org.junit.Assert
import org.junit.Test

class Problem347{
    @Test
    fun test1() {
        Assert.assertArrayEquals(topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2), intArrayOf(1, 2))
    }
    @Test
    fun test2() {
        Assert.assertArrayEquals(topKFrequent(intArrayOf(1, 2), 2), intArrayOf(1, 2))
    }
}