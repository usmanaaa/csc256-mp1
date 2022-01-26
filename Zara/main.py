###############################################################################
# EMAIL: zara.khan@baruchmail.cuny.edu
# STUDENT_ID: 2652627
# File: main.py
# Purpose: Exam 2
###############################################################################

###############################################################################
# Answer as many of the questions as you can
# If you are unable to solve a function, please leave it as it is.
# 
# The questions will make use of:
#   [unique word]   your 7-letter unique word (all lower-case)
#   [unique number] your 5-digit unique number
#   [largest digit] largest digit in your unique number
#   [first digit]   first digit in your unique number
#
# For all the examples mentioned, we assume a student named Jane Doe with:
#   [unique word]   "orchids"
#   [unique number] 12545
#   [largest digit] 5
#   [first digit]   1
###############################################################################



###############################################################################
# Question 1:
#
# Function Name: isSpecialPair
# Function Parameters: a, b (both assumed to be integers)
# Function Returns: True or False (see description below)
#
# Modify the boolean function such that it returns:
#
# True : if a and b are not equal to each other and one of them is equal
# to [unique number]
# 
# False: if the above conditions are not met
#
# Examples for Jane Doe:
#    isSpecialPair(7,9) returns False
#    isSpecialPair(7,12545) returns True
#    isSpecialPair(12545,12545) returns False
#
###############################################################################
def isSpecialPair(a,b):
    unique_num = 11217
    
    if((a is not b) and (a is unique_num or b is unique_num)):
        return True
    else:
        return False

###############################################################################
# Question 2: 
#
# Function Name: isAllEven
# Function Parameters: a, b, c (all assumed to be integers)
# Function Returns: True or False (see description below)
#
# Modify the boolean function such that it returns:
#
# True : if a, b, and c are  all even and at the same time they are all greater
# than [largest digit] and less than [unique number]
#
# False: otherwise
#
# Examples for Jane Doe:
#    isAllEven(4,4,4) returns False
#    isAllEven(8,7,120) returns False
#    isAllEven(8,12,12540) returns True
#
###############################################################################
def isAllEven(a, b, c):
    largest_digit = 7
    unique_num = 11217
    
    if (a % 2 == 0 and b % 2 == 0 and c % 2 == 0) and (a > largest_digit and b > largest_digit and c > largest_digit) and (a < unique_num and b < unique_num and c < unique_num):
        return True
    else:
        return False

###############################################################################
# Question 3: 
#
# Function Name: recurse
# Function Parameters: num (assumed to be an integer)
# Function Returns: a number based on the description below
#
# Modify the function such that it returns:
#
# if num < 1 then return [largest digit]
# otherwise, if num is odd then return [largest digit] * recurse(num-1)
#            if num is even then return [largest digit] * recurse(num-3)
#
# Examples for Jane Doe:
#    recurse(0) returns 5
#    recurse(1) returns 25
#    recurse(5) returns 625
#
###############################################################################
def recurse(num):
    largest_digit = 7
    if num < 1:
        return largest_digit
    else:
        if num % 2 != 0:
            return largest_digit * recurse(num - 1)
        if num % 2 == 0:
            return largest_digit * recurse(num - 3)


###############################################################################
# Question 4: 
#
# Function Name: repeat
# Function Parameters: sym (assumed to be str) and num (assumed to be int) 
# Function Returns: a string (str) based on the description below
#
# Modify the function such that it returns:
#
# If sym is equal to any of the letters of [unique word] in lower case, then 
# return a string that is '!' repeated (num+[first digit]) times.
#
# Otherwise, if the above conditions are not met, return the string '?'
#
# Examples for Jane Doe:
#    repeat('o',4) returns '!!!!!' (5 exclamations)
#    repeat('R',2) returns '?'
#    repeat('s',0) returns '!'
#
# Note: in the 2nd Example, even though R is in 'orchids', R is upper case
###############################################################################
def repeat(sym, num):
    unique_word = 'optimal'
    first_digit = 1
    if sym in unique_word:
        return '!' * (num + first_digit)
    else:
	    return '?'

###############################################################################
# Question 5: 
#
# Function Name: hasDivisors
# Function Parameters: num, f 
# Function Returns: True or False based on the description below  
# 
# We have discussed Prime numbers in our class discussions. A prime numbers is
# such that it only has two divisors: 1 and the  prime number itself. These
# are the only two numbers between 1 and the prime number (inclusive) that 
# evenly divides it. 
# 
# Modify the function such that it returns:
#
# True, if num has exactly f number of divisors and [largest digit] is one 
# of the divisors.
# 
# False, if the above conditions are not met or if any exceptions are raised
# during the processing of your function (e.g. num is not a number). 
#
# Examples for Jane Doe:
#    hasDivisors(25,3) returns True 
# 	   (note: 25 has 3 divisors: 1, 5, 25 and one of them (5) is largest digit)
#
#    hasDivisors('25!','x') returns False
#      (the params are not numbers, exception is handled and False returned)
# 
#	 hasDivisors(30,8) returns True
#      (there are indeed eight divisors: 1, 2, 3, 5, 6, 10, 15, and 30)
#      (one of them is 5 -- the largest digit for Jane)
#     
###############################################################################
def hasDivisors(num,f):
    divisors = []
    largest_digit = 7
    
    if type(num) == int:
        for i in range(1, num + 1):
            if num % i == 0:
                divisors.append(i)
                
        if len(divisors) == f and largest_digit in divisors:
            return True
        else:
            return False
    else:
        return False

###############################################################################
# You do not have to use this testing process, you can test out in your own way
# Test function Jane might use to test out her functions...
# Please note: these values are specific to Jane...
###############################################################################
def testMyFunctions():
    
    print('--- Question 1 (isSpecialPair) --- ')
    print(isSpecialPair(7,9)) # expecting False
    print(isSpecialPair(7,12545)) # expecting True
    print(isSpecialPair(12545,12545)) # expecting False
    
    print('--- Question 2 (isAllEven) --- ')
    print(isAllEven(4,4,4)) # expecting False
    print(isAllEven(8,7,120)) # expecting False
    print(isAllEven(8,12,12540)) # expecting True
    
    
    print('--- Question 3 (recurse) --- ')
    print(recurse(0) ) # expecting 5
    print(recurse(1))  # expecting 25
    print(recurse(5))  # expecting 625
    
    print('--- Question 4 (repeat) --- ')
    print(repeat('o',4) ) # expecting '!!!!!' (5 exclamations)
    print(repeat('R',2))  # expecting '?'
    print(repeat('s',0))  # expecting '!'
    
    
    print('--- Question 5 (repeat) --- ')
    print(hasDivisors(25,3) )      # expecting True
    print(hasDivisors('25!','x'))  # expecting False
    print(hasDivisors(30,8))  # expecting True
    
    
    
    

###############################################################################
# MAIN BODY OF PROGRAM
###############################################################################
# You are free to write any test code you wish here...



