"""
vaiables: 
    ans
    sub
    counter

Flow: recursive
    base condition : substring is empty -> ans+counter(if any) -> print
    
    set character,set substring
    if include ans+counter+1
    if exclude -> conditional additon of counter in ans -> counter+1
"""

def abbreviation(ans:str, sub_string:str, counter:int) -> None:
    #base condition
    if not sub_string :
        if (counter!=0):
            ans = ans + str(counter)
        print(ans)
        return
    #flow 
    character = sub_string[0] 
    sub_string = sub_string[1:]
    #excluding
    abbreviation(ans,sub_string,counter+1)
    #including
    if counter == 0:
        abbreviation(ans+character,sub_string,0)
    else:
        abbreviation(ans+str(counter)+character,sub_string,0)
    return

abbreviation("","PEP",0)