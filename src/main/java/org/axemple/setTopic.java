package org.axemple;

import java.util.HashSet;

public class setTopic {

    public static void main(String[] args){

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(24);
        hs.add(13);
        hs.add(11);

        for (int sanele: hs){
            System.out.println(sanele);
        }

        System.out.println("======================");



    }
}
