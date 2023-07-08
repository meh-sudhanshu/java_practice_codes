


def printFib(n):
    a,b  = 0,1
    if n<0:
        return "Invalid Input"
    if n==1:
        print(a)
        return
    if n==2:
        print(a,b)
        return
    print(a,b,end=" ")
    count = 2
    while(count < n):
        next_ = a+b
        a = b
        b = next_
        count+=1
        print(next_,end=" ")

printFib(10)
