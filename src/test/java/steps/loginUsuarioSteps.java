package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTeste;
import support.utils;




public class loginUsuarioSteps extends  RunCucumberTeste {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login da Renner$")
    public void que_estou_na_tela_de_login_da_Renner()  {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessarSiteLoja();
    }

    @Dado("^acesso o cadastro de usuario$")
    public void acesso_o_cadastro_de_usuario()  {
        loginPage.preencherCampoEmail(utils.getRandomEmail());
        loginPage.registarUsuario();
    }
}
