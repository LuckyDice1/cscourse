''' 
    Course: CSCI 256, Section 1
    Student Name: John Asher Williams
    Student ID: 010925195
    Program 5
    Due Date: 10/7/22
    
    In keeping with the Honor Code of UM, I have neither given nor received 
    inappropriate assistance from anyone other than the TA or the instructor. 
    
    Program Description: Display birthday in normal format from mm/dd/yyyy format
'''

# Create a dictionary to convert mm to its respective month
month_map = {"01": "January", "02": "February", "03":"March", "04": "April", 
            "05":"May", "06":"June", "07":"July", "08": "August", "09": "September",
            "10": "October", "11": "November", "12":"December"}

# Prompt for input birthday
birthday = input("Enter your birthday in the form mm/dd/yyyy: ")

# Split Birthday into month, day, and year
birthday_split = birthday.split("/")

# Print in correct format
print(f"You were born on {month_map[birthday_split[0]]} {birthday_split[1]}, {birthday_split[2]}.\n")

# Print "Hotty Toddy!" three times on different lines
print("Hotty Toddy!\n"*3)
