from processo import *
from fila import *


"""
Função: Instancia todos os processos apartir de um arquivo e coloca eles na fila de CPU (sem ordenar por prioridade).
Entrada: Nome do arquivo
Saida: Nada ( variavel fCPU com processos)
"""
def insereCPU(arquivo):

	p1 = Processo (1,'0010',5,8,4)
	p2 = Processo (2,'0000',5,8,4)
	p3 = Processo (3,'0100',5,8,4)
	p4 = Processo (4,'0101',5,8,4)
	fCPU = Fila([p1,p2,p3,p4])


"""
Função: Verifica se o processo atual é de CPU ou de IO. Se for IO insere na fila de IO
Entrada: Processo
Saida: True (se processo for de CPU) or False (Proceso IO)
"""
def verificaProcesso():
	pass


def main():
	fCPU = Fila([])
	fIO = Fila([])
	fFinal = Fila([])
	insereCPU('meuarquivo.txt')

	while fCPU.processos != []:
		verificaProcesso()
		if(veirificaProcesso()):
			executaPCPU()
		else:
			executaPIO()



