
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest
{
	@Test
    public void testSayHello() {
        assertEquals(Greeting.sayHello("Rick"), "Hello Rick");
    }
	
    @Test
    public void testSayGoodbye() {
        assertEquals(Greeting.sayGoodbye("Rick"), "Goodbye Rick");
    }
}
