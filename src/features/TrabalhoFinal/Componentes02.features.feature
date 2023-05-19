#language:pt

Funcionalidade: Acessar vários componentes html

    @Validar_Varios_Campos
    Esquema do Cenario:  Validar campo nome, sobrenome, sexo, comida preferida, escolaridade, esporte, sugestão
    Quando o usuário digitar ou selecionar <campo>
    Então no campo <componente> deve apresentar o <resultado>
    Exemplos:
    | campo             | componente | resultado  |
    | Chrystian         | textfield  | Batatinha  |
    | Souza             | sobrenome  | Souza      |
    | Aula legal        | textarea   | Aula legal |
    | sexo              | radio      | radio      |
    | comida preferida  | checkbox   | checkbox   |
    | escolaridade      | select     | select     |
    | esporte           | select     | select     |

