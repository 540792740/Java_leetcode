package Summit_train.Hotel_project;

public class HotelTester {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.addRoom(0, "King", 'n', 80);
        hotel.addRoom(1, "King", 'y', 100);
        hotel.addRoom(2, "Queen", 'y', 60);
        hotel.addRoom(3, "King", 'n', 75);
        hotel.addRoom(4, "twins", 'n', 80);
        if(hotel.isEmpty()) {
            System.out.println("All room is available");
        }
        hotel.addReservation("Shiyao", 'y', "King");
        hotel.addReservation("Liao", 'n', "Queen");
        hotel.addReservation("LSY", 'n', "twins");
        System.out.println(hotel.toString());
        hotel.cancelReservation("LSY");
        System.out.println(hotel.toString());
        System.out.println(hotel.getDailySales());
    }
}
