package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTeste;

import java.util.Random;

public class utils extends RunCucumberTeste {
    public static void esperarElementoEstarVisivel(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String getRandomEmail(){

        String email_init = "Testando_";
        String email_final ="@Testando.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt( maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }
    public static String emailCliente(){
        String email_cliente = "datumqatest@soprock.com";
        return email_cliente;
    }
    public static String senhaCliente(){
        String senha_cliente = "datum2021";
        return senha_cliente;
    }
    public static String pesquisaProdutoBlouse(){
        String produto_blouse_field = "Blouse";
        return produto_blouse_field;
    }
    public static String ProdutoPrinted(){
        String produto_printed_field = "Printed";
        return  produto_printed_field;
    }
}
