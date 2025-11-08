from collections import defaultdict

# Using int (default value = 0)
count = defaultdict(int)
count['apple'] += 1
count['banana'] += 2

print(count)  # defaultdict(<class 'int'>, {'apple': 1, 'banana': 2})
print(count['orange'])  # 0 (no KeyError)
