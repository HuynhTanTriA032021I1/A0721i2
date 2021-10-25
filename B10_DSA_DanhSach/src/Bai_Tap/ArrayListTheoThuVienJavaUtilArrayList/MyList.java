package Bai_Tap.ArrayListTheoThuVienJavaUtilArrayList;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

     // Phương thức add 1 phần tử tại 1 vị trí chỉ định
    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(10);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    //  Phương thức xóa 1 index khỏi MyList
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

     // phương thức trả về số lượng phần tử
    public int size() {
        return this.size;
    }

     // Phương thức tạo ra 1 bản sao của ArrayList hiện tại
    public MyList<E> clone() {
        MyList<E> myList = new MyList<>();
        myList.elements = Arrays.copyOf(this.elements, this.size);
        myList.size = this.size;
        return myList;
    }

     // phương thức kiểm tra index có tồn tại trong mảng không
    public boolean contains(E o) {
        return this.indexOf(o) >= 0;
    }

     // phương thức lấy index của 1 phần tử
    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(o)) {
                return i;
            }
        }
        return index;
    }

     // phương thức add 1 phần tử vào MyList
    public boolean add(E e) {
        if (elements.length == size) {
            this.ensureCapacity(10);
        }
        elements[size] = e;
        size++;
        return true;
    }

     // phương thức tăng kích thước của MyList

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

     // Phương thức lấy 1 element tại vị trí i
    public E get(int i) {
        return (E) elements[i];
    }

     // phương thức clear ArrayList
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
