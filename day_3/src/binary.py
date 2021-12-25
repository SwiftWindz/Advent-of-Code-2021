"""
Advent of Code day 3 part 1
@Author Phil Ganem
"""

def part_one(input_file):
    code = {
        0: 0, 1: 0, 2: 0, 3: 0, 4: 0, 5: 0,
        6: 0, 7: 0, 8: 0, 9: 0, 10: 0, 11: 0
    }
    binary_input = open(input_file, 'r')
    for line in binary_input:
        binary_string = line.strip()
        for i in range(0, len(binary_string)):
            if binary_string[i] == '1':
                code[i] += 1
            elif binary_string[i] == '0':
                code[i] -= 1

    gamma = ""
    epsilon = ""
    for key in code.keys():
        if code[key] < 0:
            gamma += '0'
            epsilon += '1'
        if code[key] > 0:
            gamma += '1'
            epsilon += '0'

    gamma_int = int(gamma, 2)
    epsilon_int = int(epsilon, 2)
    print("Gamma: " + gamma)
    print("Epsilon: " + epsilon)
    print("Gamma int: " + str(gamma_int))
    print("Epsilon int: " + str(epsilon_int))
    print("Part one solution: " + str(gamma_int * epsilon_int))

def main():
    input_file = 'day_3\data\data.txt'
    part_one(input_file)

if __name__ == "__main__":
    main()