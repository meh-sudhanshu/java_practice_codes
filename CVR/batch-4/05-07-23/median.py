

arr = [2,3,4,5,3,4,5,6,6]

arr.sort()

n = len(arr)

if n%2 != 0:
    print(arr[n//2 - 1])
else:
    print((arr[n//2]+arr[n//2 -1 ])//2)


