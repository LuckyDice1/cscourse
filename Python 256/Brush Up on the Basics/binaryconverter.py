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

def binary_to_integer(num : str):
    result = 0
    for idx, i in enumerate(reversed(num)):
        result += (2**idx)*int(i)
    return(result)

def binary_to_hex(num : str):
    hex_dict = {10: "A", 11: "B", 12: "C", 13: "D", 14: "E", 15: "F"}
    if len(num) % 4 != 0:
        num = ("0" * (4-(len(num)%4))) + num
    result = ""
    for i in range(len(num)+1, -1, -1):
        if (i) % 4 == 0 and binary_to_integer(str(num)[i-4: i]) != 0:
            #print(result, i)
            new_num = binary_to_integer(str(num)[i-4: i])
            #print(new_num, str(num)[i-4: i], i-4, i)
            if new_num > 9:
                result += hex_dict[new_num]
            else:
                result += str(new_num)
    result = result[::-1]
    return result

def hex_to_binary(num : str):
    integer = 0
    hex_dict = {"A": 10, "B": 11, "C": 12, "D": 13, "E":14, "F":15}
    for idx, i in enumerate(reversed(num.upper())):
        if i in hex_dict.keys():
            integer += hex_dict[i]*(16**idx)
            #print(hex_dict[i], i, idx, integer)
        else:
            integer += int(i)*(16**idx)
    return integer_to_binary(integer)


decision = int(input("1. Binary -> Decimal\n2. Decimal -> Binary:\n3. Binary -> Hexadecimal\n4. Hexadecimal -> Binary\n >> ")) 
if decision == 1:
    num = input("Input your binary number: ")
    print(binary_to_integer(num))
elif decision == 2:
    num = int(input("Input your integer: "))
    print(str(integer_to_binary(num)))
elif decision == 3:
    num = input("Input your binary number: ")
    print(binary_to_hex(num))
elif decision == 4:
    num = input("Input your Hexadecimal value: ")
    print(hex_to_binary(num))


    
        



