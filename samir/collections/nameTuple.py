from collections import namedtuple

Person = namedtuple('Person', ['name', 'age', 'city'])
p = Person('Alice', 25, 'Paris')

print(p.name)  # Alice
print(p[1])    # 25 (can still use index)
print(p)