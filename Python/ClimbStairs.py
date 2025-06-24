def getNumberOfWays(n,dp):
    if dp[n] != 0:
        return dp[n]
    if n == 1 or n == 2:
        dp[n] = n
        return n
    x = getNumberOfWays(n-1,dp)
    dp[n-1] = x
    y = getNumberOfWays(n-2,dp)
    dp[n-2] = y
    return x+y
    


def main():
    n = 50
    dp = [0 for i in range(n+1)]
    ans = getNumberOfWays(n,dp)
    print(ans)
main()