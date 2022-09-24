''' 
    Course: CSCI 256, Section 1
    Student Name: John Asher Williams
    Student ID: 010925195
    Program 3
    Due Date: 9/23/22
    
    In keeping with the Honor Code of UM, I have neither given nor received 
    inappropriate assistance from anyone other than the TA or the instructor. 
    
    Program Description: When given name and digits return initials and sum of those digits.
'''

name = input("Enter first, middle, and last names, separate with a space: ").split()
digits = input("Enter a 4-digit integer: ")

digit_sum = 0
initials = ""
for i in digits:
    digit_sum += int(i)
for i in name:
    initials += i[0]

print("Your initials: %s" % initials.upper())
print("The sum of all digits is %d" % digit_sum)
    

