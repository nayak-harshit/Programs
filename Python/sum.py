# This program adds 2 numbers 
# and does nothing else
# @author NAYAK
print("Add two numbers")
print("Enter the first number:")
num1 = input()    # Taking input
print("Enter the second number:")
num2 = input()
# storing the sum of the inputs in sum
# the 'int(num1)' converts the input to integer..
summation = int(num1) + int(num2)
# printing the sum
# print("The sum of ", num1, "and", num2,"is", sum)
print("The sum of {0} and {1} is {2}".format(num1, num2, summation))
