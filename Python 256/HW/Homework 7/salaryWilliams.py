days = int(input("Enter number of working days: "))
bal = 0.01
total = 0



print("Day\tPay")
for i in range(1, days+1):
    print(f"{i}\t${bal}")
    total += bal
    bal += bal
    