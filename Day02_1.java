import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * Part one of
 * https://adventofcode.com/2017/day/1
 *
 * @author Nerijus
 */
public class Day02_1 {
    public static void main(String[] args) {
        System.out.println("Checksum: " + new Day02_1().getResult());
    }

    int getResult() {
        return Inputs.readStrings("Day02")
                .stream()
                .map(row -> Arrays.stream(row.split("\\s+")).map(Integer::parseInt).collect(toList()))
                .mapToInt(this::calculateChecksum)
                .sum();
    }

    int calculateChecksum(List<Integer> rowNumbers) {
        int max = rowNumbers.stream().mapToInt(n -> n).max().orElseThrow();
        int min = rowNumbers.stream().mapToInt(n -> n).min().orElseThrow();
        return max - min;
    }
}
