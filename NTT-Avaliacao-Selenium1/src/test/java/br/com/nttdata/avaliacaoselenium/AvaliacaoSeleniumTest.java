package br.com.nttdata.avaliacaoselenium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AvaliacaoSeleniumTest {

    @Test
    public void pesquisaVaga() {
        System.setProperty("webdriver.chrome.driver", "/C:/Users/kandress/OneDrive - NTT DATA EMEAL/Documentos/Curso de Automação/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9222");
        browser.navigate().to("https://www.google.com.br/");
        browser.findElement(By.cssSelector("textarea.gLFyf")).clear();
        browser.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("NTT DATA");
        browser.findElement(By.cssSelector("textarea.gLFyf")).sendKeys(Keys.RETURN);
        browser.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
        browser.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        browser.switchTo().frame("ifrmCookieBanner");
        browser.findElement(By.xpath("//div[@class='sp-cookie-banner-3']/button[2]")).click();
        browser.switchTo().defaultContent();
        browser.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
        browser.findElement(By.xpath("//li[@class='navbar-list-item']/a[@href='https://careers.emeal.nttdata.com/s/jobs?language=pt_BR&pcountry=Brasil']")).click();
        browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //browser.switchTo().window("Jobs");

        List<String> abas = new ArrayList<>(browser.getWindowHandles());
        //System.out.println(abas.size());
        browser.switchTo().window(abas.get(1));
        //browser.switchTo().window(browser.getWindowHandle());
        browser.switchTo().frame("ifrmCookieBanner");
        browser.findElement(By.xpath("//div[@class='sp-cookie-banner-3']/button[2]")).click();
        browser.switchTo().defaultContent();
        browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        browser.findElement(By.id("sGlobal")).sendKeys("PESSOA ENGENHEIRA DE DADOS - HÍBRIDO");
        browser.findElement(By.id("sGlobal")).sendKeys(Keys.RETURN);
        Assert.assertEquals("PESSOA ENGENHEIRA DE DADOS - HÍBRIDO", browser.findElement(By.xpath("//a[contains(text(),'Pessoa Engenheira de Dados')]")).getText());







    }

}