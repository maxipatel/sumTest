package restGradle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;

@RestController
public class SumController {
	
	@RequestMapping(path = "/compute", method = RequestMethod.GET)
	public Data getBook(@RequestParam String action ,@RequestParam int num1, @RequestParam int num2) {
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
