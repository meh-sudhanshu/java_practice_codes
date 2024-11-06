def sequence_detector(transitions):
    state_dict = {}
    for present_state, next_state, input_val, output_val in transitions:
        if present_state not in state_dict:
            state_dict[present_state] = []
        state_dict[present_state].append((next_state, input_val, output_val))
    sequence = ""
    visited_states = set()
    initial_state = transitions[0][0]
    current_state = initial_state
    non_overlapping = False
    detected = False

    while not detected:
        visited_states.add(current_state)
        if current_state in state_dict:
            for next_state, input_val, output_val in state_dict[current_state]:
                sequence += input_val
                if output_val == "1":
                    detected = True
                    if next_state == initial_state:
                        non_overlapping = True
                current_state = next_state
                break
        else:
            break

    return sequence, non_overlapping


def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split("\n")
    transitions = [line.split() for line in data]

    sequence, non_overlapping = sequence_detector(transitions)

    print(sequence)
    if non_overlapping:
        print("Non Overlapping Sequence Detector")
    else:
        print("Overlapping Sequence Detector")


if __name__ == "__main__":
    main()
