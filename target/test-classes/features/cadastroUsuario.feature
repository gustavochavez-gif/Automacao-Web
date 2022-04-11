#language:pt

Funcionalidade: Realizar cadastro novo usuario
  Eu como cliente desejo me cadastrar no automationpractice.com
  Quero  fazer  compras de produtos
  Para que  eu possa me vestir melhor

  @cadastro-cliente
  Cenario: Cadastrar usuario no site da Renner com sucesso
    Dado que estou na tela de login da Renner
    E acesso o cadastro de usuario
    Quando eu preencho o formulario do cadastro
    E clico em registrar
    Entao vejo a tela de cadastro realizado com sucesso


  @comprar-produtos-Blouse
  Cenario: Selecionar e comprar produtos da Renner
    Dado que estou na tela de login da Renner
    E eu preencho campo e-mail
    E eu preencho campo  senha
    Quando  clico em acessar
    E pesquiso por Blouse
    E seleciono produto a comprar blouse
    E add o produto ao carrinho
    E confirmo pedido sacola
    E confirmo produto summary
    E confirmo a ordem do pedido Addrees
    E confirmo a ordem do pedido Shipping
    E confirmo a ordem do pedido payment
    E escolho forma de pagamento cartao
    E confirmo a ordem da compra

  @comprar-produtos-Printed_Dress
  Cenario: Selecionar e comprar produtos da Renner
    Dado que estou na tela de login da Renner
    E eu preencho campo e-mail
    E eu preencho campo  senha
    Quando  clico em acessar
    E pesquiso por Printed Dress
    E seleciono produto a comprar printed
    E add o produto ao carrinho de compras
    E confirmo pedido sacola de compras
    E confirmo produto a comprar
    E confirmo a ordem do pedido  conforme Addrees
    E confirmo a ordem do pedido  conforme Shipping
    E confirmo a ordem do pedido conforme payment
    E escolho forma de pagamento cheque
    E confirmo a ordem do meu pedido