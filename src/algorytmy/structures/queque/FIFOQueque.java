package algorytmy.structures.queque;

/**
 * Created by RENT on 2017-02-18.
 */
public class FIFOQueque extends AbstarctQueque {
    public FIFOQueque() {
    }

    private FIFOQueque(int value) {
        super.value = value;
    }

    @Override
    protected AbstarctQueque getInstance() {
        return new FIFOQueque();
    }

    @Override
    protected AbstarctQueque getInstance(int value) {
        return new FIFOQueque();
    }


    @Override
    public void push(int value) {
        AbstarctQueque last = getLast();
        last.next = new FIFOQueque(value);
    }

    private int getSize() {
        int counter = 0;
        AbstarctQueque fifoQueque = this;
        while (fifoQueque.next != null) {
            counter++;
            fifoQueque = fifoQueque.next;
        }
        return counter;
    }
}
