def getWordList():
    '''
    This function reads in a file called: words.txt
    and returns a list of words from the file...
    '''
    wordList = []

    # if you have the file words.txt in the same folder/directory
    # where you run this program from, you won't
    # need to change the path. Otherwise,
    # change the path below to where your actual file is...
    with open('words.txt','r') as fileObject:    
        lines = fileObject.readlines()
        for line in lines:
            wordList.append(line.strip())
         
    return wordList


def getScrabbleLetterScore(letter):
    ''' (incomplete sample function) that gets the score of a letter '''
    ''' HINT: how about using a dictionary, instead of if-elif-elif? '''
    mapping = {('a','e','i','o','u','n','r','t','l','s'): 1, ('d','g'): 2, ('b','c','m','p'): 3, ('f','h','v','w','y'): 4, ('k'): 5, ('j','x'): 8, ('q','z'): 10}
    for key, value in mapping.items():
        if letter in key:
            return value
    
def getScrabbleWordScore(word):
    ''' sample function could be used to get score of a word '''
    score = 0
    for letter in word:
        score += getScrabbleLetterScore(letter)
    return score


def getTotalScore(wordList):
    totalScore = 0
    for word in wordList:
        totalScore += getScrabbleWordScore(word)
        
    return totalScore

def getA(wordList):
    A = 0
    for word in wordList:
        if word.startswith('o'):
            print(word)
            A += getScrabbleWordScore(word)
    return A

def getB(wordList):
    B = 0
    for word in wordList:
        if word.endswith('l'):
            print(word)
            B += 1
    return B
###############################################################################
# main program # remember to print only the output(s) I want
###############################################################################

wordList = getWordList()
print(getB(wordList) +  getA(wordList))