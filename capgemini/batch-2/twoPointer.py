


arr = [2,2,-9,3,6,6,3,7,-98,34,54]
target = 232 



def isPairExist(arr,target):
    arr.sort() # nlong
    i,j = 0, len(arr)-1
    while i<j: # n 
        if arr[i]+arr[j] > target:j=j-1
        if arr[i]+arr[j] < target:i=i+1
        if arr[i]+arr[j] ==target: return True
    return False


def isTripletExists(arr,target):
    for i in range(len(arr)):
        selectedEle = arr[i]
        subArr = arr[0:i]+arr[i+1:]
        updatedTarget = target-selectedEle
        ans = isPairExist(subArr,updatedTarget)
        if ans == True:
            return True
    return False



print(isTripletExists(arr,target))
#print(isPairExist(arr,target))
    