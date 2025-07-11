def calculate_exchange(expenses):
    n = len(expenses)
    total = sum(expenses)
    avg = total / n
    give_back = 0.0

    # Truncate to the nearest cent to avoid overcounting
    for amount in expenses:
        if amount > avg:
            give_back += int((amount - avg) * 100) / 100.0

    return give_back

# Input reading
expenses = []
while True:
    n = int(input("Enter number of students (0 to exit): "))
    if n == 0:
        break
    expenses = []
    for _ in range(n):
        amount = float(input("Enter expense: $"))
        expenses.append(amount)

    result = calculate_exchange(expenses)
    print(f"${result:.2f}")
