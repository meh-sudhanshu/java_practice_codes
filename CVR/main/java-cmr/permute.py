

def permute(arr):
    ans = []
    if len(arr) == 1:
        ans.append(arr)
        return ans
    for i in range(len(arr)):
        temp_ans = [arr[i]]
        list_ = permute(arr[0:i]+arr[i+1:])
        for l in list_:
            ans.append(temp_ans+l)
    return ans

arr = [1,2,3,4]
print(permute(arr))