


def getMaximumSubarraySum(arr):
    ans = float("-inf")
    currSum = 0
    for i in range(len(arr)):
        if currSum <=0:
            currSum = 0
        if arr[i]>=0:
            currSum+=arr[i]
        if arr[i]<0:
            ans = max(ans,currSum)
            currSum+=arr[i]
    return max(ans,currSum)


def main():
    arr = [-3,2,5,-7,9,12,-3,-5,6,8,12]
    ans = getMaximumSubarraySum(arr)
    print(ans)
main()