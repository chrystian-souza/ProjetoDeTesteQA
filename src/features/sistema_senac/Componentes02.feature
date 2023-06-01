#language:pt

Funcionalidade: Fazer o cadastro de usuário

  Contexto:
    Dado que o usuário entrou na página Campo de Treinamento


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


  @Validar_Regras_De_Negócio

  Esquema do Cenário: Os campos Nome, Sobrenome e Sexo são obrigatórios
    Dado que o usuário não preencheu <campo>
    Quando clicar em Salvar
    Então deve apresentar a mensagem de feedback informando que <campo> <mensagem>
    Exemplos:
      | campo                            | mensagem                 |
      | o campo Nome                     | Nome eh obrigatorio      |
      | o campo Sobrenome                | Sobrenome eh obrigatorio |
      | o campo Sexo                     | Sexo eh obrigatorio      |
      | os campos Nome e Sobrenome       | Nome eh obrigatorio      |
      | os campos Nome e Sexo            | Nome eh obrigatorio      |
      | os campos Sobrenome e Sexo       | Sobrenome eh obrigatorio |
      | os campos Nome, Sobrenome e Sexo | Nome eh obrigatorio      |











