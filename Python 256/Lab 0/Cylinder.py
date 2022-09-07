'''
Course: CSCI 256, Section 1
Student Name: John Asher Williams
Student ID: 010925195
Program: 0
Due Date: 8/31/2022

In keeping with the Honor Code of UM, I have neither given nor received assitance from anyone toehr than the TA or the instructor.

Program Description: Given the base radius and height, this program calculatres the base area and volume of a cylinder
'''

pi = 3.14159
r = float(input("What is the radius of the cylinder: "))
base_area = pi * r**2

h = float(input("What is the height of the cylinder: "))
volume = base_area * h
print(f'The cylinder with height {h:.2f} and radius {r:.2f} has a base area of {base_area:.2f} with a volume of {volume:.2f}')