# An if statement creates a block of code that only runs when a condition is met
# Better documentation and examples listed here --> https://www.w3schools.com/python/python_conditions.asp

# Example
# if variable 'x' = 1, say "True"; otherwise say "False"

x = 1

if x == 1:  # Must use == operator in if, for, and while statements
    print("True")
else:  # This is the otherwise
    print("False")

# Another part of the if statement is specifying another condition if the other conditions aren't met
# To achieve this you use the "elif" statement

# Example
# if x doesn't = 1 but equals 0, say "x is 0"

x = 0

if x == 1:
    print("True")
elif x == 0:
    print("x is 0")
else:
    print("False")

# Real Example
# Say you have demographic data from your online store, and you only want to show certain items based on the
# user's gender. Conditional statements make this logic achievable.

user_gender = "Male"

if user_gender == "Male":
    print("Displaying Men's TShirts")
elif user_gender == "Female":
    print("Displaying Women's TShirts")
else:
    print("Unisex TShirts")