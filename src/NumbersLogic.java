import jdk.nashorn.api.tree.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NumbersLogic {

    public LinkedList<Integer> readList(String fileName){

        LinkedList<Integer> readList = new LinkedList<>();
        File file = new File(fileName);


        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                readList.add(scan.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readList;
    }

    public TreeMap<Integer, Integer> mapFromList(LinkedList<Integer> list){

        TreeMap<Integer,Integer> map = new TreeMap<>();


        while (!list.isEmpty()){
            if(!map.containsKey(list.peek())){
                map.put(list.poll(), 1);
            } else {
                int occurences = map.get(list.peek());
                map.put(list.poll(), occurences + 1);
            }
        }

        return map;

    }

    public void printMap(Map<Integer,Integer> map){
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next + " - liczba wystąpień : " + map.get(next));
        }
    }
}
