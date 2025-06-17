package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size() {
        return arr.length;
    }

    public void add(String s) {
        String[] temp = new String[size()+1];
        //temp[temp.length-1] = s;
        temp[size()] = s;

        for(int i = 0; i < size(); i++){
            temp[i] = arr[i];
        }
    arr = temp;
    }

    public String get(int idx) {
        return this.arr[idx];
    }

    public void checkValues() {
        System.out.println(Arrays.toString(this.arr));
    }
}

