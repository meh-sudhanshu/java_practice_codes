def permute(arr):
    if len(arr) == 1:
        return [arr]   
    ans = []
    for i in range(len(arr)):
        value = [arr[i]]
        ll = permute(arr[0:i]+arr[i+1:])
        for l in ll:
            ans.append(value+l)
    return  ans

print(permute([1,1,4]))

