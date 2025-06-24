def getFisrtSetBitPosition(n):
    if n == 0:
        return -1
    ans = 1
    while n%2 != 1:
        n = n>>1
        ans+=1
    return ans

def getIthBit(num,i):
    num = num >> (i-1)
    return num%2

def getUniqueValues(arr):
    wholeXor = 0
    for e in arr: wholeXor = wholeXor ^ e
    firstSetBitPos = getFisrtSetBitPosition(wholeXor)
    ans1,ans2 = 0, 0
    for e in arr:
        posValue = getIthBit(e,firstSetBitPos)
        if posValue == 1:
            ans1 = ans1 ^ e
        else:
            ans2 = ans2 ^ e
    return ans1,ans2




def main():
    arr = [8,18,9,18,17,8]
    ans = getUniqueValues(arr)
    print(ans)
main()
#https://github.com/meh-sudhanshu/python_practice_codes