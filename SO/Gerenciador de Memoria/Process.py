class Process(object):
	"""docstring for Process"""
	id = None
	size = None
	nPage = None

	def __init__(self, i, s, n):
		self.id = i
		self.size = s
		self.nPage = n