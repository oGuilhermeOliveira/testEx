package br.com.guilhermeoli.testes;

import br.com.guilhermeoli.testes.DAO.ContratoDao;
import br.com.guilhermeoli.testes.DAO.IContratoDao;
import br.com.guilhermeoli.testes.DAO.MOCK.ContratoDaoMock;
import br.com.guilhermeoli.testes.service.ContratoService;
import br.com.guilhermeoli.testes.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author guiol
 */
public class ContratoServiceTest {

    @Test
    public void salvarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String buscar = service.buscar();
        Assert.assertEquals("Sucesso", buscar);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String buscar = service.buscar();
        Assert.assertEquals("Sucesso", buscar);
    }

    @Test
    public void excluirTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String excluir = service.excluir();
        Assert.assertEquals("Sucesso", excluir);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String excluir = service.excluir();
        Assert.assertEquals("Sucesso", excluir);
    }

    @Test
    public void atualizarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String atualizar = service.atualizar();
        Assert.assertEquals("Sucesso", atualizar);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String atualizar = service.atualizar();
        Assert.assertEquals("Sucesso", atualizar);
    }
}
