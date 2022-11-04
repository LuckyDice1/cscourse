''' 
    Course: CSCI 256, Section 1
    Student Name: John Asher Williams
    Student ID: 010925195
    Program 9
    Due Date: 11/4/22
    
    In keeping with the Honor Code of UM, I have neither given nor received 
    inappropriate assistance from anyone other than the TA or the instructor. 
    
    Program Description: Outputs the prime numbers in between a given range
'''

# Main Function
def main():
    # initialize variables
    num_of_primes = 0
    primes = ""

    # Loop through 2 - 100
    for i in range(2, 101):
        # Get if its a prime number or not
        output = isPrime(i)
        # Check
        if output != -1:
            # Accumulate and save
            primes += f"{output} "
            num_of_primes += 1
    print("The prime numbers from 1 through 100:")
    print(primes)
    print(f"There are {num_of_primes} prime numbers.")

# User - Defined function
def isPrime(num):
    end_range = num if num < 10 else 10
    for i in range(2, end_range):
        if num % i == 0:
            return -1
    return num

main()