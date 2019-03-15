package rest.gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class SumController {
	
	private SumController() {
	      //not called
	   }
	
	@GetMapping(path = "/compute")
	public static  Data getBook(@RequestParam String action ,@RequestParam int num1, @RequestParam int num2) {
		try {
			int result;
			switch(action) {
			case "add":
				result = num1+num2;
				break;
				
			case "subtract" :
				result = num1-num2;
				break;
				
			case "multiply":
				result = num1*num2;
				break;
				
			case "divide":
				result = num1/num2;
				break;
				
			default :
				throw new IllegalArgumentException("Wrong Operation");  
			}
		
		return new Data("ok", result);
		
		}catch (Exception e) {
			
		return new Data("error", e.getMessage());
			
		}
	}
}
