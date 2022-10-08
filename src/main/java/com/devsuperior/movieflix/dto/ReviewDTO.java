package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String text;
	private Long movieId;

	public ReviewDTO() {

	}

	public ReviewDTO(String text, Long movieId) {
		this.text = text;
		this.movieId = movieId;
	}

	public ReviewDTO(Review review) {
		this.text = review.getText();
		this.movieId = review.getMovie().getId();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

}
