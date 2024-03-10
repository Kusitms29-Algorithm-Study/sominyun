x = int(input())
arr = [[0 for _ in range(101)] for _ in range(101)]      
answer = 0

for i in range(x):
    a, b = list(map(int, input().split()))
    
    for row in range(a, a+10):
        for col in range(b, b+10):
            arr[row][col] = 1         

for a in arr:
    answer += a.count(1)      
print(answer)
