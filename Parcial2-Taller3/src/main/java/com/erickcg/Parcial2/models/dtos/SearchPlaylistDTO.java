package com.erickcg.Parcial2.models.dtos;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SearchPlaylistDTO {

	@Size(min= 0, max = 64)
	private String title;
}
