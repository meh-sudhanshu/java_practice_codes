
def printFib(n):
    a,b = 0,1
    if n<=0:
        return "Invalid input"
    if n==1:
        return a
    if n==2:
        return [a,b]
    ans = []
    ans.append(a)
    ans.append(b)
    count = 2
    while count != n:
        next_ = a+b
        ans.append(next_)
        a=b
        b=next_
        count+=1

    return ans

print(printFib(10))