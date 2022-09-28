package Interface;

import dto.ResponseDto;

public interface IUserService {
ResponseDto saveUserData(String id, String name);
}
