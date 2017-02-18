package algorytmy.structures.queque;

/**
 * Created by RENT on 2017-02-18.
 */
public class FIFOQueque implements Queque {
    private int value;
    private FIFOQueque next;

    public FIFOQueque() {
    }

    private FIFOQueque(int value) {
        this.value = value;
    }


    @Override
    public void push(int value) {
        FIFOQueque last = getLast();
        last.next = new FIFOQueque(value);
    }

    private FIFOQueque getLast() {
        //kod do getLast
        FIFOQueque fifoQueque = this;
        while (fifoQueque.next != null) {
            fifoQueque = fifoQueque.next;
        }
        return fifoQueque;
    }

    @Override
    public int pop() {
        if (this.next == null) {
            System.out.println("Queque is empty");
            return 0;
        }
        FIFOQueque first = this.next;
        this.next = first.next;
        first.next = null;
        return first.value;
    }

    private int getSize() {
        int counter = 0;
        FIFOQueque fifoQueque = this;
        while (fifoQueque.next != null) {
            counter++;
            fifoQueque = fifoQueque.next;
        }
        return counter;
    }

    @Override
    public Queque clone() {
        FIFOQueque clonedQueque = new FIFOQueque();
        FIFOQueque returnQueque = clonedQueque;
        FIFOQueque tmpQueque = this.next;
        while (tmpQueque != null) {
            clonedQueque.next = new FIFOQueque(tmpQueque.value);
            tmpQueque = tmpQueque.next;
            clonedQueque = clonedQueque.next;
        }
        return returnQueque;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        FIFOQueque fifoQueque = this.next;
        stringBuilder.append("[");
        while (fifoQueque != null) {
            stringBuilder.append(fifoQueque.value);
            if (fifoQueque.next != null) {
                stringBuilder.append(", ");
            }
            fifoQueque = fifoQueque.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
