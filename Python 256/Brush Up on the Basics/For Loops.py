# A for loop allows your code to run over and over based on what you are looping over (or what your objective is)
# (This may be confusing at first but give it a sec haha)
# Better documentation and examples listed her --> https://www.w3schools.com/python/python_for_loops.asp


# For our examples we will need some data to loop (iterate is the proper term) over
# Lets make a list

students = ["Asher", "Landon", "Malik", "Ethan"]

# Lets say we want to display every name in the list. We must loop over every item in the list and then say it
# This is where the for loop comes into play

# Explained without code...
# A for loop stores each item on every loop in a variable with a label of your choice, inside the loop code
# you can access this variable and the variable will update to the next item in the list every iteration (loop)

# Our variable of choice this time will be the letter "i" (this is generally what's used but I will show an example
# with a normally named variable as well)

for i in students: # For each item in the list "students", "i" will be the variable to reference it each loop
    print(i)

for student in students: # Serves the same purpose as above, remember readability is very important
    print(student)


# YOU CAN COMBINE FOR LOOPS AND IF STATEMENTS FOR MORE LOGIC

# If the student name "Asher" shows up then we will print "Asher is the coolest" (because he is)

for student in students:
    if student == "Asher":
        print("Asher is the coolest!")
    else:
        print(student)