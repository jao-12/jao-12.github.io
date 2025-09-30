palavras = ["python", "asimov", "código", "web", "programação"]
maior_palavra = palavras[0]
menor_palavra = palavras[0]
for palavra in palavras:
  if len(palavra) > len(maior_palavra):
      palavra = maior_palavra
  if len(palavra) < len(menor_palavra):
     palavra = menor_palavra
print("a maior palavra da lista é",maior_palavra,"a menor palavra da lista",menor_palavra)
