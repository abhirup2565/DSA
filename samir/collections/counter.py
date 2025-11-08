from collections import Counter

fruits = ['apple', 'banana', 'apple', 'orange', 'banana', 'apple']

statement = "Hello hello hello my name is abhirup abhirup is my name"
statement_word = statement.split(" ")

count = Counter(statement_word)

print(count)  
