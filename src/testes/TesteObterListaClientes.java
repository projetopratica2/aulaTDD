package testes;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dados.ClienteDAO;
import basicas.Cliente;

public class TesteObterListaClientes {

	private ClienteDAO clienteDAO;
	
	@Before
	public void setUp(){
		this.clienteDAO = new ClienteDAO();
	}
	
	@Test
	public void testObterListaClientesCadastrados() {
		
		List<Cliente> colecao = clienteDAO.consultarClientes();
		assertEquals(0, colecao.size());
	}
	

}
