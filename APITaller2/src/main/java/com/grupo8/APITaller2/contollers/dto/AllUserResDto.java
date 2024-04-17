package com.grupo8.APITaller2.contollers.dto;

import java.util.Date;
import lombok.Data;

@Data
public class AllUserResDto  {
	private String name;
	private String secondName;
	private String email;
	private Date dateOfHire;
	private String rol;
	
}
