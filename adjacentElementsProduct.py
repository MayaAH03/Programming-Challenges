'''
 Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.
'''


def solution(inputArray):
    final = -100        #To allow for negative numbers for array.
    for i in range(0, len(inputArray) - 1):
        x = inputArray[i]
        y = inputArray[i + 1]
        product = x * y
        if product > final:
            final = product
    return final


