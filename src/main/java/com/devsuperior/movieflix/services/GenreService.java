package com.devsuperior.movieflix.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.GenreDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.repositories.GenreRepository;

@Service
public class GenreService {

	@Autowired
	private GenreRepository repository;

	@Transactional(readOnly = true)
	public List<GenreDTO> findAll() {
		List<Genre> entity = repository.findAll();
		List<GenreDTO> dto = new ArrayList<>();

		for (Genre genre : entity) {
			dto.add(new GenreDTO(genre));
		}

		return dto;

	}

}
