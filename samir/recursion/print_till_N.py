def till_N(n,current):
    if(current>n):
        return
    print(current)
    till_N(n,current+1)

till_N(3,1)