def caixa():
    notas= [100,50,20,10,5,2]
    saque = int(input('digite o valor do saque'))

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
    
caixa()

