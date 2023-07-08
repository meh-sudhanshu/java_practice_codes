

arr = [23,4,5,2,6,-90,78,9,98]

a = 0 
b = len(arr)-1 

while a<b:
    temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
    a+=1
    b-=1

print(arr)