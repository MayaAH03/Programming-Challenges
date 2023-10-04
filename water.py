'''
Problem Description: https://dmoj.ca/problem/avatarwater
There will be 3 lines of input in no particular order.
Lines 1, 2, and 3 will each contain the weight of a jar,
one of which will include the fish. The program must output a single line,
which will contain a single integer – the weight of the fish.
'''

jar1 = int(input())
jar2 = int(input())
jar3 = int(input())
jars =[jar1,jar2,jar3]
heaviest = max(jars)
lightest = min(jars)

fishWeight = heaviest - lightest
print(fishWeight)
