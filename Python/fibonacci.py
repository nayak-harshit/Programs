print("input n")
n = int(input())



# 0, 1, 1, 2, 3, 5, 8, 13 ...
def fibo(n):
    

    if(n==1):
        return 0
    elif(n==3 or n==2):
        return 1
    
    return fibo(n-1)+fibo(n-2)


print(fibo(n))