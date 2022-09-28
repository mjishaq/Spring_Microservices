package service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Interface.IUserService;
import dto.ResponseDto;

@Service
public class UserService implements IUserService {

	public ResponseDto saveUserData(String id, String name) {
		ResponseDto respDto = new ResponseDto();
		if(id.equals("123") && name.equals("Ishaq")) {
			respDto.setId(id);
			respDto.setName(name);
			return  respDto;
		}else {
			respDto.setId("456");
			respDto.setName("BBBB");
			return respDto;
		}
		
		
	}

	
	
}
