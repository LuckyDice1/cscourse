def main():
    base = float(input("Enter the base of the triangle: "))
    height = float(input("Enter the height of the triangle: "))
    print(f"The area of the triangle is {area(base, height):.2f}")

def area(b, h):
    return (1/2) * b * h

if __name__ == "__main__":
    main()