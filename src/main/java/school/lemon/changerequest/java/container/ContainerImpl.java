package school.lemon.changerequest.java.container;

public class ContainerImpl implements Container {

    private int[] container = new int[INITIAL_ARRAY_SIZE];
    private int containerSize = 0;

    @Override
    public int size() {
        return containerSize;
    }

    @Override
    public void clear() {
        containerSize = 0;
    }

    @Override
    public Integer get(int index) {
        if (!isIndexCorrect(index))
            return null;
        else
            return container[index];
    }

    @Override
    public void add(int element) {
        add(element, containerSize);
    }

    @Override
    public boolean add(int element, int index) {
        if (index < 0 || index > containerSize)
            return false;
        if (containerSize == container.length) {
            int[] tmp = new int[containerSize * 2];
            System.arraycopy(container, 0, tmp, 0, index);
            tmp[index] = element;
            System.arraycopy(container, index, tmp, index + 1, containerSize - index);
            container = tmp;
        } else {
            for (int i = containerSize; i > index; i--)
                container[i] = container[i - 1];
            container[index] = element;
        }
        containerSize++;
        return true;

    }

    @Override
    public boolean remove(int index) {
        if (!isIndexCorrect(index))
            return false;
        System.arraycopy(container, index + 1, container, index, containerSize - index - 1);
        containerSize--;
        return true;
    }

    private boolean isIndexCorrect(int index) {
        if (index < 0 || index >= containerSize)
            return false;
        return true;
    }
}
