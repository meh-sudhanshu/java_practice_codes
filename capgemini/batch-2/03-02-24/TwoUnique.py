arr = [2,3,23,5,6,654,32,1,2,3,23,1,5,6]


def getIthBit(n,i):
    n = n>>(i-1)
    return (n%2 == 1)

def getFirstSetBit(n):
    ans = 1
    while n%2 != 1:
        n = n>>1
        ans+=1
    return ans


def getUniqueNumbers(arr):
    allXor = 0
    for e in arr: allXor = allXor^e
    bitPosition = getFirstSetBit(allXor)
    seg1=[]
    seg2=[]
    for e in arr:
        if getIthBit(e,bitPosition) == True:
            seg1.append(e)
        else:
            seg2.append(e)
    ans1 = 0
    ans2 = 0
    for e in seg1: ans1=ans1^e
    for e in seg2: ans2=ans2^e

    return [ans1,ans2]


ans = getUniqueNumbers(arr)
print(ans)

