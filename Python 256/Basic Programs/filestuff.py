outputFile = open("Basic Programs/testfile.txt", 'w')

for i in range(1, 11):
    outputFile.write(str(i) + "\n")

outputFile.close()

inputFile = open("Basic Programs/testfile.txt", 'r')
data = inputFile.read().split("\n")
print(data)

