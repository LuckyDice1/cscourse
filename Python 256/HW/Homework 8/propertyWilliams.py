''' 
    Course: CSCI 256, Section 1
    Student Name: John Asher Williams
    Student ID: 010925195
    Program 8
    Due Date: 10/28/22
    
    In keeping with the Honor Code of UM, I have neither given nor received 
    inappropriate assistance from anyone other than the TA or the instructor. 
    
    Program Description: Return assessment value and tax value given the property value
'''

# Main Function
def main():
    property_value = float(input("Enter the actual value of your property: ")) # Get Property Value
    
    assessment_value = calcAsmt(property_value) # Get Assessment Value
    tax = calcTax(assessment_value) # Get Property Tax
    print(f"\nAssessment value of the property: ${assessment_value:.2f}\n" \
          f"Property tax: ${tax:.2f}")

    
# Calculate Assessment Value
def calcAsmt(pvalue:float):
    return pvalue * .6

#Calculate Property Tax
def calcTax(avalue:float):
    return .72 * (avalue // 100)
    
if __name__ == "__main__":
    main()