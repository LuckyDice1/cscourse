# While loops allow you to loop until you tell it to stop instead of until you can't iterate anymore over something
# Better Documentation and Examples here --> https://www.w3schools.com/python/python_while_loops.asp

# Say we want something to loop only while the sun is up. Lets make a variable for this 

sun_is_up = True

# This is a boolean value (True or False | 1 or 0)

# Lets have our program say "Good Day!" while the sun is up using a while loop
# While the sun is up, print "Good Day"

from time import sleep
while sun_is_up:
    print("Good Day")
    sleep(5)
#Prints "Good Day" every 5 seconds while the sun is up
# W.I.P
