/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author admin
 */
class MyArrayGeneric<T> {

    private final T[] array; // khởi tạo mảng

    public MyArrayGeneric(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T getFirstElement() {
        if (this.array.length == 0) {
            return null;
        }
        return this.array[0];
    }

    public T getLastElement() {
        if (this.array.length == 0) {
            return null;
        }
        return this.array[this.array.length - 1];
    }
}

public class Demo {
    public static void main(String[] args) {
        String[] names = new String[] { "Dat", "Khoa", "Tin" };

        // truyền array names vào trong MyArrayGeneric để gắn mảng vào trong nó
        MyArrayGeneric<String> myArrayGeneric = new MyArrayGeneric<String>(names);
        // ta có thể dổi thành các kiểu khác như Double, Integer, ...

        System.out.println("First name: " + myArrayGeneric.getFirstElement());
        System.out.println("Last name: " + myArrayGeneric.getLastElement());
    }
}
