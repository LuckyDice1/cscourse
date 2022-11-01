from tkinter import E


def main():
    w1 = input("Enter a word: ")
    w2 = input("Enter another word: ")
    equal_or_not = words(w1, w2)
    if equal_or_not:
        print("The words are the same!")
    else:
        print("THe words are not the same")

def words(word1, word2):
    if word1 == word2:
        return True
    else:
        return False

if __name__ == "__main__":
    main()