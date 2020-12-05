import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Part one of
 * https://adventofcode.com/2017/day/1
 *
 * @author Nerijus
 */
public class Day01_1 {
    public static void main(String[] args) {
        System.out.println("Captcha solution: " + new Day01_1().getResult());
    }

    private int getResult() {
        List<Integer> numbers = getNumbers();

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            Integer current = numbers.get(i);
            Integer next = i + 1 == numbers.size() ? numbers.get(0) : numbers.get(i + 1);
            if (current.equals(next)) {
                sum = sum + current;
            }
        }

        return sum;
    }

    List<Integer> getNumbers() {
        return Arrays.stream(Inputs.readString("Day01").split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
