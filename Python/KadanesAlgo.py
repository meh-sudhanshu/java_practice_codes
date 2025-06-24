def getMaximumSubaaraySum(arr):
    ans = float("-inf")
    trainSum  = 0
    for i in range(len(arr)):
        if trainSum < 0 :
            trainSum = 0
        trainSum+=arr[i]
        if trainSum > ans:
            ans = trainSum
    return ans
def main():
    arr =[-2,-4,-6]
    ans = getMaximumSubaaraySum(arr)
    print(ans)
main()