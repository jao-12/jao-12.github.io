senha_input = input('Escolha uma senha: ')
senha_output = input('Digite sua senha: ')

if senha_output == senha_input:
    print('Acesso permitido')
else:
    print('Senha incorreta')
    redefinir = input('Deseja redefinir a senha?: ')
    if redefinir == ('Sim'):
        senha_input = input('Digite sua nova senha: ')
        senha_output = input('Digite a senha: ')
        if senha_output == senha_input:
            print('Acesso permitido')
        else:
            print('Acesso negado de vez agora')