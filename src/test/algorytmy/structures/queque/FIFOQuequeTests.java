package test.algorytmy.structures.queque;

import algorytmy.structures.queque.FIFOQueque;
import algorytmy.structures.queque.Queque;
import algorytmy.structures.queque.QueueException;

public class FIFOQuequeTests {
    public static void main(String[] args) throws QueueException {
        Queque queque = new FIFOQueque();
        queque.pop();
        queque.push(2);
        queque.push(3);
        queque.push(-1);
        System.out.println(queque);

//        queque.pop();
//        queque.pop();
//        queque.pop();
//        queque.pop();
        System.out.println(queque);
        Queque clonedQue = queque.clone();
        System.out.println(clonedQue);
        clonedQue.pop();
        System.out.println(queque);
        System.out.println(clonedQue);
    }
}
