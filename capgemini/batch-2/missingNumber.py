n = 10
arr = [6,7,1,3,2,4,8,5,10]
ans = 0
for i in range(1,11):
    ans = ans^i
for e in arr:
    ans = ans^e
print(ans)





