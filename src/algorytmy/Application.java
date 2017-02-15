package algorytmy;

import algorytmy.structures.MyList;

/**
 * Created by karamba on 2017-02-14.
 */
public class Application {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(2);
        myList.add(3);
        myList.add(-3);
        myList.add(-1);
        myList.add(0);
        myList.add(2);
        myList.add(5);
        myList.add(5);
        myList.add(5);
        myList.add(4);
        myList.add(-4);
        System.out.println(myList.get(3));
    }
}
