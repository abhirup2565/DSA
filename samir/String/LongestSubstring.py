def longestSubstring(value):
    char_idx = {}
    left = 0 
    length = 0
    max_len=0

    for right,char in enumerate(value):
        if char in char_idx and char_idx[char] >= left:
            left=char_idx[char]+1
        char_idx[char] = right
        length = right - left + 1    
        max_len = max(max_len, length)
    return max_len

print(longestSubstring("abcabcbb"))


