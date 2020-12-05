import java.util.List;

/**
 * Part one of
 * https://adventofcode.com/2017/day/1
 *
 * @author Nerijus
 */
public class Day02_2 extends Day02_1 {
    public static void main(String[] args) {
        System.out.println("Checksum: " + new Day02_2().getResult());
    }

    @Override
    int calculateChecksum(List<Integer> rowNumbers) {
        for (Integer first : rowNumbers) {
            for (Integer second : rowNumbers) {
                if (first.equals(second)) {
                    continue;
                }
                if (first % second == 0) {
                    return first / second;
                }
            }
        }
        throw new IllegalStateException("Did not found number that evenly divide");
    }
}
