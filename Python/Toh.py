def toh(n,src,aux,des):
    if n <= 0:
        return
    toh(n-1,src,des,aux)
    print(src,"->",des)
    toh(n-1,aux,src,des)
def main():
    n = 3
    src,aux,des = 'A','B','C'
    toh(n,src,aux,des)
main()