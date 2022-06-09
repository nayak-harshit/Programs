'''
WAP to Multiply two integers without using multiplication, division and bitwise operators, and no loops
'''
def withoutMultiply(a,b):
    if(b==0):
        return 0
    
    if(b==1):
        return a
    
    if(b>0):
        for i in range (1, b):
            return a + withoutMultiply(a, b-i)

    if(b<0):
        b = abs(b)
        for i in range (1, b):
            return -(a + withoutMultiply(a, b-i))

    return -1;


a = 1
b = 64
n = withoutMultiply(a,b)
print(n)