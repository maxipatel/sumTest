package rest.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class TestJUnit {
	
		@InjectMocks
		SumController sc;
		
		@Mock
		Data data;
		
		 @Before
		    public void init() {
		        MockitoAnnotations.initMocks(this);
		    }
		     
		
		@Test  
	    public void testFindMax(){  
			
	        assertEquals(11,sc.getBook("add",5,6).getResult());  
	        assertEquals(-1,sc.getBook("subtract",5,6).getResult());
	        assertEquals(30,sc.getBook("multiply",5,6).getResult());  
	        assertEquals(0,sc.getBook("divide",5,6).getResult());  
	        assertEquals("Wrong Operation",sc.getBook("test",5,6).getResult());  
	        assertEquals("ok",sc.getBook("divide",5,6).getOk());  
	    }  
}
