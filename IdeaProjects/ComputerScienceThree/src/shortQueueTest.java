import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class shortQueueTest {

    @Test
    void testEmptyQ(){
        shortQueue q = new shortQueue();
        assertEquals(null, q.take());
        assertEquals(false, q.isFull());
    }
    @Test
    void testFullQ(){
        shortQueue q = new shortQueue();
        q.put("abc");
        assertEquals(true, q.isFull());
        assertEquals("abc", q.take());
    }
    @Test
    void testEmptyAfterTakeQ(){
        shortQueue q = new shortQueue();
        q.put("abc");
        String s=q.take();
        assertEquals(false, q.isFull());
        assertEquals(null, q.take());
    }

    @Test
    void testEmptyAfterNullQ(){
        shortQueue q = new shortQueue();
        q.put("abc");
        String s=q.take();
        assertEquals(false, q.isFull());
        assertEquals(null, q.take());
    }

    @Test
    void testIgnoreAfterPutQ(){
        shortQueue q = new shortQueue();
        q.put("abc");
        q.put("def");
        //q.put(42); Would not compile since it does not take "int"
        assertEquals(true, q.isFull());
        assertEquals("abc", q.take());
    }

//Create tests to

}
