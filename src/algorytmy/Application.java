package algorytmy;

import algorytmy.structures.MyList;
import algorytmy.structures.MyListInterface;

/**
 * Created by karamba on 2017-02-14.
 */
public class Application {
    public static void main(String[] args) {
        MyList myList = initMyList();
        MyListInterface clonedList = myList.clone();
        System.out.println(myList + " lista poczatkowa");
        System.out.println(clonedList + " clone");
        clonedList.add(5);
        System.out.println(myList);
        System.out.println(clonedList + " -clone");
        clonedList.delete(3);
        System.out.println(myList);
        System.out.println(clonedList + " -clone");
        clonedList.add(3, 11);
        System.out.println();
        System.out.println(clonedList);
        clonedList.put(3, 450);
        System.out.println(clonedList);
        System.out.println();
        myList.addAll(clonedList, 3);
        myList.addAll(clonedList);
        System.out.println(clonedList + " nowy test");
        System.out.println();
        System.out.println(myList);

    }

    private static MyList initMyList() {
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
        return myList;
    }
}
