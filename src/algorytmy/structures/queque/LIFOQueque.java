package algorytmy.structures.queque;

/**
 * Created by Super JABA on 19.02.17.
 */
public class LIFOQueque implements Queque {
    private int value;
    private LIFOQueque next;

    public LIFOQueque() {
    }

    private LIFOQueque(int value) {
        this.value = value;
    }



    @Override
    public void push(int value) {
        LIFOQueque last = getLast();
        last.next = new LIFOQueque(value);
    }

    private LIFOQueque getLast() {
        LIFOQueque lifoQueque = this;
        while (lifoQueque.next != null) {
            lifoQueque = lifoQueque.next;
        }
        return lifoQueque;
    }

    @Override
    public int pop() {
//        if (this.next == null) {
//            System.out.println("Kolejka jest pusta");
//            return 0;
//        }
//        while (this != null) {
//            LIFOQueque last = this.next;
//        }
        return 0;
    }

    @Override
    public Queque clone() {
        LIFOQueque clonedQueque = new LIFOQueque();
        LIFOQueque returnQueque = clonedQueque;
        LIFOQueque tmpQueque = this.next;
        while (tmpQueque != null) {
            clonedQueque.next = new LIFOQueque(tmpQueque.value);
            tmpQueque = tmpQueque.next;
            clonedQueque = clonedQueque.next;
        }
        return returnQueque;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        LIFOQueque lifoQueque = this.next;
        stringBuilder.append("[");
        while (lifoQueque != null) {
            stringBuilder.append(lifoQueque.value);
            if (lifoQueque.next != null) {
                stringBuilder.append(", ");
            }
            lifoQueque = lifoQueque.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
