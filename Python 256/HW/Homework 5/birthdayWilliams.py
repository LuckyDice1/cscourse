alphabet = "abc def ghi jkl mno pqrs tuv wxyz"
numpad = alphabet.split()
sent = "yes"

while sent != "no":
    # Prompt for input
    letter = input("\nEnter a letter: ").lower()
    # Check if letter is valid
    if letter in alphabet:
        # Search each numpad key for letter
        for i in numpad:
            # If letter in numpad key
            if letter in i:
                # save the index of that numpad key 
                number = numpad.index(i)+2
                print(f"The corresponding number is {int(number)}")
    else:
        print(f"'{letter}' is an invalid letter")
    # Check if user wants to continue
    sent = input("\nDo you want to enter another letter? (enter yes or no)?: ").lower()
