def main():
    arr = [1,1,1,2,3,32,2,3,4,3,34,2]
    ans = [0 for i in range(101)]
    for e in arr:
        ans[e]+=1
    for i in range(len(ans)):
        if ans[i]>0:
            print(i,"->",ans[i])

main()
