package model;

import java.util.ArrayList;


public class Teacher {
    public String name;
    public ArrayList<String> stuList;

    public Teacher() {
    }

    public void addStudent(String newStu) {
        this.stuList.add(newStu);
    }

    public void check(ArrayList<String> stuList) {
        int size = stuList.size();
        String[] array = new String[size];

        int i;
        for (i = 0; i < size; ++i) {
            array[i] = (String) stuList.get(i);
        }

        for (i = 0; i < size; ++i) {
            System.out.println(array[i]);
        }

    }
}
