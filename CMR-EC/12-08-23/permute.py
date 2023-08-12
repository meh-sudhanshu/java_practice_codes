def permute(arr):
    if len(arr) == 1:
        return [[arr[0]]]
    ans = []
    for i in range(len(arr)):
        temp_ans = [arr[i]]
        ll = permute(arr[0:i]+arr[i+1:])
        for v in ll:
            ans.append(v+temp_ans)
    return ans

ans = permute([1,2,3])
for v in ans:
    print(v)