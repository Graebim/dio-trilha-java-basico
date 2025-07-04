package com.graebim.lab_padroes_projeto_spring.service;

import com.graebim.lab_padroes_projeto_spring.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}