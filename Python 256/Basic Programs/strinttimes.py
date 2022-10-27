def main():
    sentence = input("Enter a message to send: ")
    num = int(input("How many times would you like to print the message?: "))
    str_int_times(sentence, num)

def str_int_times(sen: str, num: int):
    sen = f"{sen}\n"
    print(sen*num)

if __name__ == "__main__":
    main()