package com.grupo8.APITaller2.contollers.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginReqDto {
	@Email
	@NotEmpty(message = "Credential required")
	private String email;
	@NotEmpty(message = "Credential required")
	private String password;
}
