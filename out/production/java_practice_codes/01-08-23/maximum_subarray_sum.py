


def main():
    arr = [2,-3,2,4,5,6,7,-4]
    max_sum , curr_sum  = 0,0
    for i in range(len(arr)):
        curr_sum += arr[i]
        if curr_sum > max_sum:
            max_sum = curr_sum
        if curr_sum < 0:
            curr_sum = 0
    print(max(curr_sum,max_sum))

main()