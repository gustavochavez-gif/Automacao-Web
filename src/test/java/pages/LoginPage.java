package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTeste;

public class LoginPage extends RunCucumberTeste {

    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");

    public void acessarSiteLoja() {
        getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        //getDriver().findElement(By.linkText("Sign in")).click();
        //utils.esperarElementoEstarVisivel(create_email_button, 20);
    }
    public void preencherCampoEmail(String randomEmail) {
        getDriver().findElement(create_email_field).sendKeys(randomEmail);
    }
    public void registarUsuario() {
        getDriver().findElement(create_email_button).click();
    }
}
