letra = input("digite uma letra: ")

if letra.isalpha():
    letra.lower()
    if letra.lower in 'aeiou':
        print('é vogal')
    else:
        print('é consoante')
else:
    print('numero ou simbolo')