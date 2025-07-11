def time_to_minutes(t):
    h, m = map(int, t.split(":"))
    return h * 60 + m

def minutes_to_time(m):
    return f"{m // 60:02d}:{m % 60:02d}"

appointments = []
n = int(input("Enter number of appointments: "))

print("Enter appointments (start end):")
for _ in range(n):
    start, end = input().split()
    appointments.append((time_to_minutes(start), time_to_minutes(end)))

# Add boundaries for working hours
appointments.append((600, 600))  # 10:00
appointments.append((1080, 1080))  # 18:00

appointments.sort()
max_nap = 0
nap_start = 600

for i in range(len(appointments) - 1):
    end_current = appointments[i][1]
    start_next = appointments[i + 1][0]

    if start_next - end_current > max_nap:
        max_nap = start_next - end_current
        nap_start = end_current

print(f"Longest nap starts at {minutes_to_time(nap_start)} and will last for {max_nap} minutes.")
