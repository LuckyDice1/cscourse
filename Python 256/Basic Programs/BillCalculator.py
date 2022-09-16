bill = float(input("Enter your Subtotal: "))
g_rate = float(input("Enter the gratuity rate: "))
print(f"${bill:.2f} + ${(bill * (g_rate/100)):.2f} = ${(bill + (bill * (g_rate/100))):.2f}")