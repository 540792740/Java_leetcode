package Summit_train.Hotel_project;
/*
 * Author: Jiawei Wang
 * Date: Feb 6 2020
 * Project name: Hotel
 * */

import java.util.*;


public class Hotel {

    // Initialize variable
    private static final int NOT_FOUND = -1;
    private int occupiedCnt;
    private int numOfRooms;
    private String name;
    private String location;
    private Room[] theRooms ;

    // Constructor
    Hotel(){
        numOfRooms = 0;
        occupiedCnt = 0;
        name = "";
        location = "";
        theRooms = new Room[10] ;

    }
    Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        numOfRooms = 0;
        occupiedCnt = 0;
        Room[] theRooms = new Room[10] ;

    }

    //Function isFull()
    private boolean isFull() {
        if (numOfRooms == occupiedCnt) {return true;}
        else{ return false;}
    }
    public boolean isEmpty(){
        if (occupiedCnt == 0) return true;
        else {return false;}
    }

    public void addRoom(int a, String b, char c, double d) {
        // Room id exist
        System.out.println(this.theRooms);
        if (this.theRooms[a] == null){
            Room new_room = new Room(a, b, c, d);
            this.theRooms[a] = new_room;
            this.numOfRooms++;
        }

        //Room id not exist
        else{System.out.println("The room is occupied");}

    }

//    private string getSmoking(){return this.}

    public void addReservation(String a, char b, String c) {
        if (numOfRooms - occupiedCnt > 0) {
            // No aim type of room
            for(Room room : this.theRooms) {
                if (room != null) {
                    if (room.getSmoking() == b && room.getBedType().equals(c)) {
                        room.setOccupied(true);
                        room.setOccupant(a);
                        System.out.println("You are registered");
                        this.occupiedCnt++;
                        return;
                    } else {
                        System.out.println("No Available Room");
                    }
                }
            }
        }
        else { System.out.println("No Available Room"); }
    }

    public void cancelReservation(String a){
        int id = findReservation(a);
        if (id == -1){System.out.println("Resavation not found");}
        else{
            this.theRooms[id].setOccupant(null);
            this.theRooms[id].setOccupied(false);
            this.occupiedCnt--;
        }

    }
//
    public int findReservation(String a) {
        for(Room room : this.theRooms){
            if (room.getOccupant() == a){
                return room.getRoomNum();
            }
        }
        return NOT_FOUND;
    }

    public void printReservationList() {
        for (Room room : this.theRooms) {
            if(room != null && room.isOccupied() == true){
                System.out.println(room.toString());
                System.out.println();
            }
        }
    }
//
    public double getDailySales() {
        double sum = 0;
        for (Room room : this.theRooms) {
            if (room != null) {
                sum += room.getRoomRate();
            }
        }
        return sum;
    }
//
    public double occupancyPercentage() {return (double)this.occupiedCnt / (double)this.numOfRooms;}
//
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("The Hotel name is " + this.name + "\nThe rooms number is " + this.numOfRooms + "\nThe available rooms number is " + this.occupiedCnt);
        printReservationList();
        return sb.toString();
    }
}
