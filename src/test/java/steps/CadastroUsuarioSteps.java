package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTeste;
import support.utils;

public class CadastroUsuarioSteps extends RunCucumberTeste {

   CadastroPage  cadastropage = new CadastroPage();

   String nome = "Peter";
   String sobrenome = "Mello";

    @Quando("^eu preencho o formulario do cadastro$")
    public void eu_preencho_o_formulario_do_cadastro()  {
        cadastropage.selectTitle( 1);
        cadastropage.preencherNome(nome);
        cadastropage.preencherSobreNome(sobrenome);
        cadastropage.preencherSenha("aAHjh20221201@");
        cadastropage.birtday(23, 10,"2000");
        cadastropage.preencherAddress("Rua Fernando Carl, Bairro nova vida,");
        cadastropage.preencherCity("Osasco");
        cadastropage.selectState("Iowa");
        cadastropage.preencherPostalCode("10230");
        cadastropage.preencherPhoneMobile("+55062994347125");
    }
    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastropage.clickButton();
    }
    @Entao("^vejo a tela de cadastro realizado com sucesso$")
    public void vejo_a_tela_de_cadastro_realizado_com_sucesso()  {
        cadastropage.validaCadastro(nome, sobrenome);
    }
    @Dado("^eu preencho campo e-mail$")
    public void eu_preencho_campo_e_mail()  {
        cadastropage.preencherCampoEmailCliente(utils.emailCliente());
    }

    @Dado("^eu preencho campo  senha$")
    public void eu_preencho_campo_senha() {
        cadastropage.preencherCampoSenhaCliente(utils.senhaCliente());
    }
    @Quando("^clico em acessar$")
    public void clico_em_acessar()  {
        cadastropage.submeterLogin();
    }

    @Quando("^pesquiso por Blouse$")
    public void pesquiso_por_Blouse()  {
       cadastropage.pesquisarproduto(utils.pesquisaProdutoBlouse());
    }

    @Quando("^seleciono produto a comprar blouse$")
    public void seleciono_produto_a_comprar_blouse()  {
        cadastropage.selectProduto();
    }
    @Quando("^add o produto ao carrinho$")
    public void add_o_produto_ao_carrinho()  {
        cadastropage.addProduto();
    }

    @Quando("^confirmo pedido sacola$")
    public void confirmo_pedido_sacola()  {
        cadastropage.confirmoPedidoSacola();
    }
    @Quando("^confirmo produto summary$")
    public void confirmo_produto_summary()  {
        cadastropage.confirmoProdutoSumary();
    }

    @Quando("^confirmo a ordem do pedido Addrees$")
    public void confirmo_a_ordem_do_pedido_Addrees()  {
        cadastropage.confirmoProdutoAddrees();
    }

    @Quando("^confirmo a ordem do pedido Shipping$")
    public void confirmo_a_ordem_do_pedido_Shipping()  {
        cadastropage.confirmoProdutoShipping();
    }

    @Quando("^confirmo a ordem do pedido payment$")
    public void confirmo_a_ordem_do_pedido_payment()  {
       cadastropage.confirmoProdutoPayment();
    }

    //comprar-produtos-Printed_Dress
    @Quando("^pesquiso por Printed Dress$")
    public void pesquiso_por_Printed_Dress()  {
        cadastropage.pesquisarProdutoPrinted(utils.ProdutoPrinted());
    }
    @Quando("^seleciono produto a comprar printed$")
    public void seleciono_produto_a_comprar_printed()  {
         cadastropage.selectProdutoPrinted();
    }


    @Quando("^add o produto ao carrinho de compras$")
    public void add_o_produto_ao_carrinho_de_compras()  {
        cadastropage.addProdutoPrinted();
    }

    @Quando("^confirmo pedido sacola de compras$")
    public void confirmo_pedido_sacola_de_compras()  {
        cadastropage.confirmoPedidoSacolaPrinted();
    }

    @Quando("^confirmo produto a comprar$")
    public void confirmo_produto_a_comprar()  {
        cadastropage.confirmoProdutoComprar();
    }

    @Quando("^confirmo a ordem do pedido  conforme Addrees$")
    public void confirmo_a_ordem_do_pedido_conforme_Addrees()  {
        cadastropage.confirmoProdutoEndereco();
    }

    @Quando("^confirmo a ordem do pedido  conforme Shipping$")
    public void confirmo_a_ordem_do_pedido_conforme_Shipping()  {
        cadastropage.confirmoProdutoEnviar();
    }

    @Quando("^confirmo a ordem do pedido conforme payment$")
    public void confirmo_a_ordem_do_pedido_conforme_payment()  {
        cadastropage.confirmoProdutoPagamento();
    }

    @Quando("^escolho forma de pagamento cartao$")
    public void escolho_forma_de_pagamento_cartao()  {
       cadastropage.PagamentoCartao();
    }

    @Quando("^confirmo a ordem da compra$")
    public void confirmo_a_ordem_da_compra()  {
        cadastropage.ConfirmoPagamentoCartao();
    }

    @Quando("^escolho forma de pagamento cheque$")
    public void escolho_forma_de_pagamento_cheque()  {
        cadastropage.PagamentoCheque();
    }

    @Quando("^confirmo a ordem do meu pedido$")
    public void confirmo_a_ordem_do_meu_pedido()  {
       cadastropage.ConfirmoPagamentoCheque();
    }
}
