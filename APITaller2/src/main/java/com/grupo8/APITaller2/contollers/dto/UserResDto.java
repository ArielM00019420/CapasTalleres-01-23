package com.grupo8.APITaller2.contollers.dto;

import java.util.Date;

import com.grupo8.APITaller2.models.dto.SuperGenericResponse;

import lombok.Data;
@Data
public class UserResDto extends SuperGenericResponse {
	private String name;
	private String secondName;
	private String email;
	private Date dateOfHire;
	private String rol;
}
