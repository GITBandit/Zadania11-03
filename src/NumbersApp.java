import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class NumbersApp {

    public static void main(String[] args) {

        NumbersLogic numbersLogic = new NumbersLogic();

        LinkedList<Integer> numbers = numbersLogic.readList("numbers.txt");

        TreeMap<Integer, Integer> map = numbersLogic.mapFromList(numbers);

        numbersLogic.printMap(map);

    }
}
