package com.grupo8.APITaller2.contollers.dto;


import com.grupo8.APITaller2.models.dto.SuperGenericResponse;

import lombok.Data;

@Data
public class LoginResDto extends SuperGenericResponse  {
	private String name;
	private String secondName;
	private String email;
	private String rol;
}


