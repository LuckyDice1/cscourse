weight = float(input("How much do you weigh: ")) * 0.454
height = float(input("How tall are you: ")) * .0254
bmi = weight/height**2
print(f"Your BMI is {bmi:.2f}")