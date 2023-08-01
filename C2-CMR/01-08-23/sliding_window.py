

def main():
    arr = [1,-2,3,4,5,-34,-4,-32]
    k1 = 3
    i = 0 
    j = k1-1
    max_sum = float('-inf')
    while j < len(arr):
        sum = 0
        if i == 0:
            for k in range(i,j+1):
                sum+=arr[k]
            if sum > max_sum:
                max_sum = sum
            i+=1
            j+=1
            print(sum)
        else:
            sum = max_sum - arr[i-1] + arr[j]
            if sum > max_sum:
                max_sum = sum
            i+=1
            j+=1
    print(max_sum)


main()
