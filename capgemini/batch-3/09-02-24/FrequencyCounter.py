
def main():
    arr = [1,1,2,1,2,1,1,0,0,1,0,1,0,1,0,1,10]
    n = 100
    ans = [0 for i in range(n+1)]

    for i in range(len(arr)):
        value = arr[i]
        ans[value]+=1
    for i in range(n+1):
        if ans[i] != 0:
            print(i," is occuring",ans[i]," times")

main()
