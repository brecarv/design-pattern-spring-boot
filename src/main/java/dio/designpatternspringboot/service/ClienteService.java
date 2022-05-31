package dio.designpatternspringboot.service;

import dio.designpatternspringboot.model.Cliente;
/*
* Interface definindo o padrão Strategy no dominio do cliente. Assim
* podemos ter multiplas implementacoes dessa interface se necessario.
* */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
