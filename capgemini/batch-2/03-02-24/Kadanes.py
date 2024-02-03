arr = [2,-3,5,8,-6,1,-3,-9,12,-15,18]

def getMaxisumSubarraySum(arr):
    ans = float("-inf")
    cs = 0
    for i in range(len(arr)):
        if cs<0:
            cs = 0
        if arr[i]>=0:
            cs+=arr[i]
        else:
            ans = max(ans,cs)
            cs+=arr[i]
    return max(ans,cs)

print(getMaxisumSubarraySum(arr))