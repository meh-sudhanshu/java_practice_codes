
def main():
    arr  = [2,4,-3,4,3,-4,5,6,-6,7,-8,6,5,4]
    k = 4
    i,j = 0,len(arr)-1
    ans = float('-inf')
    cs = 0
    while j<len(arr):
        if i==0:
            for k1 in range(i,j+1):
                cs+=arr[k1]
            i+=1
            j+=1
            if cs > ans:
                ans = cs
        else:
            cs = cs - arr[i-1]+arr[j]
            if cs > ans: ans=cs
            i+=1
            j+=1
    return ans
