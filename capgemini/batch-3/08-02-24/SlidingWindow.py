def getMaximumSubarraySum(arr,k):
    i=0
    j = k-1
    ans = float("-inf")
    ps = 0
    while j<len(arr):
        currSum = 0
        if i ==0:
            for k in range(i,j+1):
                currSum+=arr[k]
                ps = currSum
        else:
            currSum = ps-arr[i-1]+arr[j]
            ps = currSum
        i+=1
        j+=1
        ans = max(ans,currSum)
    return ans




def main():
    arr = [2,-3,1,2,-5,-6,7,8,12]
    k = 3
    ans = getMaximumSubarraySum(arr,k)
    print(ans)

main()