def main():
    num1 = int(input("Enter the first integer: "))
    num2 = int(input("Enter the second integer: "))
    print(diffsum(num1, num2))

def diffsum(x, y):
    return x-y if x > y else x+y

if __name__ == "__main__":
    main()