

def getMissingNumber(n,arr):
    ans = 0
    for i in range(1,n+1):
        ans = ans^i
    for e in arr:
        ans = ans^e
    return ans

def main():
    n = 10
    arr =[2,1,4,3,7,10,9,6,5]
    ans = getMissingNumber(n,arr)
    print(ans)

main()