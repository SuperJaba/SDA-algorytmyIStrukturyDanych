package algorytmy;

import algorytmy.structures.MyList;

/**
 * Created by karamba on 2017-02-14.
 */
public class Application {
    public static void main(String[] args) {
        MyList myList = initMyList();
        MyList clonedList = myList.clone();
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
