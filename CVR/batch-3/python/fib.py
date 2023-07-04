



def find_sum(n):
    a,b = 0,1
    if(n<=0):
        return "Invalid input"
    if(n==1):
        return a
    if(n==2):
        return a+b
    sum = a+b
    count = 2
    while count !=n:
        next = a+b
        sum+=next
        a=b
        b=next
        count+=1
    return sum

print(find_sum(14))