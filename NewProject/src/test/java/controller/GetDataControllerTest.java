package controller;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.hamcrest.Matchers;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import Interface.IUserService;
import dto.ResponseDto;
import service.UserService;


public class GetDataControllerTest {
	
	@MockBean
	IUserService userService;
	
	@MockBean
	UserService userService1;
	
	private MockMvc  mockMvc;
	
	@Test
	void postData() throws Exception {
		
		ResponseDto responseDto = new ResponseDto();
		    responseDto.setId("12");
		    responseDto.setName("Baigan");
		//BDDMockito.given( userService.saveUserData("12","344")).willReturn(responseDto);
		Mockito.when( userService1.saveUserData(responseDto.getId(),responseDto.getName())).thenReturn(responseDto);
		mockMvc.perform(post("/postMapping")).andExpect(status().isOk())
               ;
				
	}

}
