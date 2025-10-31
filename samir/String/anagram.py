"""
approach 1:
    need to use default dict: doesnot give error if already uninitalised dict is used
    sorted return list containg each char in sorted order -> so we perform join 
    sort and store in dict with inceasing counter
approach 2:
    
"""
from collections import defaultdict


# #approach 1
# def anagram_finder(strs):
#     anagram = defaultdict(list)
#     for word in strs:
#         sorted_word = ''.join(sorted(word))
#         anagram[sorted_word].append(word)
#     return list(anagram.values())

def anagram_finder(strs):
    anagrams = defaultdict(list)

    for word in strs:
        count = [0] * 26  # for 'a' to 'z'
        for c in word:
            count[ord(c) - ord('a')] += 1
        anagrams[tuple(count)].append(word)

    return list(anagrams.values())

Input = ["eat","tea","tan","ate","nat","bat"]
print(anagram_finder(Input))