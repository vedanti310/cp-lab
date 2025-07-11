def count_hartal_days(n, hartal_params):
    days = [False] * (n + 1)
    
    for h in hartal_params:
        for day in range(h, n + 1, h):
            if day % 7 == 6 or day % 7 == 0:  # Skip Friday (6) and Saturday (0)
                continue
            days[day] = True
    
    return sum(days)

# Input
n = int(input("Enter number of days: "))
p = int(input("Enter number of parties: "))
hartal_params = []

for _ in range(p):
    hartal_params.append(int(input("Enter hartal parameter: ")))

# Output
print("Total hartal days:", count_hartal_days(n, hartal_params))
