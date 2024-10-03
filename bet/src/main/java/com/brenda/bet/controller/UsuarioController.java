package com.brenda.bet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brenda.bet.dto.UsuarioDTO;
import com.brenda.bet.model.UsuarioModel;
import com.brenda.bet.repository.UsuarioRepository;

@RestController
@RequestMapping("api")

public class UsuarioController {
	
	@Autowired
	UsuarioRepository repository;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<?> salvarUsuario(@RequestBody UsuarioDTO user) {
		UsuarioModel usuario = new UsuarioModel(user);
		repository.save(usuario);
		return ResponseEntity.ok("usuario cadastrado");
	}
	
}
