package validartitulo;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validarTitulo {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		boolean chrome = false;
		boolean firefox = false;
		boolean edge = true;

		if (chrome) {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://casasbahia.com.br");
			driver.manage().window().maximize();

		} else if (firefox) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://casasbahia.com.br");
			driver.manage().window().maximize();

		} else if (edge) {

			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://casasbahia.com.br");
			driver.manage().window().maximize();
		}
	}

	@After
	public void tearDown() throws Exception {

		driver.quit();
	}

	@Test
	public void test() {
		String tituloPagina = driver.getTitle();
		System.out.println(tituloPagina);
		assertEquals(
				"Casas Bahia: Produtos para sua casa, de tecnologia, móveis, eletrodomésticos e muito mais você encontra aqui!",
				tituloPagina);

	}

	@Test
	public void testUrl() {
		String urlPagina = driver.getCurrentUrl();
		System.out.println(urlPagina);
		assertEquals("https://www.casasbahia.com.br/", urlPagina);

	}

	public void screnShot(String nome) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);
		screnShot(nome);
	}

}