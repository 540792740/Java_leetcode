package Summit_train.Hotel_project;
/*
* Author: Jiawei Wang
* Date: Feb 6 2020
* Project name: Hotel
*
* */
public class Room {
    private int roomNum;
    private String bedType;
    private double rate;
    private String occupantName;
    private char smoking;
    private boolean occupied;

//    Constructor of Room;
    public Room(int a, String b, char c, double d){
        this.roomNum = a;
        this.bedType = b;
        this.smoking = c;
        this.rate = d;
    }

    public String getBedType(){return this.bedType;}
    public char getSmoking(){return this.smoking;}
    public int getRoomNum(){return this.roomNum;}
    public double getRoomRate(){return this.rate;}
    public String getOccupant(){return this.occupantName;}
    public void setOccupied(boolean b){this.occupied = b;}
    public void setOccupant(String s){this.occupantName = s;}
    public void setRoomNum(int a){this.roomNum = a;}
    public void setBedType(String s){this.bedType = s;}
    public void setRate(double d){this.rate = d;}
    public void setSmoking(char c){this.smoking = c;}
    public boolean isOccupied(){return this.occupied;}
    public String toString(){
        StringBuffer sb = new StringBuffer();
        if (!this.occupied){
            sb.append("\nThe room number is " + this.roomNum +
                      "\nThe bed type is " + this.bedType +
                      "\nThe rate is " + this.rate +
                      "\nSmoking(" + this.smoking + ")");
        }
        else {

            sb.append("The room is booked, the occupant name is " + this.occupantName);
        }
        return sb.toString();};

}

