#Aqui utilizamos um codigo simples de duas formas diferentes, uma "normal" e uma usando função para converter
'''for x in range(10+1):
    print(f"{x}"*x)'''
for x in range(10+1):
    for y in range(1,x):
        print(y, end="")
    print()
