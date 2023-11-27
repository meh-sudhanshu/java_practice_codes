def isPalindrome(str):
    i,j = 0 , len(str)-1
    while i<j:
        if str[i] != str[j]:
            return False
        i+=1
        j-=1
    return True

def isPalindromeUsingRecursion(str):
    if len(str) == 0 or len(str) == 1:
        return True
    if str[0] != str[-1]:
        return False
    subStr = str[1:len(str)-1]
    return isPalindromeUsingRecursion(subStr)


def main():
    str = "MadaMss"
    result = isPalindromeUsingRecursion(str)
    print(result)


main()