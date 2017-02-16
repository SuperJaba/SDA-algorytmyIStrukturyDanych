package test.algorytmy.structures;

import algorytmy.structures.MyLinkedList;
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

    }
}
