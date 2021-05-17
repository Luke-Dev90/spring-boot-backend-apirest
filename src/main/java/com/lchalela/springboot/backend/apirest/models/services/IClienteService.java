package com.lchalela.springboot.backend.apirest.models.services;

import java.util.List;

import com.lchalela.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public Cliente FindById(Long id);
	public Cliente save(Cliente cliente);
	public void detele(Long id);
}
