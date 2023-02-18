package Controller;

public class Room {
    private String room;

    public Room() {
    }

    public Room(String room, String price) {
        this.room = room;
        this.price = price;
    }

    private String price;

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
