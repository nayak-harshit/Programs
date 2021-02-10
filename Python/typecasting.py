# Hello there this program will just do one thing
# It will remind me how to typecast in case I forgot...
# @author NAYAK
var = 34
var2 = 3443.24
# the below both variables are string variables...
var3 = 'var3'
var4 = "var4"
print(type(var))
print(type(var2))
print(type(var3))
print(type(var4))

strr = '23'
str2 = '687'
# this is typecasting a string into integer using int()function..
print(int(strr) + int(str2))
print(type(float(var)))  # --> converts int to float
print(str(var))
# print(int(var3)) --> produces error

# to print same thing many times..
print(10*var3)  # --> this prints var3 10 times
print(10*var)   # --> but this prints 34*10 i.e. 340
 

