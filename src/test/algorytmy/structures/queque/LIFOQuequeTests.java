package test.algorytmy.structures.queque;

import algorytmy.structures.queque.AbstarctQueque;
import algorytmy.structures.queque.LIFOQueque;
import algorytmy.structures.queque.Queque;
import algorytmy.structures.queque.QueueException;

/**
 * Created by Super JABA on 19.02.17.
 */
public class LIFOQuequeTests {
    public static void main(String[] args)  {
        Queque lifoQueque = new LIFOQueque();
        try {
            lifoQueque.pop();
        } catch (QueueException e) {
            e.printStackTrace();
        }
        lifoQueque.push(1);
        lifoQueque.push(2);
        lifoQueque.push(3);
        lifoQueque.push(4);
        lifoQueque.push(5);
        System.out.println(lifoQueque);
        System.out.println();

        AbstarctQueque cloned = (AbstarctQueque) lifoQueque.clone();
        System.out.println(cloned + " -test metody clone");
        cloned.push(6);
        cloned.push(0);
        System.out.println(cloned + " -dopisanie 6 wartosci do clone");
        System.out.println(lifoQueque + " -podstawowa kolejka");
//test usuwania
//        cloned.pop();
//        System.out.println(cloned + " -wynik usuwania");
    }
}
