package _1_learn._1_7_data_structures_and_algorithms._1_7_3_dynamic_array;

public class DynamicArray<Type> {
    private static int capacity = 0;
    private Type[] array = (Type[]) new Object[getCapacity()],
            newArray;

    public void add(Type data) {
        ++capacity;
        newArray = (Type[]) new Object[getCapacity()];
        System.arraycopy(array, 0, newArray, 0, getCapacity() - 1);
        newArray[getCapacity() - 1] = data;
        array = newArray;
    }

    public void insert(int atIndex, Type data) {
        ++capacity;
        newArray = (Type[]) new Object[getCapacity()];
        for (int index = 0, index2 = 0; index < getCapacity(); index++) {
            if (index != atIndex) {
                newArray[index] = array[index2];
                index2++;
            } else newArray[index] = data;
        }
        array = newArray;
    }

    public void remove() {
        --capacity;
        newArray = (Type[]) new Object[getCapacity()];
        System.arraycopy(array, 0, newArray, 0, getCapacity());
        array = newArray;
    }

    public Type search(Type data) {
        for (Type element : array)
            if (element == data) return element;
        return null;
    }

    public void showAll() {
        System.out.print("[");
        for (int index = 0; index < getCapacity(); index++) {
            System.out.print(array[index]);
            if (index != getCapacity() - 1) System.out.print(", ");
        }
        System.out.print("]");
    }

    public boolean isEmpty() {
        return array[0] == null;
    }

    public int getSize() {
        int sum = 0;
        for (Type element : array)
            if (element != null) sum++;
            else break;
        return sum;
    }

    public void setCapacity(int capacity) {
        DynamicArray.capacity = capacity;
        newArray = (Type[]) new Object[getCapacity()];
        System.arraycopy(array, 0, newArray, 0, Math.min(array.length, newArray.length));
        array = newArray;
    }

    public int getCapacity() {
        return capacity;
    }

    public void shrink() {
        int size = getSize();
        DynamicArray.capacity = size;
        newArray = (Type[]) new Object[getCapacity()];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}