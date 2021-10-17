package com.company;

public class List { ///Arraylist
    private int size;
    private Object[] arr;

    List() {
        this.arr = new Object[1];
        arr[0] = null;
        this.size = 1;
    }

    List(int size, Object[] arr) {
        this.arr = arr;
        this.size = arr.length + 1;
    }


    void add(Object ob) {
        Object[] temp = new Object[this.size + 1];
        for (int i = 0; i < this.size; i++) temp[i] = this.arr[i];
        temp[this.size] = ob;

        this.size += 1;
        this.arr = temp;
    }

    void add(Object ob, int index) {
        if (index < 0) index = 0;
        if (index > this.size - 1) index = this.size - 1;

        Object[] temp = new Object[this.size + 1];
        for (int i = 0; i < index; i++) temp[i] = this.arr[i];
        temp[index] = ob;
        for (int i = index; i < this.size; i++) temp[i + 1] = this.arr[i];

        this.size += 1;
        this.arr = temp;
    }

    Object get(int index) {
        if (index < 0) index = 0;
        if (index > this.size - 1) index = this.size - 1;

        return this.arr[index];
    }

    Object set(Object ob, int index) {
        if (index < 0) index = 0;
        if (index > this.size - 1) index = this.size - 1;

        Object temp = this.arr[index];
        this.arr[index] = ob;
        return temp;
    }

    boolean contains(Object ob) {
        boolean t = false;
        for (int i = 0; i < this.size; i++)
            if (this.arr[i] == ob) {
                t = true;
                break;
            }
        return t;
    }

    int index_of(Object ob) {
        boolean t = false;
        int index = -1;
        for (int i = 0; i < this.size; i++)
            if (this.arr[i] == ob) {
                t = true;
                index = i;
                break;
            }

        return index;
    }

    int size() {
        return this.size;
    }

    boolean is_empty() {
        if (this.size == 0) return true;
        else return false;
    }

    void remove(int index) {
        if (index < 0) index = 0;
        if (index > this.size - 1) index = this.size - 1;
        if (this.size > 0) {
            Object[] temp = new Object[this.size - 1];
            for (int i = 0; i < index; i++) temp[i] = this.arr[i];
            for (int i = index; i < this.size - 1; i++) temp[i] = this.arr[i + 1];

            this.size -= 1;
            this.arr = temp;
        }
    }

}
