package Exercise1.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by computer on 22/03/17.
 */
public class User {
    private int id;
    private String name;
    private String password;
    private List<Device> listDevices;

    public User(){

    }

    public User (int id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
        this.listDevices = new ArrayList<>();
    }

    public void setListDevices(Device dev){
        listDevices.add(dev);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public List<Device> getListDevices() {
        return listDevices;
    }

    public String toString(){
        return new StringBuilder().append(" USER -->>")
                .append(" ID: ").append(id)
                .append(" Name: ").append(name)
                .append(" Password: ").append(password).toString();
    }
}
