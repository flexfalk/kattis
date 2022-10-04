import sys

class Interval:
    def __init__(self, s, f, w):
        self.s = s
        self.f = f
        self.w = w

    def __repr__(self):
        return str(self.f)

#input

intervals = []
first = True
n = 0
for line in sys.stdin:
    line = line.strip()

    if first:
        n = int(line)
        first = False
        continue

    s, f, w = line.split()
    interval = Interval(int(s), int(f), int(w))
    intervals.append(interval)


#sort by finnishing time
intervals.sort(key=lambda x: x.f)

#define binary search
def binarySearch(job, start_index):
    # Initialize 'lo' and 'hi' for Binary Search
    lo = 0
    hi = start_index - 1

    # Perform binary Search iteratively
    while lo <= hi:
        mid = (lo + hi) // 2
        if job[mid].f <= job[start_index].s:
            if job[mid + 1].f <= job[start_index].s:
                lo = mid + 1
            else:
                return mid
        else:
            hi = mid - 1
    return -1

ps = []
#
#making p(n)
for i,interval in enumerate(intervals):
    q = binarySearch(intervals, i)
    if q == -1:
        ps.append(0)
    else:
        ps.append(q+1)

#making the actual algortihm
M = [0 for j in range(len(intervals)+1)]
for j in range(1, len(intervals)+1):
    interval = intervals[j-1]

    #the two choices
    s1 = interval.w + M[ps[j-1]]
    s2 = M[j-1]
    M[j] = max(s1, s2)

print(M[-1])