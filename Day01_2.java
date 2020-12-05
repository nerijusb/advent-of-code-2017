import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Part two of
 * https://adventofcode.com/2017/day/1
 *
 * @author Nerijus
 */
public class Day01_2 extends Day01_1 {
    public static void main(String[] args) {
        System.out.println("Captcha solution (2): " + new Day01_2().getResult());
    }

    private int getResult() {
        List<Integer> numbers = getNumbers();
        int sum = 0;

        int offset = numbers.size() / 2;
        for (int i = 0; i < numbers.size(); i++) {
            Integer current = numbers.get(i);
            Integer next = i + offset < numbers.size() ?
                    numbers.get(i + offset) :
                    numbers.get((i + offset) - numbers.size());

            if (current.equals(next)) {
                sum = sum + current;
            }
        }

        return sum;
    }
}
