'''
Course CSCI 256, Section 1
Student Name: John Asher Williams
Student ID: 010925195
Program: 2
Due Date: 9/16/22

In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone other than the instructor.
Program Description: Given the 3 sides of a triangle in CM, get the area
'''
from math import sqrt


x = float(input("Enter side x in inches: "))*2.54
y = float(input("Enter side y in inches: "))*2.54
z = float(input("Enter side z in inches: "))*2.54
s = (1/2) * (x+y+z)

area = sqrt((s*(s-x)*(s-y)*(s-z)))
print(f"For a triangle for sides {x:.2f} cm, {y:.2f} cm, and {z:.2f} cm\nArea = {area:.2f} square cm")