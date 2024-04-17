package com.grupo8.APITaller2.services;

import java.util.List;

import com.grupo8.APITaller2.contollers.dto.AllUserResDto;
import com.grupo8.APITaller2.contollers.dto.ChangePassReqDto;
import com.grupo8.APITaller2.contollers.dto.ChangeStateReqDto;
import com.grupo8.APITaller2.contollers.dto.LoginReqDto;
import com.grupo8.APITaller2.contollers.dto.LoginResDto;
import com.grupo8.APITaller2.contollers.dto.SaveUserDto;
import com.grupo8.APITaller2.contollers.dto.UserResDto;

public interface IUser {
	//servicio que permite el inicio de sesion 
	LoginResDto signin(LoginReqDto loginInfo);

		//servicio que devulve todos los usuarios
	List<AllUserResDto> findAllUser();

		//servicio que busca un usuario por id
	UserResDto userByCode(String code);

		//servicio que guarda un nuevo usuario
	void newUser(SaveUserDto info);
		
		//servicio que realiza el cambio de contrasena de un usuario
	void changePass(ChangePassReqDto infoUser);
		
		//servicio que modifica el estado de un usuario
	void changeState(ChangeStateReqDto infoUser);
}
