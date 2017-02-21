package algorytmy.structures.queque;

/**
 * Created by RENT on 2017-02-20.
 */
public abstract class AbstarctQueque implements Queque {

    protected int value;

    protected AbstarctQueque next;

    public AbstarctQueque() {
    }

    protected AbstarctQueque(int value) {
        this.value = value;
    }


    @Override
    public int pop() throws QueueException {
        AbstarctQueque nextValue = this.next;
        if (nextValue == null) {
            throw new QueueException("Kolejka jest pusta");
        }
        this.next = nextValue.next;
        nextValue.next = null;
        return nextValue.value;
    }

    @Override
    public Queque clone() {
        AbstarctQueque clonedQueue = getInstance();
        AbstarctQueque toReturn = clonedQueue;
        AbstarctQueque thisQueue = this.next;
        while (thisQueue != null) {
            clonedQueue.next = getInstance(thisQueue.value);
            clonedQueue = clonedQueue.next;
            thisQueue = thisQueue.next;
        }
        return toReturn;
    }

    protected AbstarctQueque getLast() {
        //kod do getLast
        AbstarctQueque fifoQueque = this;
        while (fifoQueque.next != null) {
            fifoQueque = fifoQueque.next;
        }
        return fifoQueque;
    }

    protected abstract AbstarctQueque getInstance();

    protected abstract AbstarctQueque getInstance(int value);

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        AbstarctQueque queque = this.next;
        stringBuilder.append("[");
        while (queque != null) {
            stringBuilder.append(queque.value);
            if (queque.next != null) {
                stringBuilder.append(", ");
            }
            queque = queque.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }


}
