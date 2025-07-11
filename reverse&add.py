def is_palindrome(n):
    return str(n) == str(n)[::-1]

def reverse_and_add(n):
    count = 0
    while not is_palindrome(n):
        rev = int(str(n)[::-1])
        n += rev
        count += 1
    return count, n

# Input from user
number = int(input("Enter a number: "))
steps, result = reverse_and_add(number)
print(steps, result)
