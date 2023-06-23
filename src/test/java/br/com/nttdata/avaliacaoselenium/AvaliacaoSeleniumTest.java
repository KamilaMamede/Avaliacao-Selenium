package br.com.nttdata.avaliacaoselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AvaliacaoSeleniumTest {

    @Test
    public void pesquisaVaga() {
        System.setProperty("webdriver.chrome.driver", "/C:/Users/kandress/OneDrive - NTT DATA EMEAL/Documentos/Curso de Automação/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://www.google.com.br/");
        browser.findElement(By.cssSelector("textarea.gLFyf")).clear();
        browser.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("NTT DATA");
        browser.findElement(By.cssSelector("textarea.gLFyf")).sendKeys(Keys.RETURN);
        browser.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
        browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //browser.findElement(By.xpath("//*[@id=\"grouped-pageload-Banner\"]/div/div/div/div[3]/button[2]")).click();
        //browser.findElement(By.cssSelector(".navbar-link.has-children.text-hidden, .navbar-link.is-search.text-hidden")).click();
        browser.findElement(By.cssSelector(".navbar-list.level-0>.navbar-list-item>.navbar-link:not(.btn):before")).click();

       /* browser.navigate().to("https://br.nttdata.com/");
        browser.findElement(By.cssSelector("navbar-link is-active")).click();*/

    }

}