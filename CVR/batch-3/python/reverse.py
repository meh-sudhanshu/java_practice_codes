


num = 9876

is_negative = False

if num < 0:
    is_negative = True
    num = num*-1

res = 0

while num != 0:
    rem = num%10
    res = res*10 + rem
    num = num // 10
if is_negative == True:
    print(-res)
else:
    print(res)