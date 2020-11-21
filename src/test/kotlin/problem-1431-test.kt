import org.junit.Assert
import org.junit.Test

class Problem1431 {
    @Test
    fun test1() {
        Assert.assertArrayEquals(kidsWithCandies(intArrayOf(2,3,5,1,3),3), booleanArrayOf(true,true,true,false,true))
    }
    @Test
    fun test2() {
        Assert.assertArrayEquals(kidsWithCandies(intArrayOf(4,2,1,1,2),1), booleanArrayOf(true,false,false,false,false))
    }
    @Test
    fun test3() {
        Assert.assertArrayEquals(kidsWithCandies(intArrayOf(12,1,12),10), booleanArrayOf(true,false,true))
    }
}