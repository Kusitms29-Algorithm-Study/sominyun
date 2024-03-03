N = int(input())
data = []
check = [0 for _ in range(27)]
answer = ""
for i in range(N):
    data.append(input())

for i in data:
    check[ord(i[0]) - 96] += 1

for i in range(27):
    if check[i] >= 5:
        answer += chr(i+96)

if answer == "":
    print("PREDAJA")
else:
    print(answer)
