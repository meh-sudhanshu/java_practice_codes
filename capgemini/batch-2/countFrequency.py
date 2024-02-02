arr = [1,2,1,2,3,2,2,3,2,1,3,3,1]
n = 10

f_arr = [0 for i in range(n+1)] # creating an array of length n+1

for i in range(len(arr)):
    f_arr[arr[i]] = f_arr[arr[i]]+1
print(f_arr)

