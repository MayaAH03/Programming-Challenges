'''
Problem Description: https://dmoj.ca/problem/ccc09s1
A cool number is a number that is both a perfect square and perfect cube.
Given the range a to b, return the number of cool numbers in that range.
'''


import math

def isPerfectSquare(num):
    if num < 0:
        return False
    perfectSquareRoot = math.isqrt(num)
    if num == (perfectSquareRoot**2):
        return True
    else:
        return False


def isPerfectCube(num):
    if num < 0:
        return False
    perfectCubeRoot = round(num ** (1/3))
    if num == (perfectCubeRoot**3):
        return True
    else:
        return False

a = int(input())
b = int(input())
coolNumberCounter = 0
for i in range(a,b+1):
    if isPerfectCube(i) == True and isPerfectSquare(i) == True:
        coolNumberCounter += 1

print(coolNumberCounter)