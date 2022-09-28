package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restservices")
public class FinalPractiseController {
	
	
	@GetMapping("/user/names")
	public ResponseEntity<String> getEnteredNames(@RequestParam String UserEnteredName){
		
		String userNameEntered= UserEnteredName;
		
		
		return new ResponseEntity<String>(userNameEntered,HttpStatus.OK);
		
	}
	
	

}
