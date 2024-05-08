package br.com.guilhermeoli.testes.DAO;

/**
 * @author guiol
 */
public class ClienteDAOMock implements IClienteDAO{
    @Override
    public String salvar() {
        return "Sucesso";
    }
}
