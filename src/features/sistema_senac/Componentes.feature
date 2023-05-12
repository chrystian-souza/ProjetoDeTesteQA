#language:pt

Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de treinamento

  @validar_campo_textfield_sobrenome_sugestoes
  Esquema do Cenário: Validar campo textfield, sobrenome, sugestoes
    Quando o usuário digitar <campo>
    Então no campo <componente> deve apresentar a palavra <resultado>
    Exemplos:
      | campo      | componente | resultado  |
      | Batatinha  | textfield  | Batatinha  |
      | Frita      | sobrenome  | Frita      |
      | Batatinhaa | sugestoes  | Batatinhaa |

  @validar_elemento_checkbox_radioButton
  Esquema do Cenário: Validar campo  checkbox
    Quando o usuário digitar <elemento>
    Então no campo <elemento> deve apresentar selecionado
    Exemplos:
      | elemento |
      | radioButton |
      |  checkbox  |



#  @validar_elemento_radio_button
#  Cenário: Validar elemento radioButton
#    Quando o usuário clicar no elemento rádio button
#    Então o elemento rádio button deve aparecer selecionado
#
#  @validar_elemento_checkbox
#  Cenário: Validar elemento checkbox
#    Quando o usuário clicar no elemento checkbox
#    Então o elemento checkbox deve aparecer selecionado