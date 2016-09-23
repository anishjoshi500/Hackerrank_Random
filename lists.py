n=int(raw_input())
lister = []
for i in range(n):
    x = raw_input().split()
    if x[0] == "insert":
        lister.insert(int(x[1]), int(x[2]))
    elif x[0] == "remove":
        lister.remove(int(x[1]))
    elif x[0] == "append":
	lister.append(int(x[1]))
    elif x[0] == "sort":
	lister.sort()
    elif x[0] == "reverse":
	lister.reverse()
    elif x[0] == "pop":
	lister.pop()
    elif x[0] == "print":
        print lister
