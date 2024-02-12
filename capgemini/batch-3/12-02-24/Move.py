

def main():
    string = "sudh###an##sh#u##"
    stack=[]
    queue = []
    for i in range(len(string)):
        if string[i] == '#':
            stack.append('#')
        else:
            queue.append(string[i])
    ans = ''
    for i in range(len(string)):
        if len(stack) > 0:
            ans+=stack.pop()
        else:
            ans+=queue.pop(0)
    print(ans)

main()