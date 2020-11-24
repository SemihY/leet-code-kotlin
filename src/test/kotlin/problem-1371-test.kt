import org.junit.Assert
import org.junit.Test

class Problem1371{
    @Test
    fun test1() {
        Assert.assertEquals(findTheLongestSubstring("eleetminicoworoep"), 13)
    }
    @Test
    fun test2() {
        Assert.assertEquals(findTheLongestSubstring("leetcodeisgreat"), 5)
    }
    @Test
    fun test3() {
        Assert.assertEquals(findTheLongestSubstring("bcbcbc"), 6)
    }
}