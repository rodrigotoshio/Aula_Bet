package com.brenda.bet.repository;

import java.util.UUID;
		
import org.springframework.data.jpa.repository.JpaRepository;

import com.brenda.bet.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID>{


	
}
