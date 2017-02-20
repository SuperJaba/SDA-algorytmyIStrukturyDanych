package algorytmy.structures.queque;

/**
 * Created by Super JABA on 19.02.17.
 */
public class LIFOQueque extends AbstarctQueque {


    public LIFOQueque() {
    }

    public LIFOQueque(int value) {
        super(value);
    }

    @Override
    protected AbstarctQueque getInstance() {
        return new LIFOQueque();
    }

    @Override
    protected AbstarctQueque getInstance(int value) {
        return new LIFOQueque();
    }


    @Override
    public void push(int value) {
        AbstarctQueque nextValue = this.next;
        LIFOQueque newValue = new LIFOQueque(value);
        this.next = newValue;
        newValue.next = nextValue;
    }
}
