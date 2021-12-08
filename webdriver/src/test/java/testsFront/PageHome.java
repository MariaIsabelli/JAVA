package testsFront;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageHome {
	private WebDriver driver;
	@Test
	public void testNavegarPaginaHome() {
		System.setProperty("webdriver.chrome.driver","c:\\programa Files\\chrome-driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	    
	    driver.findElement(By.className("glFyf")).sendKeys("Senai");
	    driver.findElement(By.className("glFyf")).sendKeys("Keys.ENTER");
	    driver.findElement(By.className("LC20lb")).click();
	    driver.findElement(By.id("idControle_0")).click();
	    driver.findElement(By.id("ct100_Header1_MenuSuperior1_rptMenuLateral_ct100_rptMenu_ct105_linkMenu")).click();
	    driver.findElement(By.id("oqEstabuscando")).click();
	    driver.findElement(By.id("oqEstabuscando")).sendKeys("técnico");
	    driver.findElement(By.className("btnBuscaJavaScript")).click();
	    driver.findElement(By.id("ct100_cp_lv_ctrl7_inkTitu")).click();
	    driver.findElement(By.xpath("//*[@id=\"ct100_cp_lv_ctrl1_lnkTitu\"]"/span")).click();"
	    
	    public void fecharNavegador(WebDriver driver ) {
	    	driver.quit();
	    }	
	    		
	   public void navegarParaNovaaba() {		
	    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    	driver.switchTo().window(tabs.get(1));
	    	driver.findElement(By.id("inkCaseBtn")).click();
	    	driver.switchTo().window(tabs.get(2));
	    	try {
	    	Thread.sleep(2000);
	    }catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	    
	}
	   public void fechar() throws Exception{
		   driver.quit();
	   }
	    
	  

}
	 
