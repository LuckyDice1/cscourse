''' 
    Course: CSCI 256, Section 1
    Student Name: John Asher Williams
    Student ID: 010925195
    Program 3
    Due Date: 9/23/22
    
    In keeping with the Honor Code of UM, I have neither given nor received 
    inappropriate assistance from anyone other than the TA or the instructor. 
    
    Program Description: Given amount of shares purchased per share, display transaction information
'''



share_amount = int(input("Enter number of shares that you purchased: "))
sharerate_buy = round(float(input("Enter the amount you paid per share: ")), 2)
share_amount_sell = int(input("Enter number of shares that you sold two weeks later: "))
sharerate_sell = round(float(input("Enter the amount you sold per share: ")), 2)
sub_total = share_amount*sharerate_buy
broker_buy = sub_total * 0.03
total_buy = sub_total + broker_buy
sub_total_sell = share_amount_sell * sharerate_sell
broker_sell = sub_total_sell * 0.03
total_sell = sub_total_sell - broker_sell
profit = total_sell - total_buy
result = None

if profit > 0:
    result = "You made a profit!"
elif profit == 0:
    result = "You literally made no money."
else:
    result = "Sorry, you lost money :("

print(f'\nYour stock transaction info:\n\n\
The amount of money you paid for the stock: ${sub_total:.2f} \n\
The amount of commission you paid when you bought the stock: ${broker_buy:.2f} \n\n\
The amount of money you sold for the stock: ${sub_total_sell:.2f} \n\
The amount of commission you paid when you sold the stock: ${broker_sell:.2f} \n\n\
The amount of money left: ${profit:.2f} \n\
{result}')