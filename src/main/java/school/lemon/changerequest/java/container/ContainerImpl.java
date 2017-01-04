package school.lemon.changerequest.java.container;

public class ContainerImpl implements Container {
    private int size;
    private int[] array;

    public ContainerImpl() {
        this.array = new int[Container.INITIAL_ARRAY_SIZE];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    @Override
    public void add(int element) {
        checkSize();
        array[size++] = element;
    }

    @Override
    public boolean add(int element, int index) {
        if (index < 0 || index > size) {
            return false;
        }
        checkSize();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        ++size;
        return true;
    }

    private void checkSize() {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        --size;
        return true;
    }
}
