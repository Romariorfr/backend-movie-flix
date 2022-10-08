package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Genre;

public class GenreDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;

	public GenreDTO() {

	}

	public GenreDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public GenreDTO(Genre genre) {
		id = genre.getId();
		name = genre.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
