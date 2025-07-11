def cycle_length(n):
    count = 1
    while n != 1:
        if n % 2 == 0:
            n = n // 2
        else:
            n = 3 * n + 1
        count += 1
    return count

def max_cycle(i, j):
    a, b = min(i, j), max(i, j)
    max_len = 0
    for num in range(a, b + 1):
        length = cycle_length(num)
        if length > max_len:
            max_len = length
    return max_len

# Example usage
i, j = map(int, input("Enter two numbers (i j): ").split())
print(i, j, max_cycle(i, j))
