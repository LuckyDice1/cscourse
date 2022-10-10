def fibonacci(num=0, last_num=0):
    print(num)
    if num == 0:
        new_num = 1
    elif num == 1:
        new_num = num + last_num
        last_num = 1
    else:
        new_num = num+last_num
        
    return fibonacci(num=new_num, last_num=num)

fibonacci()