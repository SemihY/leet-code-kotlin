import org.junit.Assert
import org.junit.Test

class Problem387{
    @Test
    fun test1() {
        Assert.assertEquals(firstUniqChar("leetcode"), 0)
    }
    @Test
    fun test2() {
        Assert.assertEquals(firstUniqChar("loveleetcode"), 2)
    }
    @Test
    fun test3() {
        Assert.assertEquals(firstUniqChar("leel"), -1)
    }
}