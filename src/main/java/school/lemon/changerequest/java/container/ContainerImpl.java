package school.lemon.changerequest.java.container;

import java.util.Arrays;

public class ContainerImpl implements Container {
    /**
     * The maximum size of array to allocate.
     * Some VMs reserve some header words in an array.
     * Attempts to allocate larger arrays may result in
     * OutOfMemoryError: Requested array size exceeds VM limit
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private int size;
    private int[] elementData;

    public ContainerImpl() {
        this.elementData = new int[INITIAL_ARRAY_SIZE];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            elementData[i] = 0;

        size = 0;
    }

    @Override
    public Integer get(int index) {
        if (index >= size) {
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
        if (index < size && index >= 0) {
            int numMoved = size - index - 1;
            if (numMoved > 0)
                System.arraycopy(elementData, index + 1, elementData, index,
                        numMoved);
            elementData[--size] = 0;
            return true;
        }
        return false;
    }

    private void ensureCapacityInternal(int minCapacity) {
        if (minCapacity >= INITIAL_ARRAY_SIZE) {
            if (minCapacity - MAX_ARRAY_SIZE > 0) {
                minCapacity = hugeCapacity(minCapacity);
            }
            elementData = Arrays.copyOf(elementData, minCapacity);
        }
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0)
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }
}
