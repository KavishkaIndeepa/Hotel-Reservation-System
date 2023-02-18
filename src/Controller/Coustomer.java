package Controller;

public class Coustomer {
    private String name;
    private String ID;
    private String telNo;
    private String address;
    private String eMail;
    private String meals;
    private String room;

    public Coustomer() {

    }

    public Coustomer(String name, String ID, String telNo, String address, String eMail, String meals, String room) {
        this.name = name;
        this.ID = ID;
        this.telNo = telNo;
        this.address = address;
        this.eMail = eMail;
        this.meals = meals;
        this.room = room;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

}
