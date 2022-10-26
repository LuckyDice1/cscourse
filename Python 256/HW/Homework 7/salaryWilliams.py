''' 
    Course: CSCI 256, Section 1
    Student Name: John Asher Williams
    Student ID: 010925195
    Program 7
    Due Date: 10/21/22
    
    In keeping with the Honor Code of UM, I have neither given nor received 
    inappropriate assistance from anyone other than the TA or the instructor. 
    
    Program Description: Show growth of money over certain amount of days starting from $0.01
'''

# Get user input
days = int(input("Enter number of working days: "))

# Initialize outside loop variables
bal = 0.01
total = 0


# Print label
print("\nDay\tPay")
for i in range(1, days+1): # i = 1-userinput (inclusive)
    print(f"{i}\t${bal:.2f}")
    total += bal # Add to total
    bal += bal # Update balance

# display the total pay
print(f"\nThe total pay is ${total:.2f}")
    