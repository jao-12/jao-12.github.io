altura = float(input("digite sua altura: "))
peso = float(input("digite seu peso: "))

imc = peso/altura
if imc < 18.5:
    print('abaixo do peso')
elif imc >= 18.5 or imc <= 24.9:
    print('normal')
elif imc >= 25 or imc < 29.9:
    print('sobrepeso')
else:
    print('obeso')