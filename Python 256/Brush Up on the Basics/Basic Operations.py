# Normal symbols like +, -, *, / do as you'd think

sum = 8+8
print(sum) # 16

difference = 10-8
print(difference) # 2

product = 5*3
print(product) # 15

quotient = 10/2
print(quotient) # 5

# Operators become more advanced when you need more logic
# For example, determining if something is even or odd.
# Even numbers are evenly divisible by 2 so to determine this we need to see if there is a remainder after dividing by 2

number = 5
# The "%" operator divides the number but returns the remainder, 2 goes into 5 2 times evenly with a remainder of 1

if 5 % 2 == 0:
    print("Even")
else:
    print("Odd")

# Exponents are done with the "**" operator
two_squared = 2**2
print(two_squared) # 4

# FOR MORE ABOUT OPERATORS PLEASE LOOK AT THE CHEATSHEET
