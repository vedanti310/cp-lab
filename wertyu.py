def decode_qwerty_shift(text):
    keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./"
    mapping = {}

    for i in range(1, len(keyboard)):
        mapping[keyboard[i]] = keyboard[i - 1]

    result = ""
    for ch in text:
        if ch in mapping:
            result += mapping[ch]
        else:
            result += ch  # Keep spaces, newline, etc.

    return result

# Input
input_text = input("Enter the encoded text:\n")
print("Decoded text:\n", decode_qwerty_shift(input_text.upper()))
