import org.junit.Assert
import org.junit.Test

class Problem1344{
    @Test
    fun test1() {
        Assert.assertEquals(angleClock(12,30), 165.0, 10.times(-5).toDouble())
    }
    @Test
    fun test2() {
        Assert.assertEquals(angleClock(3,30), 75.0, 10.times(-5).toDouble())
    }
    @Test
    fun test3() {
        Assert.assertEquals(angleClock(3,15), 7.5, 10.times(-5).toDouble())
    }
    @Test
    fun test4() {
        Assert.assertEquals(angleClock(4,50), 155.0, 10.times(-5).toDouble())
    }
    @Test
    fun test5() {
        Assert.assertEquals(angleClock(12,0), 0.0, 10.times(-5).toDouble())
    }
    @Test
    fun test6() {
        Assert.assertEquals(angleClock(11,2), 41.0, 10.times(-5).toDouble())
    }
}