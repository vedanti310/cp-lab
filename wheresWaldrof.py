def search_word(grid, word):
    rows, cols = len(grid), len(grid[0])
    directions = [(-1,0), (1,0), (0,1), (0,-1), (-1,1), (-1,-1), (1,1), (1,-1)]

    word = word.lower()
    for i in range(rows):
        for j in range(cols):
            for dx, dy in directions:
                k = 0
                x, y = i, j
                while k < len(word):
                    if 0 <= x < rows and 0 <= y < cols and grid[x][y] == word[k]:
                        x += dx
                        y += dy
                        k += 1
                    else:
                        break
                if k == len(word):
                    return (i+1, j+1)
    return (-1, -1)

# Input
grid = [
    "abcDE",
    "FGHIJ",
    "KLMNO",
    "PQRST",
    "UVWXY"
]

grid = [list(row.lower()) for row in grid]
words = ["DEFG", "NOPQ", "LMNOP"]

for word in words:
    pos = search_word(grid, word)
    print(pos[0], pos[1])
