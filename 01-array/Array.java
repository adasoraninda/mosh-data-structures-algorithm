public class Array<E> {
    private E[] items;
    private int count;

    @SuppressWarnings("unchecked")
    public Array(int length) {
        items = (E[]) new Object[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    @SuppressWarnings("unchecked")
    public void insert(E item) {
        // If the array is full, resize it
        if (items.length == count) {
            // Create a new array (twice the size)
            E[] newItems = (E[]) new Object[count * 2];
            // Copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // Set "items" to this new array
            items = newItems;
        }

        // Add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate the index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        // Shift the items to the lfet to fill the hole
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        // Decrement count, 
        // because print function iterate trough count not array length
        count--;
    }

    public int indexOf(E item) {
        for (int i = 0; i < count; i++) {
            if (item.equals(items[i])) {
                return i;
            }
        }
        return -1;
    }

}
