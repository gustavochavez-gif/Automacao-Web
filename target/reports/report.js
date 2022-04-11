$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastroUsuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "Realizar cadastro novo usuario",
  "description": "Eu como cliente desejo me cadastrar no automationpractice.com\r\nQuero  fazer  compras de produtos\r\nPara que  eu possa me vestir melhor",
  "id": "realizar-cadastro-novo-usuario",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 9,
  "name": "Cadastrar usuario no site da Renner com sucesso",
  "description": "",
  "id": "realizar-cadastro-novo-usuario;cadastrar-usuario-no-site-da-renner-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@cadastro-cliente"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou na tela de login da Renner",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "acesso o cadastro de usuario",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu preencho o formulario do cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "vejo a tela de cadastro realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "loginUsuarioSteps.que_estou_na_tela_de_login_da_Renner()"
});
formatter.result({
  "duration": 7940152700,
  "status": "passed"
});
formatter.match({
  "location": "loginUsuarioSteps.acesso_o_cadastro_de_usuario()"
});
formatter.result({
  "duration": 146627000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.eu_preencho_o_formulario_do_cadastro()"
});
formatter.result({
  "duration": 3831848900,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.clico_em_registrar()"
});
formatter.result({
  "duration": 1740061100,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.vejo_a_tela_de_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "duration": 71287400,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Selecionar e comprar produtos da Renner",
  "description": "",
  "id": "realizar-cadastro-novo-usuario;selecionar-e-comprar-produtos-da-renner",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 17,
      "name": "@comprar-produtos-Blouse"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "que estou na tela de login da Renner",
  "keyword": "Dado "
});
formatter.step({
  "line": 20,
  "name": "eu preencho campo e-mail",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "eu preencho campo  senha",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "clico em acessar",
  "keyword": "Quando "
});
formatter.step({
  "line": 23,
  "name": "pesquiso por Blouse",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "seleciono produto a comprar blouse",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "add o produto ao carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "confirmo pedido sacola",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "confirmo produto summary",
  "keyword": "E "
});
formatter.step({
  "line": 28,
  "name": "confirmo a ordem do pedido Addrees",
  "keyword": "E "
});
formatter.step({
  "line": 29,
  "name": "confirmo a ordem do pedido Shipping",
  "keyword": "E "
});
formatter.step({
  "line": 30,
  "name": "confirmo a ordem do pedido payment",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "escolho forma de pagamento cartao",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "confirmo a ordem da compra",
  "keyword": "E "
});
formatter.match({
  "location": "loginUsuarioSteps.que_estou_na_tela_de_login_da_Renner()"
});
formatter.result({
  "duration": 5648936800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.eu_preencho_campo_e_mail()"
});
formatter.result({
  "duration": 69083200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.eu_preencho_campo_senha()"
});
formatter.result({
  "duration": 71119800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.clico_em_acessar()"
});
formatter.result({
  "duration": 4139431400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.pesquiso_por_Blouse()"
});
formatter.result({
  "duration": 2476109800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.seleciono_produto_a_comprar_blouse()"
});
formatter.result({
  "duration": 4704234100,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.add_o_produto_ao_carrinho()"
});
formatter.result({
  "duration": 51322800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_pedido_sacola()"
});
formatter.result({
  "duration": 4019011500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_produto_summary()"
});
formatter.result({
  "duration": 1794327900,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_a_ordem_do_pedido_Addrees()"
});
formatter.result({
  "duration": 1593153400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_a_ordem_do_pedido_Shipping()"
});
formatter.result({
  "duration": 3249349400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_a_ordem_do_pedido_payment()"
});
formatter.result({
  "duration": 77061800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.escolho_forma_de_pagamento_cartao()"
});
formatter.result({
  "duration": 1414129000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_a_ordem_da_compra()"
});
formatter.result({
  "duration": 3904276800,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Selecionar e comprar produtos da Renner",
  "description": "",
  "id": "realizar-cadastro-novo-usuario;selecionar-e-comprar-produtos-da-renner",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 34,
      "name": "@comprar-produtos-Printed_Dress"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "que estou na tela de login da Renner",
  "keyword": "Dado "
});
formatter.step({
  "line": 37,
  "name": "eu preencho campo e-mail",
  "keyword": "E "
});
formatter.step({
  "line": 38,
  "name": "eu preencho campo  senha",
  "keyword": "E "
});
formatter.step({
  "line": 39,
  "name": "clico em acessar",
  "keyword": "Quando "
});
formatter.step({
  "line": 40,
  "name": "pesquiso por Printed Dress",
  "keyword": "E "
});
formatter.step({
  "line": 41,
  "name": "seleciono produto a comprar printed",
  "keyword": "E "
});
formatter.step({
  "line": 42,
  "name": "add o produto ao carrinho de compras",
  "keyword": "E "
});
formatter.step({
  "line": 43,
  "name": "confirmo pedido sacola de compras",
  "keyword": "E "
});
formatter.step({
  "line": 44,
  "name": "confirmo produto a comprar",
  "keyword": "E "
});
formatter.step({
  "line": 45,
  "name": "confirmo a ordem do pedido  conforme Addrees",
  "keyword": "E "
});
formatter.step({
  "line": 46,
  "name": "confirmo a ordem do pedido  conforme Shipping",
  "keyword": "E "
});
formatter.step({
  "line": 47,
  "name": "confirmo a ordem do pedido conforme payment",
  "keyword": "E "
});
formatter.step({
  "line": 48,
  "name": "escolho forma de pagamento cheque",
  "keyword": "E "
});
formatter.step({
  "line": 49,
  "name": "confirmo a ordem do meu pedido",
  "keyword": "E "
});
formatter.match({
  "location": "loginUsuarioSteps.que_estou_na_tela_de_login_da_Renner()"
});
formatter.result({
  "duration": 5571645000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.eu_preencho_campo_e_mail()"
});
formatter.result({
  "duration": 69622800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.eu_preencho_campo_senha()"
});
formatter.result({
  "duration": 75751200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.clico_em_acessar()"
});
formatter.result({
  "duration": 4076390000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.pesquiso_por_Printed_Dress()"
});
formatter.result({
  "duration": 2521550700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.seleciono_produto_a_comprar_printed()"
});
formatter.result({
  "duration": 1998034900,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.add_o_produto_ao_carrinho_de_compras()"
});
formatter.result({
  "duration": 47845900,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_pedido_sacola_de_compras()"
});
formatter.result({
  "duration": 3434455000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_produto_a_comprar()"
});
formatter.result({
  "duration": 2477968800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_a_ordem_do_pedido_conforme_Addrees()"
});
formatter.result({
  "duration": 1224697000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_a_ordem_do_pedido_conforme_Shipping()"
});
formatter.result({
  "duration": 2614809700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_a_ordem_do_pedido_conforme_payment()"
});
formatter.result({
  "duration": 81530200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.escolho_forma_de_pagamento_cheque()"
});
formatter.result({
  "duration": 2250559500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.confirmo_a_ordem_do_meu_pedido()"
});
formatter.result({
  "duration": 5318293600,
  "status": "passed"
});
});