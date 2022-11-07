package com.proyecto.demo.common;



import com.proyecto.demo.dto.SignupRequest;
import com.proyecto.demo.dto.User;
import com.proyecto.demo.dto.UserRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntityDtoConverter {


	private ModelMapper modelMapper;

	@Autowired
	public EntityDtoConverter(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}
	public UserRequest convertEntityToDto(User user) {
		return modelMapper.map(user, UserRequest.class);
	}
	

	
	public User convertDtoToEntity(UserRequest userRequest) {
		return modelMapper.map(userRequest, User.class);
	}
	
	public User convertDtoToEntity(SignupRequest signupRequest) {
		return modelMapper.map(signupRequest, User.class);
	}

	
}
