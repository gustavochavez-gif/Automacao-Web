#Datum Testing Java Web
Este projeto tem como finalidade realizar testes automatizados no website de uma loja de roupas.
Testes na plataforma Web.

##**Tecnologias a serem utilizadas:

==>**Java**:Java é uma linguagem de programação e um ambiente computacional criado pela Sun Microsystems na década de 90, sendo posteriormente adquirido pela Oracle.

Devido a possibilidade de escrever o código apenas uma vez e rodá-lo em diferentes dispositivos, a tecnologia logo se tornou popular, passando a ser implementada em praticamente qualquer lugar, desde sites e computadores até datacenters, celulares, calculadoras, videogames, etc.omo linguagem de programação, o código Java é baseado em classes e orientado a objetos, com foco em segurança, portabilidade e alta performance.

Também tem como principais características uma sintaxe similar a C/C++, extensa biblioteca de rotinas e APIs para trabalhar com recursos de rede, e um poderoso gerenciamento automático de memória.

Diferente de outras linguagens de programação, o software não é compilado em “código nativo” para ser executado diretamente pelo computador, mas sim em um código intermediário chamado “bytecode”, que então é interpretado e executado pela máquina virtual Java (JVM, na sigla em inglês).

==>**Cucumber**:Começando pela definição, Cucumber é uma ferramenta que suporta BDD, que é o acrônimo para Behavior Driven Development, ou seja, Desenvolvimento Orientado por Comportamento.

==>**Ide Intellij**:A plataforma IntelliJ é uma plataforma OSS desenvolvida pela JetBrains para criar IDEs e ferramentas de desenvolvedor com reconhecimento de linguagem. Ela é usada pelo IntelliJ IDEA, Android Studio, CUBA Studio e Cursive, apenas para citar alguns. Construída em Java, ela fornece uma abordagem entre plataformas à construção de ferramentas para qualquer linguagem, seja para a JVM ou não. Ela está disponível sob uma licença Apache 2.0, permitindo a criação de produtos comerciais e não comerciais isentos de royalties, incluindo IDEs e plug-ins completos.

==>**SO**.:windows 10x

##**Requisitos para Executar os Testes**:
==> Java 1.8
==>Maven
==> Navegadores:
==>Chromedriver
==>Geckodriver
==>Privilegio do Admin da maquina para instalar ferramentas e dependencias.
==> Dependencias do maven, cucumber, selenium webdriver

##**Configuração de Ambiente(Windows):
-Download e instalação Ide Intellij
-Download e instalação Chromedriver
-Download e instalaçãoGeckodrover
-Download e instalação GiT bash
-Download e instalação das dependencias e alocar na pasta pom.xml

## Primeiros passos para executar o projeto
-Baixar o projeto do repositorio para sua maquina local.
-Abra o projeto atraves da IDe intellij.
## Como executar o projeto/cenários:
-Rodar direitamente da IDE atraves do arquivo RunCucumber Teste, adicionando a tags na seguinte linha de codigo  tags = {"~@ignore"}, exemplo :  tags = {"@cadastro-cliente"}.
-Rodar atraves da terminar pela linha de comando "mvn teste -Dtest=**/RunCucumberTeste" sim report
-Rodar atraves da terminar pela linha de comando "mvn teste -Dtest=**/RunCucumberTeste-cluecucumber-report:reporting" com report