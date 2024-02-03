arr = [2,-3,23,-5,-6,65,-32,-1,2,-3,-23,1,5,-6]
k = 3
i = 0
j = k-1
ans = float("-inf")
ps = 0
while j<len(arr):
    if i == 0:
        currSum = sum(arr[i:j+1])
        ans = max(ans,currSum)
        ps = currSum
    else:
        currSum = ps-arr[i-1]+arr[j]
        ans = max(ans,currSum)
        ps = currSum
    i+=1
    j+=1
print(ans)
