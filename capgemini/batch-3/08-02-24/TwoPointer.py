def isPairExist(arr,target):
    arr.sort()
    i=0
    j = len(arr)-1
    while i<j:
        if arr[i]+arr[j]<target: i+=1
        if arr[i]+arr[j]>target: j-=1
        if arr[i]+arr[j]==target: return True
    return False

def isTripletExist(arr,target):
    for i in range(len(arr)):
        value = arr[i]
        newTarget = target-value
        suArr = arr[0:i]+arr[i+1:]
        if isPairExist(arr,newTarget) == True:
            return True
    return False


def main():
    arr = [3,-1,2,5,8,-23,13,45]
    target = 600
    ans = isTripletExist(arr,target)
    print(ans)
main()