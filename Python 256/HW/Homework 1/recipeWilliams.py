''' 
    Course: CSCI 111, Section 2
    Student Name: John Asher Williams
    Student ID: 010925195
    Program 1 
    Due Date: 9/9/22
    
    In keeping with the Honor Code of UM, I have neither given nor received 
    inappropriate assistance from anyone other than the TA or the instructor. 
    
    Program Description: Returns the needed measurements to make a given amount of cookies.
'''

import math

# Get cookie amount and convert to batch size, also handle floating points for prohibit user error
batch_amount = math.floor(float(input("Enter the number of cookies you want to make: ")))/48 

# Calculate
sugar, butter, flour = 1.5 * batch_amount, batch_amount, 2.75 * batch_amount

# Display
print(f"Using this cookie recipe, you need:\n {sugar:.2f} cups of sugar\n {butter:.2f} cups of butter\n {flour:.2f} cups of flour")