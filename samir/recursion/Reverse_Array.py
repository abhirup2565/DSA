def Reverse(arr,pos):
    if pos==len(arr):
        result = []
        return result
    result = Reverse(arr,pos+1)
    result.append(arr[pos])
    return result

arr=[1,2,3,4]
res = Reverse(arr,0)
print(res)