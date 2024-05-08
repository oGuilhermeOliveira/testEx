package br.com.guilhermeoli.testes.service;

import br.com.guilhermeoli.testes.DAO.ClienteDAO;
import br.com.guilhermeoli.testes.DAO.IClienteDAO;

/**
 * @author guiol
 */
public class ClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        //clienteDAO = new ClienteDAO();
        this.clienteDAO = clienteDAO;
    }

    public String salvar() {
        clienteDAO.salvar();
        return "Sucesso";
    }
}
