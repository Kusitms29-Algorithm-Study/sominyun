import sys; input = sys.stdin.readline
N, M = map(int, input().split())

pack = [0] * M
one = [0] * M
for i in range(M):
    pack[i], one[i] = map(int, input().split())
min_pack, min_one = min(pack), min(one)

if min_pack > min_one * 6:
    print(N*min_one)
else:
    if (N % 6) * min_one < min_pack:
        print(((N // 6) * min_pack) + ((N % 6) * min_one))
    else:
        print(((N // 6) + 1) * min_pack)
