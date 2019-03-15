package restGradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit {
		@Test  
	    public void testFindMax(){  
	        
	        assertEquals(new Data("ok", "11"),SumController.getBook("add",5,6));  
	        
	    }  
}
