salario = int(input("digite seu salario por horas: "))
horas = int(input("quantas horas você trabalha no mês: "))
salario = (salario * horas)
#INSS
salarioinss = salario * (8 / 100)
#RENDA
salariorenda = salario * (11 / 100)
#SINDICATO
salariosindicato = salario * (5 / 100)

print(salario)
print("seu desconto de inss é de",salarioinss)
print("o desconto do sindicato é",salariosindicato)
liquido = salario - salariosindicato - salarioinss - salariorenda
print("seu salario liquido é de",liquido)