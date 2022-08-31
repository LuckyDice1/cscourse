import numpy as np

def integer_to_binary(num):
        starting_exponent = round(np.log2(int(num)))
        result = ""
        for i in range(starting_exponent, -1, -1):
            if num >= 2**i:
                result += '1'
                num -= 2**i
            elif num < 2**i:
                result += '0'
        return int(result)

def binary_to_integer(num):
    result = 0
    for idx, i in enumerate(reversed(num)):
        result += (2**idx)*int(i)
    return(result)


decision = int(input("1. Binary -> Decimal\n2. Decimal -> Binary:\n3. Binary -> Hexidecimal\n>> ")) 
if decision == 1:
    num = input("Your binary number: ")
    print(binary_to_integer(num))
elif decision == 2:
    num = int(input("Input your integer: "))
    print(integer_to_binary(num))
elif decision == 3:
    print("Work in progress")
    # Work in progress. Feel free to make a pull request and update this if you want

    
        


