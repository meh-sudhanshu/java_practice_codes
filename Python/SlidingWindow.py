def getMaximumSubarraySumOfSizeK(arr,k):
    # with k distinct element
    i,j = 0, k-1
    ans = float("-inf")
    _sum = 0
    myDict = {}
    while j < len(arr):
        if i == 0:
            for l in range(i,j+1):
                _sum+=arr[l]
                key = arr[l]
                if key in myDict:
                    myDict[key]+=1
                else:
                    myDict[key] = 1
        else:
            _sum = _sum - arr[i-1] + arr[j]
            removedKey = arr[i-1]
            if myDict[removedKey] == 1:
                del myDict[removedKey]
            else:
                myDict[removedKey]-=1
            addedKey = arr[j]
            if addedKey in myDict:
                myDict[addedKey]+=1
            else:
                myDict[addedKey] = 1
        i+=1
        j+=1
        if _sum > ans and len(myDict) == k:
            ans = _sum
    return ans

def main():
    arr = [-2,4,14,14,-3,2,2,2,7]
    k = 3
    ans = getMaximumSubarraySumOfSizeK(arr,k)
    print(ans)
main()