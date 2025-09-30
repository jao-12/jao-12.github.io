peixe = int(input("qual o peso do peixe: "))
excesso = peixe - 50
multa = excesso * 4
if peixe > 50:
  print("O seu peixe excedeu o limite por",excesso,"quilos")
  print("Portanto, receberá uma multa de",multa,"R$")
else:
    print("não receberá multa")