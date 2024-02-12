

def main():
    string = "aaabdbsbbabsbdbdsbbsbssbdbsb"
    arr = [0 for i in range(26)]
    base = 97
    for i in range(len(string)):
        index = ord(string[i])-base
        arr[index]+=1
    ans = ''
    for i in range(26):
        char = chr(i+base)
        frequncy = arr[i]
        if frequncy != 0:
            ans+=(char+str(frequncy))
    print(ans)
main()
