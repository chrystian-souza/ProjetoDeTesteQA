#language:pt

Funcionalidade: Acessar vários componentes html

  @Validar_Varios_Campos
  Esquema do Cenario:  Validar campo nome, sobrenome, sexo, comida preferida, escolaridade, esporte, sugestão
    Quando o usuário digitar ou selecionar <campo>
    Então no campo <componente> deve apresentar o <resultado>
    Exemplos:
      | campo            | componente | resultado  |
      | Nome             | textfield  | Chrystian  |
      | Sobrenome        | sobrenome  | Souza      |
      | Aula legal       | textarea   | Aula legal |
      | Sexo             | radio      | radio      |
      | Comida preferida | checkbox   | checkbox   |
      | Escolaridade     | select     | select     |
      | Esporte          | select     | select     |

