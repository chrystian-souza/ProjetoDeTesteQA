#language:pt

Funcionalidade: Fazer o cadastro de usuários

  Contexto:
    Dado que o usuário entrou na página Campo de Treinamento

#  @Validar_Varios_Campos
##  Esquema do Cenario: Apos clicar em Cadastrar deve validar: campo nome, sobrenome, sexo, comida preferida, escolaridade, esporte, sugestão
##    Quando o usuário digitar no <campo>
##    Então deve apresentar o <resultado>
##    Exemplos:

#      | campo            | resultado       |
#      | Cadastrar        | onclick         |
#      | Nome             | Chrystian       |
#      | Sobrenome        | Souza           |
#      | Sugestões        | Nada a declarar |
#      | Sexo             | radio           |
#      | Comida preferida | checkbox        |
#      | Escolaridade     | select          |
#      | Esporte          | select          |


  @Validar_Varios_Campos
  Esquema do Cenario: Quando clicar em Cadastrar deve validar: campo nome, sobrenome, sexo, comida preferida, escolaridade, esporte, sugestão
    Dado que foi preenchido o formulario
    Quando o usuário clicar no botao de cadastrar
    Então deve validar <campo> <resultado>
    Exemplos:

      | campo            | resultado       |
      | Nome             | Chrystian       |
      | Sobrenome        | Souza           |
      | Sexo             | radio           |
      | Comida preferida | checkbox        |
      | Escolaridade     | select          |
      | Esporte          | select          |
      | Sugestões        | Nada a declarar |






