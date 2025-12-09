def overlapping():
    intervals = [[1,3],[2,6],[8,10],[15,18]]
    
    if not intervals:
        return []
    
    # Sort intervals by start time
    intervals.sort()
    
    ans = [intervals[0]]  # Start with first interval
    
    for i in range(1, len(intervals)):
        # Check if current interval overlaps with last interval in ans
        if intervals[i][0] <= ans[-1][1]:
            # Merge: update the end to be the maximum of both ends
            ans[-1][1] = max(ans[-1][1], intervals[i][1])
        else:
            # No overlap, add current interval
            ans.append(intervals[i])
    
    print(ans)
    return ans

overlapping()