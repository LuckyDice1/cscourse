def main():
    string1 = input("Enter a sentence: ")
    stringReversed = reverse(string1)
    print(f"{string1} reversed is {stringReversed}")

def reverse(string):
    return string[::-1]

def reverse(string):
    word2 = ""
    for i in reversed(string):
        word2 += i
    return word2

if __name__ == "__main__":
    main()