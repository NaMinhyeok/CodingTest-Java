L = int(input())
current_s = input()
s_len = len(current_s)

p_table = [0 for _ in range(s_len)]
j = 0
for i in range(1, s_len):
    while j > 0 and current_s[i] != current_s[j]:
        j = p_table[j-1]
    if current_s[i] ==current_s[j]:
        j += 1
        p_table[i] = j
p_len = s_len - p_table[s_len - 1]
print(p_len)

