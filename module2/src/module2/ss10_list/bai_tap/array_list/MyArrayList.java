package module2.ss10_list.bai_tap.array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    public E add;
    /**
     * số lượng phần tử có trong MyArrayList
     */
    public int size = 0;
    /**
     * sức chưa của MyArrayList
     */
    public static final int DEFAULT_CAPACITY = 10;
    /**
     * mảng chứa các phần tử
     */
    public Object elements[];

    /**
     * sức chứa mặc định khi khởi tạo bằng contructor không có tham số
     */
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * phương thức contructor với sức chứa được truyền vào
     * @param capacity
     */
    public MyArrayList(int capacity) throws IllegalAccessException {
        if (capacity >= 0){
            elements = new Object[capacity];
        }else {
            throw new IllegalAccessException("capacity: "+ capacity);
        }
    }

    /**
     * phương thức trả về số lượng phần tử
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * phương thức clear MyArrayList
     */
    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    /**
     * phương thức add 1 phần tử vào MyArrayList
     * @param element
     * @return
     */
    public boolean add(E element)  {
        if (elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    /**
     * phương thức add 1 phần tử element vào vị trí index
     * @param index
     * @param element
     */
    public void add(int index, E element) {
        if (index>elements.length){
            throw new IllegalArgumentException("index: "+ index);
        }else if (elements.length == size){
            this.ensureCapacity(5);
        }if (elements[index]==null){
            elements[index] =element;
            size++;
        }else {
            for (int i = size + 1; i >=index ; i--) {
                elements[i]=elements[i-1];
            }
            elements[index] = element;
            size++;
        }

    }

    /**
     * phương thức tăng kích thước của MyArrayList
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity)  {
        if (minCapacity >= 0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: "+minCapacity);
        }
    }

    /**
     * phương thức lấy 1 phần tử tại vị trí index
     * @param index
     */
    public E get(int index){
        return (E)elements[index];
    }

    /**
     * phương thức lấy index của 1 phần tử
     * @param element
     * @return
     */
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    /**
     * phương thức kiểm tra 1 phần tử có trong MyArrayList hay không
     * @param element
     * @return
     */
    public boolean contains (E element){
        return this.indexOf(element)>=0;
    }

    /**
     * phương thức tạo ra 1 bản sao của MyArrayList hiện tại
     * @return
     */
    public MyArrayList<E> clone(){
        MyArrayList<E> v=new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
    }

    /**
     *
     * @param index
     * @return
     */
    public E remove(int index){
        if (index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }
}
