package validartitulo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BradescoTeste {

	Metodos metodos = new Metodos();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("https://www.bradesco.com.br");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
