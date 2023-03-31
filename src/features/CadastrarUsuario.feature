#language:pt
  Funcionalidade: Cadastrar usuários

    Contexto:
      Dado que o usuário acessou a modal Cadastrar Usuário

      Cenário: Salvar usuário com todos os campos
        Dado que o usuário preencheu os campos Nome, Nome da Mãe, CPF, Logim, Senha
        Quando clicar em Salvar
        Então o usuário deve ser salvo com sucesso
        E deve apresentar a mensagem de feedback Usuário salvo com sucesso!
        E o usuário deve ser apreentado na lista de usuários
        E a ação deve ser registrada na auditoria

      Esquema do Cenário: Os campos Nome, Login e Senha são obrigatórios
        Dado que o usuário não preencheu <campo>
        Quando clicar em Salvar
        Então deve apresentar a mensagem de feedback informando que <campo> <mensagem>
        Exemplos:
          | campo                           | mensagem         |
          | o campo Nome                    | é obrigatório    |
          | o campo Login                   | é obrigatório    |
          | o campo Senha                   | é obrigatório    |
          | os campos Nome e Login          | são obrigatórios |
          | os campos Nome e Senha          | são obrigatórios |
          | os campos Login e Senha         | são obrigatórios |
          | os campos Nome, Login e Senha   | são obrigatórios |