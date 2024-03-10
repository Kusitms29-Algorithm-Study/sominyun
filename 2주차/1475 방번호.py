import sys
import math
input = sys.stdin.readline

n=input().rstrip()

d={}
for i in range(9): 
    d[str(i)]=0
    
for i in n:
    if i=='9':
        i='6' 
    d[i]+=1

d['6']=math.ceil(d['6']/2) 

max=0
for i in d:
    if d[i]>max:
        max=d[i]

print(max)


