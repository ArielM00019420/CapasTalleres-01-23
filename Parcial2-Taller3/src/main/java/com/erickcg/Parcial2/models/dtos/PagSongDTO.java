package com.erickcg.Parcial2.models.dtos;

import lombok.Data;

@Data
public class PagSongDTO {
	//esto sirve para la paginacion de las peticiones
	private int page;
	private int limit;
	

}
