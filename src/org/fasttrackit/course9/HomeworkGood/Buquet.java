package org.fasttrackit.course9.HomeworkGood;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;


public class Buquet {
   private HashSet<String> flowers = new HashSet<>();


    public HashSet<String> getFlowers() {
        return flowers;
    }

    public void add(String flower){
        flowers.add(flower);
    }
    public HashSet<String> listFlowers(){
        return flowers;
    }

    public boolean remove(String removeFlowers){
        return flowers.remove(removeFlowers);
    }


}
