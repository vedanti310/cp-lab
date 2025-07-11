def vito_family(houses):
    houses.sort()
    median = houses[len(houses) // 2]
    distance = sum(abs(h - median) for h in houses)
    return distance

# Example usage
relatives = list(map(int, input("Enter house numbers: ").split()))
print("Minimum total distance:", vito_family(relatives))
