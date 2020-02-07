package Summit_train.Hotel_project;
/*
 * Author: Jiawei Wang
 * Date: Feb 6 2020
 * Project name: Hotel
 * */

import java.util.*;


public class Hotel {

    int occupiedCnt;
    int numOfRooms;
    String name;
    String location;
    List theRooms = new ArrayList<>();
    Hotel(){}
    Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }
    private boolean isFull() {
        if (numOfRooms == occupiedCnt) {
            return true;
        }
        else{
            return false;
        }
    }
    private boolean isEmpty(){
        if (occupiedCnt == 0) return true;
        else return false;
    }

    private void addRoom(int a, String b, char c, double d)
    {
        numOfRooms++;
    }

    private void addReservation(String a, char b, String c) {
        if (numOfRooms - occupiedCnt > 0){
            occupiedCnt++;
            List temp = new ArrayList();
            temp.add(a);
            temp.add(b + "");
            temp.add(c);
            theRooms.add(temp);
        }
        else{
            System.out.println("No Available Room");
        }

//    private void cancelReservation(String a){}
//
//    private int findReservation(String a) {}
//
//    private void printReservationList() {}
//
//    private double getDailySales() {}
//
//    private double occupancyPercentage() {}
//
//    private String toString(){}




    }
}
