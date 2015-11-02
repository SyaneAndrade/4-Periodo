from processo import *

class Fila(object):
	
	processos = []

	"""docstring for Fila"""
	def __init__(self, processos):
		self.processos = processos
	def printIds (self):
		for p in self.processos:
			print(p.id)
	def pIds (self):
		pids = []
		for p in self.processos:
			pids.append(p.id)
		return pids

	