package homework16;

import java.util.Arrays;

public class ArrayList <T> {

    private static final int DEFAULT_SIZE = 10;
    private int size;
    private T[] elements;

    public ArrayList() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public void add(T value) {
        if (isFullArray())
            resize();

        this.elements[size] = value;
        size++;
    }

    private void resize() {
        T[] oldElemets = elements;
        this.elements = (T[]) new Object[(oldElemets.length + oldElemets.length / 2) + 1];
        System.arraycopy(oldElemets, 0, this.elements, 0, size);
    }

    public T get(int index) {

        if (isCorrectIndex(index)) {
            return elements[index];
        } else throw new ArrayIndexOutOfBoundsException("Элемент с индексом '" + index + "' отсутсвует в листе ");
    }

    private boolean isFullArray() {
        return size == elements.length;
    }

    private boolean isCorrectIndex(int index) {
        return 0 <= index && index < size;
    }

    public void clear() {
        this.size = 0;
    }

    public void removeAt(int index) {

        if (!isCorrectIndex(index))
            throw new ArrayIndexOutOfBoundsException("Элемент с индексом '" + index + "' отсутсвует в списке ");

        if (isCorrectIndex(index)) {
            deleteElement(index);
        }
    }

    private void deleteElement(int index) {

        if (index == 0) {
            System.arraycopy(elements, 1, elements, 0, elements.length - 1);
        } else {
            System.arraycopy(elements, 0, elements, 0, index - 1);
            System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
        }
        size--;
    }

    @Override
    public String toString() {

        int count = 0;
        for (Object obj : elements) {
            if (obj != null) count++;
        }

        T[] printElements = (T[]) new Object[count];
        System.arraycopy(elements, 0, printElements, 0, printElements.length);
        return Arrays.toString(printElements);
    }
}
