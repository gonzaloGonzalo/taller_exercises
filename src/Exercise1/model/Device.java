package Exercise1.model;

/**
 * Created by computer on 22/03/17.
 */
public class Device {
    private int id;
    private Status status;
    private String name;
    private String macAddress;
    private User user;

    public Device(){

    }

    public Device(int id, Status status, String name, String macAddress){
        this.id = id;
        this.status = status;
        this.name = name;
        this.macAddress = macAddress;
    }

    public void setUser(User user){
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public User getUser() {
        return user;
    }

    public String toString(){
        return new StringBuilder().append(" DEVICE -->>")
                .append(" ID: ").append(id)
                .append(" Status: ").append(status)
                .append(" Name: ").append(name)
                .append(" Mac Adress: ").append(macAddress)
                .append(" User: ").append(user).toString();
    }
}

