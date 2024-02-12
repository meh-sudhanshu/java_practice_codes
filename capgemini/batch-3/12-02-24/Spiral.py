

def main():
    arr =[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20]]
    count = len(arr)*len(arr[0])
    i,j = 0,0
    turn = 1
    rowStart,rowEnd,colStart,colEnd = 1,len(arr)-1,0,len(arr[0])-1
    while count>0:
        if turn == 1:
            while j < colEnd:
                print(arr[i][j],end=" ")
                count-=1
                j+=1
            colEnd-=1
            turn = 2
        elif turn == 2:
            while i< rowEnd:
                print(arr[i][j],end=" ")
                count-=1
                i+=1
            rowEnd-=1
            turn = 3
        elif turn == 3:
            while j > colStart:
                print(arr[i][j],end=" ")
                j-=1
                count-=1
            colStart+=1
            turn = 4
        else:
            while i > rowStart:
                print(arr[i][j],end=" ")
                i-=1
                count-=1
            rowStart+=1
            turn = 1
            


main()