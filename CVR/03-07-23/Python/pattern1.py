

def printPattern(row):
    col = 2*n-1
    a,b = row -1
    for i in range(row):
        flag = True
        for j in range(col):
            if j>=a and j <=b:
                if flag == True:
                    print("*",end=" ")
                else:
                    print(" ",end=" ")
                flag= not flag
            else:
                print(" ")
        a-=1
        b+=1
        print()


printPattern(10)
            

