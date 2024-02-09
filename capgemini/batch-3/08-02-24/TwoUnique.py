def getFirstSetBit(num):
    ans = 1
    while num%2 != 1:
        num = num>>1
        ans+=1
    return ans
def isIthBitSet(num,i):
    num = num>>(i-1)
    return (num%2 == 1)

def getBothUniqueNumber(arr):
    allXor = 0
    for e in arr: allXor = allXor^e
    bitPos = getFirstSetBit(allXor)
    ans1 = 0
    ans2 = 0
    for e in arr:
        if isIthBitSet(e,bitPos) == True:
            ans1 = ans1^e
        else:
            ans2 = ans2^e
    return [ans1,ans2]



def main():
    arr = [1,2,6,2,1,7,9,7,8,8]
    ans = getBothUniqueNumber(arr)
    print(ans)

main()