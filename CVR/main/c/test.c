
#include<stdio.h>

int main(){
    int num = 42;

    int *addressOfNum = &num;

    printf("%d",num);

    printf("%d",&num);

    printf("%p",&num)

    print("%p",(void*)&num);
}