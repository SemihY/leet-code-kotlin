import org.junit.Assert
import org.junit.Test

class Problem705 {
    @Test
    fun test1() {
        var obj = MyHashSet()
        obj.add(1)
        obj.add(2)
        Assert.assertEquals(obj.contains(1),true)
        Assert.assertEquals(obj.contains(3),false)
        obj.add(2)
        Assert.assertEquals(obj.contains(2),true)
        obj.remove(2)
        Assert.assertEquals(obj.contains(2),false)
    }
}