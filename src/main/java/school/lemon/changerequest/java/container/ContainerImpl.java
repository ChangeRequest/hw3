package school.lemon.changerequest.java.container;

import java.util.Arrays;

public class ContainerImpl implements Container {
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private int size;
    transient int[] elementData;

    public ContainerImpl() {
        this.elementData = new int[INITIAL_ARRAY_SIZE];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        // clear to let GC do its work
        for (int i = 0; i < size; i++)
            elementData[i] = 0;

        size = 0;
    }

    @Override
    public Integer get(int index) {
        if (index >= size){
            return null;
        }
        return elementData[index];
    }

    @Override
    public void add(int element) {
        ensureCapacityInternal(size + 1);
        elementData[size++] = element;
    }

    @Override
    public boolean add(int element, int index) {
        if (index <= size && index >= 0) {
            ensureCapacityInternal(size + 1);
            System.arraycopy(elementData, index, elementData, index + 1,
                    size - index);
            elementData[index] = element;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int index) {
        for (int i = 0; i < size; i++)
            if (index == i) {
                fastRemove(i);
                return true;
            }
        return false;
    }

    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index + 1, elementData, index,
                    numMoved);
        elementData[--size] = 0;
    }

    private void ensureCapacityInternal(int minCapacity) {
        if (elementData.length == INITIAL_ARRAY_SIZE) {
            minCapacity = Math.max(INITIAL_ARRAY_SIZE, minCapacity);
        }

        ensureExplicitCapacity(minCapacity);
    }

    private void ensureExplicitCapacity(int minCapacity) {
        // overflow-conscious code
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }
}
