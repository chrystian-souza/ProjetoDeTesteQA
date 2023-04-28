#language:pt
#Funcionalidade:Cadastro de usuários

# Como um usuário, eu gostaria de realizar o cadastro de usuários no sistema paraque eu possa visualizá-los no sistema.

# Detalhes de implementação:

#     ● Modal “Cadastrarusuário” com os campos: Nome, NomedaMãe, CPF, Login, Senha;
#     ● O campo Nome e Nome da mãe deve aceitar no máximo 256 caracteres;
#     ● O CPF deve ser válido;
#     ● O campo login deve aceitar no máximo 100 caracteres;
#     ● A senha deve ser formada por pelomenos um caráctere special, por pelomenos uma letra maiúscula e no máximo 8 caracteres;
#     ● Os campos Nome,Login e Senha são obrigatórios;
#     ● Após o cadastro, deve aparecer a mensagem de feedback: “Usuário salvo com sucesso!”;
#     ● Deve ser possível cadastrar no máximo 100 usuários;
#     ● O cadastro deve ser auditado;

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
       Quando clicar no campo seguinte
       Então deve apresentar uma mensagem  de feedback que o <campo> <mensagem>
       Exemplos:
          | campo                         | mensagem
          | o campo Nome                  | deve conter no mínimo 1 e no máximo 256 caracteres
          | o campo Nome da mãe           | deve conter no mínimo 1 e no máximo 256 caracteres
          | os campos Nome e Nome da mãe  | deve conter no mínimo 1 e no máximo 256 caracteres

     Cenário: O CPF deve ser válido
       Dado que o usuário não peencheu o CPF válido
       Quando clicar no campo seguinte
       Então deve apresentar a mensagem de feedback informando que o CFP é inválido
       E deve adicionar um CPF válido

     Cenário: O campo login deve aceitar no máximo 100 caracteres
       Dado que o usuário não preencheu o campo login com nenhum caracter ou ultapassou 100 caracteres
       Quando clicar no campo seguinte
       Então deve apresentar a mensagem de feedback informando que deve conter no máximo 100 caracteres
       E o campo tem que ser preenchido

     Cenário:  A senha deve conter pelomenos um carácter especial,uma letra maiúscula e no máximo 8 caracteres
       Dado que o o usuário não adicionou na sua senha pelomenos um carácter especial, uma letra maiúscula e no máximo 8 caracteres
       Quando clicar em Salvar
       Então deve apresentar a mensagem de feedback informando que deve adicionar pelomenos um carácter especial, uma letra maiúscula e no máximo 8 caracteres

     Cenário: Só é possível cadastrar no máximo 100 usuários;
       Dado que houve uma tentativa de cadastrar mais de 100 usuários
       Quando clicar em Salvar
       Então deve aparecer uma mensagem de feedback que alcançou o limite de usuários cadastrados