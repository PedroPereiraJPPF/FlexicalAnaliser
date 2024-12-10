***Analisador Léxico para OWL com Manchester Syntax***

Este projeto toma como objetivo implementar um analisador léxico da
linguagem OWL2 (Web Ontology Language) da sua forma de Manchester Syntax
com suas instruções simplificadas.

**Sumário**

-   Ferramentas utilizadas

-   Analisador Léxico

-   Como usar?

**Ferramentas Utilizadas**

Nesse projeto decidimos utilizar a linguagem de programação Java em sua
versão 21, pois é a versão mais atual marcada como LTS (Long-Term
Support), o que significa que será utilizável por um longo período de
tempo. Foi utilizada a IDE Visual Studio Code (VSCode) com sua extensão
"extension pack for java" para poder utilizar o java.

Utilizamos também o Apache Maven, um gerenciador de projetos
primariamente utilizado para projetos em Java, ele é responsável por
permitir o uso da terceira ferramenta vital a este projeto, o JFlex.

JFlex é um gerador de analisadores léxicos em Java, criado
especificamente para auxiliar em projetos como este, ele é responsável
por ler e interpretar as expressões regulares que os desenvolvedores
criaram para definir a linguagem.+ Este não precisará ser instalado,
pois o Maven já fará isso automaticamente.

O git foi utilizado para acessar os arquivos salvos na internet, bem
como para versionamento do código. Ele será necessário para acessar o
programa.

Links para guias de instalação:

-   JDK 21 (Java):
    > [[Windows]{.underline}](https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-install-Java-21)
    > e
    > [[Linux]{.underline}](https://www.hostinger.com.br/tutoriais/como-instalar-java-no-ubuntu).

-   [[Apache
    > Maven]{.underline}](https://medium.com/@januario86/o-que-%C3%A9-o-maven-e-como-instalar-1d5e9f29ac4c)

-   [[Visual Studio
    > Code]{.underline}](https://code.visualstudio.com/download)

-   [[Git]{.underline}](https://git-scm.com/book/pt-br/v2/Come%C3%A7ando-Instalando-o-Git)

**Analisador Léxico**

O analisador léxico produzido é capaz de reconhecer um grupo
pré-definido de lexemas, dentre eles estão algumas palavras reservadas,
caracteres especiais, nomes de classes, entre outros.\
O armazenamento dos lexemas e símbolos foi feito em um mapa, com o
objetivo de organizar automaticamente os lexemas, eles estão organizados
em ordem alfabética.\
O código se encontra separado em três partes, o arquivo main.jflex que
contém as declarações de todas as regex e as instruções de como seguir
ao encontrar cada caso delas, o arquivo Lexer.java que foi gerado
automaticamente pelo JFlex a partir do main.jflex e contém todas as
instruções para o java interpretar o arquivo .jflex, e o Main.java que
chama os métodos do lexer, o executa e exibe os resultados.\
Há mais um arquivo, o input.txt, que é o arquivo que será lido e
analisado pelo interpretador, mas ele não possui nenhuma particularidade
além de ter de ser escrito em OWL 2 com Manchester Syntax para ser
devidamente interpretado.

**Como Usar?**

Supondo que tenha-se todos os programas requeridos já instalados, siga o
passo a passo a seguir:

1.  Clone o seguinte repositório do github através do git clone ou
    > baixe-o diretamente.

2.  Abra o diretório com o VSCode.

3.  Coloque no arquivo input.txt o texto que quiser que seja analisado.

4.  Entre no arquivo Main.java e rode o programa.

5.  O programa produzirá um grande texto no terminal, esse texto é
    > separado em três partes: A contagem de ocorrências, que conta o
    > número de ocorrências de cada lexema; a tabela de símbolos, que
    > exibe quais símbolos de cada lexema foram encontrados; e a barra
    > de busca, onde você pode digitar o nome de qualquer lexema (de
    > acordo com a nomenclatura encontrada nas outras tabelas) e obter a
    > parte da tabela de símbolos daquele lexema.

6.  Digite "sair" na barra de busca para encerrar o programa.
