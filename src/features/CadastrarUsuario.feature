#language:pt
  Funcionalidade: Cadastrar usuários

    Contexto:
      Dado que o usuário acessou a modal Cadastrar Usuário

      Cenário: Salvar usuário com todos os campos
        Dado que o usuário preencheu os campos Nome, Nome da Mãe, CPF, Login, Senha
        Quando clicar em Salvar
        Então o usuário deve ser salvo com sucesso
        E deve apresentar a mensagem de feedback Usuário salvo com sucesso!
        E o usuário deve ser apresentado na lista de usuários
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

     Esquema do Cenário: Os campos Nome e Nome da mãe devem conter 256 caracteres no máximo
       Dado que o usuário não preencheu o <campo> com nenhum caracter ou ultrapassou 256 caracteres
       Quando clicar em Salvar
       Então deve apresentar uma mensagem que o <campo> <mensagem>
       Exemplos:
          | campo                         | mensagem
          | o campo Nome                  | deve conter no mínimo 1 e no máximo 256 caracteres
          | o campo Nome da mãe           | deve conter no mínimo 1 e no máximo 256 caracteres
          | os campos Nome e Nome da mãe  | deve conter no mínimo 1 e no máximo 256 caracteres