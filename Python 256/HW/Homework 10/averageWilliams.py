''' 
    Course: CSCI 256, Section 1
    Student Name: John Asher Williams
    Student ID: 010925195
    Program 10
    Due Date: 11/11/22
    
    In keeping with the Honor Code of UM, I have neither given nor received 
    inappropriate assistance from anyone other than the TA or the instructor. 
    
    Program Description: Display grades and average of grades
'''


# Main Function
def main():
    num_of_grades = int(input("How many grades would you like to enter?: "))
    scores = [int(input("Enter a grade: ")) for _ in range(num_of_grades)]
    grades = [convertToLetter(i) for i in scores]
    
    print(f"\nHere are the letter grades: {grades}")
    print(f"The average is: {calcAvg(scores):.2f}")

# User-Defined convert score to letter function
def convertToLetter(grade):
    if grade >= 90:
        return 'A'
    elif grade >= 80:
        return 'B'
    elif grade >= 70:
        return 'C'
    elif grade >= 65:
        return 'D'
    else:
        return 'F'
    
# User-Defined calculate average function
def calcAvg(grades):
    total = 0
    for i in grades:
        total += i
        
    return total/len(grades)

#call main
main()