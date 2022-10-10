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

userInput = input("Enter your birthday in the form mm/dd/yyyy: ")
birthday_string = userInput.split("/")
mm = birthday_string[0]
dd = birthday_string[1]
year = birthday_string[2]
real_month = ""

month_list = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']

print(f"{month_list[int(mm)-1]} {dd}, {year}")

month_map = {"01": "January", 
             "02": "February", 
             "03":"March", 
             "04": "April", 
            "05":"May", 
            "06":"June", 
            "07":"July", 
            "08": "August", 
            "09": "September",
            "10": "October", 
            "11": "November", 
            "12":"December"}

print(month_map[mm])