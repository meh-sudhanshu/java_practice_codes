

def rotateArray(arr,i):
    stack=[]
    queue = []
    n = len(arr)-i
    for j in range(len(arr)):
        if j < n:
            queue.append(arr[j])
        else: stack.append(arr[j])
    for j in range(len(arr)):
        if len(stack) > 0:
            arr[j] = stack.pop()
        else: arr[j] = queue.pop(0)
    return arr

def main():
    arr = [3,2,4,5,12,45,67,89]
    i = 4
    ans = rotateArray(arr,i)
    print(ans)




main()