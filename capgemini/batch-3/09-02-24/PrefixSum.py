


def main():
    arr = [1,-2,9,3,7,6]
    queries = [[0,3],[1,5],[3,4],[2,5]]
    ps = [0 for i in range(len(arr))]
    for i in range(len(arr)):
        if i == 0:
            ps[i] = arr[i]
        else:
            ps[i] = ps[i-1]+arr[i]
    for query in queries:
        si = query[0]
        ei = query[1]
        if si == 0:
            print(ps[ei])
        else:
            print(ps[ei]-ps[si-1])


main()