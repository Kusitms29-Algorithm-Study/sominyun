from sys import stdin


T = int(stdin.readline())

for test_case_idx in range(T):
   
    a, b = map(int, stdin.readline().split(' '))
    last_number = pow(a, b, 10)

    if last_number == 0:
        print(10)
    else:
        print(last_number)
