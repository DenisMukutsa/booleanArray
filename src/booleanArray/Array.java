package booleanArray;

import java.util.Arrays;

public class Array implements BooleanLab {
    public boolean[] array;

    public Array() {
        array = new boolean[1024];
        for(int i = 0; i < 1024; i++) {
            array[i] = false;
        }
    }

    public boolean checkBoolean(int index) throws IndexOutOfBoundsException {
        if(index >= 0 && index < array.length) {
            return array[index];
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }
    }
    public void setBoolean(int index) throws IndexOutOfBoundsException {
        if(index >= 0 && index < array.length) {
            array[index] = true;
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }
    }
    public void setValue(int index, boolean value) throws IllegalArgumentException {
        if((index >= 0 && index < array.length) && (value == true || value == false)) {
            array[index] = value;
        }
        else {
            throw new IllegalArgumentException("Неверно указан индекс массива или тип значения, которое должно быть присвоено элементу массива");

        }
    }
    public void dropValue(int index) throws IndexOutOfBoundsException {
        if(index >= 0 && index < array.length) {
            if (array[index] == true) {
                array[index] = false;
            }
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }
    }
    public void invert(int index) throws IndexOutOfBoundsException {
        if(index >= 0 && index < array.length) {
            boolean temp = array[index];
            array[index] = !temp;
        }
        else {
            throw new IndexOutOfBoundsException("Неверно указан индекс массива");
        }
    }

    public int numberTrue() {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == true) {
                count++;
            }
        }
        return count;
    }
    public String toString() {
        int[] arrayInt = new int[1024];
        for(int i = 0; i < array.length; i++) {
            if(array[i] == true) {
                arrayInt[i] = 1;
            }
            else {
                arrayInt[i] = 0;
            }
        }
        return Arrays.toString(arrayInt);
    }


}
