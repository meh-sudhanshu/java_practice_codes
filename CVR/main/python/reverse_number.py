


def main():
    n = 98765980

    ans , count = 0,0

    while n != 0:

        rem = n%10
        n = n//10
        ans = ans*10 + rem
        count+=1

    print(ans,count)

main()
