def caixa():
    notas= [100,50,20,10,5,2]
    saque = int(input('Digite o valor do saque: '))
    saque0 = 0
    saque0 += saque

    nota100 = saque // notas[0]
    saque = saque % notas[0]

    nota50 = saque // notas[1]
    saque = saque % notas[1]

    nota20 = saque // notas[2]
    saque = saque % notas[2]

    nota10 = saque // notas [3]
    saque = saque % notas[3]

    nota5 = saque // notas[4]
    saque = saque % notas[4]

    nota2 = saque // notas[5]
    saque = saque % notas[5]

    if saque != 0:
        print("Saque invalido")
    else:
        print(f'O valor do seu saque foi de: {saque0}\nNotas de 100: {nota100}\nNotas de 50: {nota50}\nNotas de 20: {nota20}\nNotas de 10: {nota10}\n notas de 5: {nota5}\nNotas de 2: {nota2}')
decisão = ('')
while decisão != 'nao':
    decisão = input('Você deseja realizar um saque?: ')
    if decisão == 'sim':
        caixa()
