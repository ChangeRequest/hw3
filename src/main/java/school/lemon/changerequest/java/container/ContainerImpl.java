package school.lemon.changerequest.java.container;

public class ContainerImpl implements Container {

    private Integer[] container = new Integer[INITIAL_ARRAY_SIZE];
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
        if (index < 0 || index >= containerSize)
            return null;
        else
            return container[index];
    }

    @Override
    public void add(int element) {
        if (containerSize == container.length) {
            Integer[] tmp = new Integer[containerSize * 2];

            //for(int i = 0;i<containerSize;i++)
            //   tmp[i] = container[i];
            System.arraycopy(container, 0, tmp, 0, containerSize);
            container = tmp;
        }
        container[containerSize] = element;
        containerSize++;
    }

    @Override
    public boolean add(int element, int index) {
        if (index < 0 || index > containerSize)
            return false;
        if (containerSize == container.length) {
            Integer[] tmp = new Integer[containerSize * 2];
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
        if (index < 0 || index >= containerSize)
            return false;
        System.arraycopy(container, index + 1, container, index, containerSize - index - 1);
        containerSize--;
        return true;
    }
}
