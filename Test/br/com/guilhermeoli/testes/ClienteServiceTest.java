package br.com.guilhermeoli.testes;

import br.com.guilhermeoli.testes.DAO.ClienteDAO;
import br.com.guilhermeoli.testes.DAO.ClienteDAOMock;
import br.com.guilhermeoli.testes.DAO.IClienteDAO;
import br.com.guilhermeoli.testes.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author guiol
 */
public class ClienteServiceTest {

    @Test
    public void salvarTeste() {
        ClienteDAOMock mockDao = new ClienteDAOMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroSalvarTeste() {
        IClienteDAO mockDao = new ClienteDAO();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }


}
