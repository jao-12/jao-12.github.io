gastospeido = [20,30,50,70,100,200]
gastosmijo = [30,50,80,120,150]

gastostotaispeido = sum(gastospeido)
gastostotaismijo = sum(gastosmijo)

print(gastostotaispeido)
print(gastostotaismijo)

if gastostotaispeido > gastostotaismijo:
    print("peido gastos mais")
if gastostotaismijo > gastostotaispeido:
    print ("mijo gastou mais")
else:
    print("gastaram mesma quantidade")