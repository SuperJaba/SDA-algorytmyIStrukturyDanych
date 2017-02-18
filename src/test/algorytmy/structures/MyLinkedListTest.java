package test.algorytmy.structures;

import algorytmy.structures.MyLinkedList;
import algorytmy.structures.MyList;
import algorytmy.structures.MyListInterface;

/**
 * Created by RENT on 2017-02-16.
 */
public class MyLinkedListTest {

    public static void main(String[] args) {

        MyListInterface myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.get(0));
        myLinkedList.add(5);
        System.out.println(myLinkedList.get(0));
        myLinkedList.add(3);
        myLinkedList.add(6);
        myLinkedList.add(8);
        myLinkedList.add(90);
        myLinkedList.add(2);
        System.out.println(myLinkedList.toString());
        myLinkedList.delete(3);
        System.out.println(myLinkedList.toString());
        myLinkedList.put(2, 333);
        System.out.println(myLinkedList.toString());
        MyListInterface someList = new MyList();
        someList.add(2);
        someList.add(4);
        someList.add(-1);
        System.out.println("Before and after some list");
        System.out.println(myLinkedList);
        myLinkedList.addAll(someList);
        System.out.println(myLinkedList);
        System.out.println();

        MyListInterface clonedLista = myLinkedList.clone();
        clonedLista.delete(2);
        System.out.println("After removing values  from cloned list");
        System.out.println(myLinkedList);
        System.out.println(clonedLista);
        System.out.println();

        System.out.println("Before and adding element on index 2");
        System.out.println(myLinkedList);
        myLinkedList.add(2, 555);
        System.out.println(myLinkedList);
        myLinkedList.add(0, 4343);
        System.out.println(myLinkedList);

        System.out.println("before and after adding all into");
        System.out.println(myLinkedList);
        System.out.println(someList);
        myLinkedList.addAll(someList, 2);
        System.out.println(myLinkedList);
    }

}
