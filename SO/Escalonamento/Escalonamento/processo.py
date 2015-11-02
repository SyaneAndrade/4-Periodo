class Processo(object):
	id = None
	informacao = None
	tCPU = None
	tIO = None
	prioridade = None

	def __init__(self, id,informacao,tCPU,tIO,prioridade):

		self.id = id
		self.informacao= informacao
		self.tCPU= tCPU
		self.tIO= tIO
		self.prioridade= prioridade

if __name__ == '__main__':
	p = Processo (1,'0000',5,8,4)
	print(p.informacao[2])
		