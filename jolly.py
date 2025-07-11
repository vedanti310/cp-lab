def is_jolly_jumper(sequence):
    n = sequence[0]
    nums = sequence[1:]

    if len(nums) != n:
        return "Invalid Input"

    diffs = set()
    for i in range(n - 1):
        diff = abs(nums[i] - nums[i + 1])
        if 1 <= diff < n:
            diffs.add(diff)

    if diffs == set(range(1, n)):
        return "Jolly"
    else:
        return "Not jolly"

# Example input
input_line = input("Enter sequence (e.g., 4 1 4 2 3): ")
sequence = list(map(int, input_line.strip().split()))
print(is_jolly_jumper(sequence))
