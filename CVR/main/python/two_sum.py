

def main():
    arr = [2,4,-4,5,6,7,4,3,2,7,-89]
    target = -8300
    arr.sort() # nlogn

    i,j = 0, len(arr)-1

    while i<j:
        if arr[i]+arr[j] == target: return True

        if arr[i]+arr[j] < target: i = i+1

        if arr[i]+arr[j] > target: j = j-1

    return False

print(main())
    
        
