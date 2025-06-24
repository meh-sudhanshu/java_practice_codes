def isPalindrome(str):
    n = len(str)
    if n <= 1: return True
    if str[0] != str[-1]: return False
    subStr = str[1:n-1]
    return isPalindrome(subStr)
def main():
    str = ""
    ans = isPalindrome(str)
    print(ans)
main()