package com.example.andrewsamtoy.olympicmedalhomework;

/**
 * Created by andrewsamtoy on 9/17/17.
 */

public class EventAsArray {
    String[] competitors = {"USA", "UK", "China", "Canada", "Zimbabwe", "Singapore", "Australia", "Cambodia", "Japan"};


    public int size() {
        int numberOfCompetitors = competitors.length;
        return numberOfCompetitors;
    }
//    public int size() {
//        int numberOfCompetitors = 0;
//        for(int i=0; i < competitors.length; i++){
//            if(competitors[i] != "candle") {
//                numberOfCompetitors++;
//            }
//        }
//        return numberOfCompetitors;
//    }
}
