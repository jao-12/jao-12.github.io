import math
n1 = int(input("digite um numero: "))
n2 = int(input("digite um numero: "))
n3 = int(input("digite um numero: "))

if n1 > n2:
    maior = n1
else:
    maior = n2
if maior > n3:
    print("o maior numero é",maior)
if maior < n3:
    maior = n3
    print("maior numero é",maior)
