package br.com.apicep.service;

import br.com.apicep.entity.Cliente;

/**
 *
 * @author marcos
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
