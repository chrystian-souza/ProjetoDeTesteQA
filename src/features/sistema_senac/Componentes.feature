#language:pt

Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de treinamento

  Cenário: Validar campo textfield
    Quando o usuário digitar Batatinha
    Então  no campo textfield deve apresentar a palavra Batatinha

  Cenário: Validar campo sobrenome
    Quando o usuário digitar Frita
    Então no campo sobrenome deve apresentar a palavra Frita