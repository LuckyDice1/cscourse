def main():
    binary = input("Enter a binary number: ")
    if binary_validation(binary):
        print("It is a valid binary number.")
    else:
        print("Not a valid binary number")

def binary_validation(num:str):
    for i in range(2,10):
        if str(i) in num:
            return False
    return True

if __name__ == "__main__":
    main()