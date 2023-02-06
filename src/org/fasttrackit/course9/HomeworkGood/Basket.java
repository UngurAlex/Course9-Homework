package org.fasttrackit.course9.HomeworkGood;

import java.util.*;

public class Basket {
    private List<String> list = new ArrayList<>();


    public void add(String fruit) {
        list.add(fruit);
    }

    public List<String> getList() {
        return list;
    }

    public boolean find(String receivedFruit) {
        return list.contains(receivedFruit);
    }

    public void addAnotherFruit(String anotherFruit) {
        list.add(anotherFruit);
    }

    public boolean remove(String removedFruit) {
        return list.remove(removedFruit);
    }

    public int count() {
        return list.size();
    }

    public int position(String whatFruit) {
        if (list.contains(whatFruit)) {

        }
        return list.indexOf(whatFruit);
    }

    public int customCount() {
        int i = 0;
        for (String elem : list) {
            i++;
        }
        return i;
    }

    public ArrayList<String> distinct(){
        return new ArrayList(new HashSet(list));
    }





}





