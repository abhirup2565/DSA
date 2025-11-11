arr = [7,5,9,2,8]

for i in range (len(arr)):
    first = i
    min = i
    for j in range(i,len(arr),1):
        if(arr[j]<arr[min]):
            min=j
    if(first!=min):
        t=arr[first]
        arr[first]=arr[min]
        arr[min]=t

print(arr)