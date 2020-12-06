import org.junit.Assert
import org.junit.Test

class Problem1452 {
    @Test
    fun test1() {
        Assert.assertEquals(peopleIndexes(listOf(listOf("leetcode", "google", "facebook"),
            listOf("google", "microsoft"),
            listOf("google", "facebook"),
            listOf("google"),
            listOf("amazon"))), listOf(0, 1, 4))
    }

    @Test
    fun test2() {
        Assert.assertEquals(peopleIndexes(listOf(listOf("leetcode", "google", "facebook"), listOf("leetcode", "amazon"),
            listOf("facebook", "google"))), listOf(0, 1))
    }

    @Test
    fun test3() {
        Assert.assertEquals(peopleIndexes(listOf(listOf("leetcode"), listOf("amazon"),
            listOf("facebook"), listOf("google"))), listOf(0, 1, 2, 3))
    }
}