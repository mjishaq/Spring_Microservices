package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Interface.IUserService;
import dto.ResponseDto;
import service.KafkaProducerService;
import service.UserService;

@RestController
//@RequestMapping({"/restservices"})
//@RequestMapping(path = "/", produces = "application/json")
public class GetDataController {
	@Autowired
	IUserService userService;
	
	@Autowired
	KafkaProducerService producerService;
	
	@RequestMapping(value= "/get/user/data/{Name}")
	//@GetMapping(value="/user")
	public String getData(@PathVariable String Name){
		
		return "Hello Welcome India"+Name;
	}
	
	
	/*
	 * @GetMapping(value= "/get/user1/data/") //@GetMapping(value="/user") public
	 * String getData1(@RequestParam Map<String,String> abc){
	 * 
	 * var x= abc.get("name"); return "Hello Welcome India"+Name+id; }
	 */
	
	@PostMapping({"/post/user/data"})
	public @ResponseBody ResponseEntity<ResponseDto> postData( @RequestBody ResponseDto responsedto1) {
		
	//public @ResponseBody ResponseEntity<ResponseDto> postData( @RequestParam(value="Name") String Name) {
		
		String XYZ="6";
		
		ResponseDto responsedto= userService.saveUserData(responsedto1.getId(),responsedto1.getName());
		
		return new ResponseEntity<ResponseDto>(responsedto,HttpStatus.OK);
		
	}
	
	@PostMapping({"publish"})
	public void sendMessageToProducerKafka(@RequestParam String message) {
		
		this.producerService.sendMessage(message);
	}

}
