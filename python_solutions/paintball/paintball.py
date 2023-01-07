#input

print("hello")
import sys
import networkx as nx

class graph:

    def __init__(self):
        edgelist = []
        nodelist = []
        adjacency_matrix = {}



# intervals = []
# first = True
# n = 0
G = nx.Graph()
first = True

edges = []

for line in sys.stdin:
    line = line.strip()

    # print(line)

    if first:

        n, m = line.split()

        G.add_nodes_from(["A" + str((i + 1)) for i in range(int(n))], bipartite=0)
        G.add_nodes_from(["B" + str((i + 1)) for i in range(int(n))], bipartite=1)

        first = False
        continue

    a, b = line.split()

    A = "A" + str(a)
    B = "A" + str(b)

    edges.append((A, B))
print(edges)
    # G.add_edge()



