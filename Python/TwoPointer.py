def isPairExist(arr,target):
    arr.sort()
    myDict = {}
    i,j = 0, len(arr)-1
    for i in range(0,len(arr)-1):
        myDict[arr[i]] = i
    while i < j:
        sum = arr[i]+arr[j]
        if sum == target:
            index1 = myDict[arr[i]]
            index2 = myDict[arr[j]]
            return [index1,index2]
        if sum > target: j-=1
        if sum < target: i+=1
    return []


def main():
    arr = [-3,8,-9,3,18,7,-2,1,1,5,-6]
    target = 25
    ans = isPairExist(arr,target)
    print(ans)
main()