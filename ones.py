def smallest_ones_divisible(n):
    num = 1
    length = 1

    while num % n != 0:
        num = num * 10 + 1
        num %= n  # Keep remainder to avoid large number overflow
        length += 1

    return length

# Input
n = int(input("Enter a number: "))
print("Length of smallest number of 1's divisible by", n, "is:", smallest_ones_divisible(n))

