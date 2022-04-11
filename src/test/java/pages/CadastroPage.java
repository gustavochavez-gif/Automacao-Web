package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTeste;
import support.utils;

public class CadastroPage extends RunCucumberTeste {

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");

    private By select_day_field = By.id("days");
    private By select_months_field = By.id("months");
    private By select_years_field = By.id("years");

    private By address_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");
    private By postcode_field = By.id("postcode");
    private By phone_mobile_field = By.id("phone_mobile");

    private By submit_Button_field = By.id("submitAccount");

    private By email_cliente_field = By.id("email");
    private By senha_cliente_field = By.id("passwd");

    private By produto_blouse_field = By.id("search_query_top");
    private By produto_printed_field = By.id("search_query_top");

    private By select_produto_blouse = By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[3]/div/h5/a");
    private By select_produto_printed = By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[5]/div/h5/a");

    public void selectTitle(Integer type){

        utils.esperarElementoEstarVisivel(titleM, 20);
        if (type == 1) {
            getDriver().findElement(By.id("id_gender1")).click();
        }else if (type == 2){
            getDriver().findElement(By.id("id_gender2")).click();
        }
    }
    public void preencherNome(String name){
        getDriver().findElement(first_name_field).sendKeys(name);
    }
    public void preencherSobreNome(String sobrenome){
        getDriver().findElement(last_name_field).sendKeys(sobrenome);
    }
    public void preencherSenha(String senha){
        getDriver().findElement(password_field).sendKeys(senha);
    }
    public void birtday(Integer day, Integer months, String year){
        Select select_day = new Select(getDriver().findElement(select_day_field));
        select_day.selectByIndex(day);
        Select select_months = new Select(getDriver().findElement(select_months_field));
        select_months.selectByIndex(months);
        Select select_year = new Select(getDriver().findElement(select_years_field ));
        select_year.selectByValue(year);
    }
    public void preencherAddress(String address){
        getDriver().findElement(address_field ).sendKeys(address);
    }

    public void preencherCity(String city){
        getDriver().findElement(city_field).sendKeys(city);
    }

    public void selectState(String state){
        Select select_state = new Select(getDriver().findElement(state_field));
        select_state.selectByVisibleText(state);
    }

    public void preencherPostalCode(String postalcode){
        getDriver().findElement(postcode_field).sendKeys(postalcode);
    }

    public void preencherPhoneMobile(String phone){
        getDriver().findElement(phone_mobile_field).sendKeys(phone);
    }

    public void clickButton() {
        getDriver().findElement(submit_Button_field).click();
    }

    public void validaCadastro(String nome, String sobrenome) {
        utils.esperarElementoEstarVisivel(By.className("button-search"), 20);
        String usuario_atual = getDriver().findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a")).getText();
        Assert.assertEquals(nome + " " + sobrenome, usuario_atual);
    }
   public void preencherCampoEmailCliente(String emailCliente){
        getDriver().findElement(email_cliente_field).sendKeys(emailCliente);

   }

    public void preencherCampoSenhaCliente(String senhaCliente){
        getDriver().findElement(senha_cliente_field).sendKeys(senhaCliente);

    }
    public void submeterLogin(){
        getDriver().findElement(By.id("SubmitLogin")).click();
    }

    public void pesquisarproduto(String pesquisaProdutoBlouse) {
        utils.esperarElementoEstarVisivel(By.id("search_query_top"),20);
        getDriver().findElement(produto_blouse_field).sendKeys(pesquisaProdutoBlouse);
        getDriver().findElement(By.className("button-search")).click();
    }

    public void selectProduto(){
        getDriver().findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[3]/div/h5/a")).click();

    }
    public void addProduto(){
        getDriver().findElement(By.id("add_to_cart")).click();

    }

    public void confirmoPedidoSacola(){
        utils.esperarElementoEstarVisivel(By.linkText("Proceed to checkout"),20);
        getDriver().findElement(By.linkText("Proceed to checkout")).click();

    }
    public void confirmoProdutoSumary(){
        utils.esperarElementoEstarVisivel(By.linkText("Proceed to checkout"),30);
        getDriver().findElement(By.linkText("Proceed to checkout")).click();

    }

    public void confirmoProdutoAddrees(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 400)");

        utils.esperarElementoEstarVisivel(By.name("processAddress"),30);
        getDriver().findElement(By.name("processAddress")).click();

    }
    public void confirmoProdutoShipping(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 200)");

        getDriver().findElement(By.id("cgv")).click();
        utils.esperarElementoEstarVisivel(By.name("processCarrier"),20);
        getDriver().findElement(By.name("processCarrier")).click();


    }
    public void confirmoProdutoPayment(){
        utils.esperarElementoEstarVisivel(By.id("step_end"),20);
        getDriver().findElement(By.id("step_end")).click();

    }
    //comprar-produtos-Printed_Dress
    public void pesquisarProdutoPrinted(String ProdutoPrinted){
        utils.esperarElementoEstarVisivel(By.id("search_query_top"),20);
        getDriver().findElement(produto_printed_field).sendKeys(ProdutoPrinted);
        getDriver().findElement(By.className("button-search")).click();
    }

    public void selectProdutoPrinted(){
        getDriver().findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[5]/div/h5/a")).click();

    }
    public void addProdutoPrinted(){
        getDriver().findElement(By.id("add_to_cart")).click();

    }
    public void confirmoPedidoSacolaPrinted(){
        utils.esperarElementoEstarVisivel(By.linkText("Proceed to checkout"),20);
        getDriver().findElement(By.linkText("Proceed to checkout")).click();

    }
    public void confirmoProdutoComprar(){
        utils.esperarElementoEstarVisivel(By.linkText("Proceed to checkout"),30);
        getDriver().findElement(By.linkText("Proceed to checkout")).click();

    }

    public void confirmoProdutoEndereco(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
         jse.executeScript("window.scrollTo(0, 400)");

        utils.esperarElementoEstarVisivel(By.name("processAddress"),30);
        getDriver().findElement(By.name("processAddress")).click();

    }
    public void confirmoProdutoEnviar(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 300)");

        getDriver().findElement(By.id("cgv")).click();
        utils.esperarElementoEstarVisivel(By.name("processCarrier"),20);
        getDriver().findElement(By.name("processCarrier")).click();


    }
    public void confirmoProdutoPagamento(){
        utils.esperarElementoEstarVisivel(By.id("step_end"),20);
        getDriver().findElement(By.id("step_end")).click();

    }
    public void PagamentoCartao(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 500)");

        getDriver().findElement(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a")).click();

    }
    public void ConfirmoPagamentoCartao(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 600)");

        getDriver().findElement(By.cssSelector("#cart_navigation > button > span")).click();

    }

    public void PagamentoCheque(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 600)");

        getDriver().findElement(By.cssSelector("#HOOK_PAYMENT > div:nth-child(2) > div > p > a")).click();

    }
    public void ConfirmoPagamentoCheque(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 600)");

        getDriver().findElement(By.cssSelector("#cart_navigation > button > span")).click();

    }
}