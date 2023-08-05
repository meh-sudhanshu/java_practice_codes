def main():
    arr = [3,-4,5,3,4,5,6,6,7,8,9]
    largest = float('-inf')
    smallest = float('+inf')
    for i in range(len(arr)):
        if arr[i] > largest: largest = arr[i] 
        if arr[i] < smallest: smallest = arr[i]
    print(largest,smallest)

def reverse_array(arr):
    i=0
    j=len(arr)-1
    while i<j:
        temp = arr[i]
        arr[i]=arr[j]
        arr[j] = temp