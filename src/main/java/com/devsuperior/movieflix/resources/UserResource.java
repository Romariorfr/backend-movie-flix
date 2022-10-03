package com.devsuperior.movieflix.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.services.AuthService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private AuthService authService;

	@GetMapping(value = "/profile")
	public ResponseEntity<UserDTO> findById() {
		User entity = authService.authenticated();
		UserDTO dto = new UserDTO(entity);
		return ResponseEntity.ok().body(dto);
	}

}
