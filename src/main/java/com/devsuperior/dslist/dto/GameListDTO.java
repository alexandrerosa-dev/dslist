package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private Integer id;
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private String name;
	
	public GameListDTO() {
	}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}
	
	
}
