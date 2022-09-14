v0 = float(input("Velocity 1: "))
v1 = float(input("Velocity 2: "))
t = float(input("Time: "))

accel = (v1-v0)/t

print(f"The acceleration is {accel:.2f} m/s")