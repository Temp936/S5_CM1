package com.company;


class Map{
    private int size;
    private List keys;
    private List words;

    Map(){
        this.size = 1;
        keys.add(1);
        words.add(1);
    }
    public void put(Object key, Object value){
        boolean t = true;
        for(int i = 0; i < this.size; i++){
            if (this.keys.get(i) == key) {
                this.words.set(value, i);
                t = false;
                break;
            }
        }
        if(t) {
            this.size+=1;
            this.keys.add(key);
            this.words.add(value);
        }
    }
    public Object get(Object key){
        for(int i = 0; i < this.size; i++){
            if (this.keys.get(i) == key) {
                return this.words.get(i);
            }
        }
        return null;
    }
    public Object get(Object key, Object bydefault){
        for(int i = 0; i < this.size; i++){
            if (this.keys.get(i) == key) {
                return this.words.get(i);
            }
        }
        put(key,bydefault);
        return bydefault;
    }
    public Object remove(Object key){
        Object temp1 = this.get(key);
        for(int i = 0; i < this.size; i++){
            if (this.keys.get(i) == key) {
                this.size--;
                this.keys.remove(i);
                Object temp = this.words.get(i);
                this.words.remove(i);
                return temp;
            }
        }
        return temp1;

    }
    public boolean keyContains(Object key){
        for(int i = 0; i < this.size; i++){
            if (this.keys.get(i) == key) {
                return true;
            }
        }
        return false;
    }
    public List getKeys(){
        List temp = new List();
        for (int i = 0; i < this.size; i++){
            temp.add(this.keys.get(i));
        }
        temp.remove(0);
        return temp;
    }
    public List getValues(){
        List temp = new List();
        for (int i = 0; i < this.size; i++){
            temp.add(this.words.get(i));
        }
        temp.remove(0);
        return temp;
    }
    public List getEntries(){
        List temp = new List();
        for (int i = 0; i < this.size; i++){
            Object[] temp1 = new Object[]{this.keys.get(i), this.words.get(i)};
            temp.add(temp1);
        }
        temp.remove(0);
        return temp;
    }
    public int size(){

        return this.size;
    }
    public boolean isEmpty(){
        if (this.size==0) return true;
        else return false;
    }
}


public class Main {

    public static void main(String[] args) {
        //////
    }
}
