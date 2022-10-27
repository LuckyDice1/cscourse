import math

def main():
    r = float(input("What is the base radius of the cylinder?: "))
    h = float(input("What is the height of the cylinder?: "))
    v, ba = volume_area(r, h)
    print(f"The volume of the cylinder is {v:.2f} and the base area is {ba:.2f}.")


def volume_area(radius, height):
    b_area = math.pi*(radius**2)
    volume = b_area*height

    return volume, b_area



if __name__ == "__main__":
    main()