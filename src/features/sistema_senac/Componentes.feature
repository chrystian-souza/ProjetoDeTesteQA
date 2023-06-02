##language:pt
#
#Funcionalidade: Acessar vários componentes html
#
#  Contexto:
#    Dado que o usuário acessou o arquivo Campo de treinamento
#  @validar_campo_textfield_sobrenome_sugestoes
#
#  Esquema do Cenário: Validar campo textfield, sobrenome, sugestoes
#    Quando o usuário digitar <campo>
#    Então no campo <componente> deve apresentar a palavra <resultado>
#    Exemplos:
#      | campo      | componente | resultado  |
#      | Batatinha  | textfield  | Batatinha  |
#      | Frita      | sobrenome  | Frita      |
#      | Batatinhaa | sugestoes  | Batatinhaa |
#
#  @validar_elemento_radio_button_checkbox
#  Esquema do Cenário: Validar campo checkbox e radioButton
#    Quando o usuário clicar no elemento <clicar>
#    Então o elemento <elemento> deve aparecer selecionado
#    Exemplos:
#      | clicar       | elemento     |
#      | rádio button | rádio button |
#      | checkbox     | checkbox     |
#
#  @Validar_Varios_Campos
#  Esquema do Cenario:  Validar campo nome, sobrenome, sexo, comida preferida, escolaridade, esporte, sugestão
#    Quando o usuário digitar ou selecionar <campo>
#    Então no campo <componente> deve apresentar o <resultado>
#    Exemplos:
#      | campo             | componente | resultado  |
#      | Chrystian         | textfield  | Batatinha  |
#      | Souza             | sobrenome  | Souza      |
#      | Aula legal        | textarea   | Aula legal |
#      | sexo              | radio      | radio      |
#      | comida preferida  | checkbox   | checkbox   |
#      | escolaridade      | select     | select     |
#      | esporte           | select     | select     |
#
#
#
#
#
#
##  @validar_elemento_radio_button
##  Cenário: Validar elemento radioButton
##    Quando o usuário clicar no elemento rádio button
##    Então o elemento rádio button deve aparecer selecionado
##
##  @validar_elemento_checkbox
##  Cenário: Validar elemento checkbox
##    Quando o usuário clicar no elemento checkbox
##    Então o elemento checkbox deve aparecer selecionado