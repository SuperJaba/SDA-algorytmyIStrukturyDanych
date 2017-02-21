package algorytmy.structures.queque;

public interface Queque {
    void push(int value);

    int pop() throws QueueException;

    Queque clone();
}
