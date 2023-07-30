


def main():
    arr = [1,2,4,3]
    n=5
    missing_number = 0
    for i in range(1,6):
        missing_number = missing_number^i
    for e in arr:
        missing_number = missing_number^e
    
    print(missing_number)

main()