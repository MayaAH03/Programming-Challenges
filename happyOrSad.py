'''
Problem Description: https://dmoj.ca/problem/ccc15j2
A program that determines the overall mood of a message,
by counting the number of :-( and :-) emoticons in a given message.
'''


text = input()
happyCounter = 0
sadCounter = 0

# Splitting each word in the string to analyze in for loop and counting each time a face is seen.
words = text.split()
for i in words:
    if ':-(' in i:
        sadCounter += 1
    elif ':-)' in i:
        happyCounter += 1

if happyCounter == 0 and sadCounter == 0:
    print('none')
elif happyCounter > sadCounter:
    print('happy')
elif sadCounter > happyCounter:
    print('sad')
elif happyCounter and sadCounter != 0:
    if happyCounter == sadCounter:
        print('unsure')