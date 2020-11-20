import org.junit.Assert
import org.junit.Test

class Problem1470 {
    @Test
    fun test1(){
        Assert.assertArrayEquals(shuffle(intArrayOf(2,5,1,3,4,7),3), intArrayOf(2,3,5,4,1,7))
    }
    @Test
    fun test2(){
        Assert.assertArrayEquals(shuffle(intArrayOf(1,2,3,4,4,3,2,1),4), intArrayOf(1,4,2,3,3,2,4,1))
    }
    @Test
    fun test3(){
        Assert.assertArrayEquals(shuffle(intArrayOf(1,1,2,2),2), intArrayOf(1,2,1,2))
    }
}