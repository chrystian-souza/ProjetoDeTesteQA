#language:pt

Funcionalidade: Fazer o cadastro de usuários

  Contexto:
    Dado que o usuário entrou na página Campo de Treinamento

  @Validar_Varios_Campos
  Esquema do Cenario: Apos clicar em Cadastrar deve: Validar campo nome, sobrenome, sexo, comida preferida, escolaridade, esporte, sugestão, cadastro
    Quando o usuário digitar no <campo>
    Então deve apresentar o <resultado>
    Exemplos:
      | campo            | resultado       |
      | Nome             | Chrystian       |
      | Sobrenome        | Souza           |
      | Sugestões        | Nada a declarar |
      | Sexo             | radio           |
      | Comida preferida | checkbox        |
      | Escolaridade     | select          |
      | Esporte          | select          |
      | Cadastrar        | onclick         |






