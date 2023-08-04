CORRER = 0
NADAR = 1
PEDALAR = 2

class Atleta:
    def __init__(self, peso):
        self.aposentado = False
        self.peso = peso
        self.aquecido = False

    def Aposentar(self):
        if not self.aposentado:
            self.aposentado = True
            print("Está aposentado.")
        else:
            print("Já está aposentado!")

    def Desaposentar(self):
        if self.aposentado == True:
            self.aposentado = False
            print("Está desaposentado.")
        else:
            print("Já está desaposentado!")

    def Aquecer(self):
        if not self.aquecido and not self.aposentado:
            self.aquecido = True
            print("Está aquecendo!")
        else:
            print("Já está aquecido")

class Corredor(Atleta):
    def __init__(self, peso):
        super().__init__(peso)

    def Correr(self):
        if not self.aposentado and self.aquecido:
            print("Começou a correr!")
        else:
            print("Está aposentado ou não aqueceu!")

class Nadador(Atleta):
    def __init__(self, peso):
        super().__init__(peso)

    def Nadar(self):
        if not self.aposentado and self.aquecido:
            print("Começou a nadar!")
        else:
            print("Está aposentado ou não aqueceu!")

class Ciclista(Atleta):
    def __init__(self, peso):
        super().__init__(peso)

    def Pedalar(self):
        if not self.aposentado and self.aquecido:
            print("Começou a pedalar!")
        else:
            print("Está aposentado ou não aqueceu!")

class TriAtleta(Corredor, Nadador, Ciclista):
    def __init__(self, peso):
        super().__init__(peso)
        self.atividade_atual = None

    def Correr(self):
        if not self.aposentado and self.aquecido:
            if self.atividade_atual is None:
                self.atividade_atual = CORRER
                print("Começou a correr!")
            elif self.atividade_atual == NADAR or self.atividade_atual == PEDALAR:
                print("Só pode realizar uma atividade por vez. Pare a atividade atual e tente novamente.")
        else:
            print("Está aposentado ou não aqueceu!")

    def Nadar(self):
        if not self.aposentado and self.aquecido:
            if self.atividade_atual is None:
                self.atividade_atual = NADAR
                print("Começou a nadar!")
            elif self.atividade_atual == CORRER or self.atividade_atual == PEDALAR:
                print("Só pode realizar uma atividade por vez. Pare a atividade atual e tente novamente.")
        else:
            print("Está aposentado ou não aqueceu!")

    def Pedalar(self):
        if not self.aposentado and self.aquecido:
            if self.atividade_atual is None:
                self.atividade_atual = PEDALAR
                print("Começou a pedalar!")
            elif self.atividade_atual == CORRER or self.atividade_atual == NADAR:
                print("Só pode realizar uma atividade por vez. Pare a atividade atual e tente novamente.")
        else:
            print("Está aposentado ou não aqueceu!")

    def Parar(self):
        if not self.aposentado and self.aquecido:
            if self.atividade_atual is not None:
                self.atividade_atual = None
                print("O atleta parou!")

carlos = TriAtleta(65)
carlos.Aquecer()
carlos.Correr()
carlos.Pedalar()
