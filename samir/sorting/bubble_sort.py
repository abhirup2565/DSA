arr = [7,5,9,2,8]

for i in range (len(arr)-1,-1,-1):
    for j in range(i):
        if(arr[j]>arr[j+1]):
            t=arr[j]
            arr[j]=arr[j+1]
            arr[j+1]=t
print(arr)