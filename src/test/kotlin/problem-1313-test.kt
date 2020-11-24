import org.junit.Assert
import org.junit.Test

class Problem1313 {
    @Test
    fun test1(){
        Assert.assertArrayEquals(decompressRLElist(intArrayOf(1,2,3,4)), intArrayOf(2,4,4,4))
    }
    @Test
    fun test2(){
        Assert.assertArrayEquals(decompressRLElist(intArrayOf(1,1,2,3)), intArrayOf(1,3,3))
    }
}