import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class Testing{
    
    @Test
    public void testFunction(){
        
        JunitTesting test = new JunitTesting();
        int output = test.function(5);
        assertEquals(25, output);
        
    }
    
}