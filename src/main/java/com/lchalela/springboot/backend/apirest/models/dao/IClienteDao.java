package com.lchalela.springboot.backend.apirest.models.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.repository.CrudRepository;

import com.lchalela.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long> {

	
}
