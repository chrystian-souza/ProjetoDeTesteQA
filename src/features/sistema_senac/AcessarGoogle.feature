#language: pt
  Funcionalidade: Acessar Google

    Contexto:
      Dado que o usuário instanciou o chrome-driver

      @basico
      Cenário: Acessar Google
      Dado que o uduário digitou o endereço do Google no navegador
      E que o usuário digitou SENAC Palhoça
      Quando clicar em Entrar
      Então deve apresentar a lista de pesquisa com SENAC Palhoça