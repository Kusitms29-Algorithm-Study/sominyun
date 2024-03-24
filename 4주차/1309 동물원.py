import sys
input = sys.stdin.readline
 
n = int(input())
 
d = [[0]*3 for _ in range(n+1)]
d[1] = [1,1,1]
for i in range(2,n+1):
    for j in range(3):
        if j ==0:
            d[i][j] = sum(d[i-1])%9901
        elif j==1:
            d[i][j] = (d[i-1][0]+d[i-1][2])%9901
        else:
            d[i][j] = (d[i-1][0]+d[i-1][1])%9901
 
print(sum(d[n])%9901)
