package com.erickcg.Parcial2.models.dtos;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SearchSongDTO {
	
	@Size(min=0,max= 32)
	private String title;
	
//	//estos son los parametros para agregar la paginacio a la peticion
//	private int page;
//	private int limit;
	
}
