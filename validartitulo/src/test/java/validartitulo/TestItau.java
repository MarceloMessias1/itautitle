package validartitulo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestItau {
	Metodos metodos = new Metodos();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("https://www.itau.com.br");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

	}

}
