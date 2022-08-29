import numpy as np

decision = int(input("1. Binary -> Decimal\n2. Decimal -> Binary:\n>> ")) 
if decision == 1:
    num = input("Your binary number: ")
    result = 0
    for idx, i in enumerate(reversed(num)):
        result += (2**idx)*int(i)
    print(result)
elif decision == 2:
    num = int(input("Input your integer: "))
    starting_exponent = round(np.log2(int(num)))
    result = ""
    for i in range(starting_exponent, -1, -1):
        if num >= 2**i:
            result += '1'
            num -= 2**i
        elif num < 2**i:
            result += '0'
    print(int(result))
        


