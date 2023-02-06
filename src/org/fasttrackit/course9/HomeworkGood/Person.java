package org.fasttrackit.course9.HomeworkGood;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Object> listOfPerson = new ArrayList<>();



    public List<Object> getList() {
        return listOfPerson;
    }

    public void add3(String name,int age,String position){
        listOfPerson.add(name);
        listOfPerson.add(age);
        listOfPerson.add(position);

    }

    public Object getManager(){
        int i=0;
        for(Object list10:listOfPerson){
            i++;
            if(listOfPerson.contains("manager")){
                return getManager();
            }
        } return i;
    }



}
