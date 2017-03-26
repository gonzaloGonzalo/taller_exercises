package Exercise1.dao;

import java.util.ArrayList;
import java.util.List;

import Exercise1.model.Device;
import Exercise1.model.Status;
import Exercise1.model.User;

/**
 * Created by computer on 22/03/17.
 */
public class DeviceUserDAOimpl implements DeviceUserDAO {

    List<Device> listDevices;
    List<User> listUsers;

    public DeviceUserDAOimpl() {
        //Mocked data
        User userMaster = new User(1, "admin", "1234");
        User userInvited = new User(2, "invited", "1001");

        Device deviceAndroid1 = new Device(1, Status.CONNECTED, "myDeviceAndroid1", "C1-04-8B-5C-04-68");
        Device deviceAndroid2 = new Device(2, Status.DISABLED, "myDeviceAndroid2", "FD-8A-F1-89-9C-E2");
        Device deviceAndroid3 = new Device(3, Status.DISABLED, "myDeviceAndroid3", "74-8A-1D-54-A1-17");
        Device deviceAndroid4 = new Device(4, Status.DISCONNECTED, "myDeviceAndroid4", "F0-DB-FC-FA-0A-28");

        Device deviceWindows1 = new Device(5, Status.CONNECTED, "myDeviceWindows1", "C8-82-1F-FB-DD-F8");
        Device deviceWindows2 = new Device(6, Status.DISCONNECTED, "myDeviceWindows2", "BD-95-F4-05-40-A1");
        Device deviceWindows3 = new Device(7, Status.DISABLED, "myDeviceWindows3", "A7-4E-95-5F-8F-AF");
        Device deviceWindows4 = new Device(8, Status.CONNECTED, "myDeviceWindows4", "3A-4D-E5-66-9F-14");

        Device deviceMac1 = new Device(9, Status.DISCONNECTED, "myDeviceMac1", "0E-00-E3-DB-72-D0");
        Device deviceMac2 = new Device(10, Status.CONNECTED, "myDeviceMac2", "6F-F8-86-2A-AB-BE");
        Device deviceMac3 = new Device(11, Status.DISABLED, "myDeviceMac3", "FC-2E-30-DE-01-10");
        Device deviceMac4 = new Device(12, Status.CONNECTED, "myDeviceMac4", "D0-AB-9A-20-A7-01");

        userMaster.setListDevices(deviceAndroid1);
        deviceAndroid1.setUser(userMaster);
        userMaster.setListDevices(deviceAndroid2);
        deviceAndroid2.setUser(userMaster);

        userMaster.setListDevices(deviceWindows3);
        deviceWindows3.setUser(userMaster);
        userMaster.setListDevices(deviceWindows4);
        deviceWindows4.setUser(userMaster);

        userMaster.setListDevices(deviceMac1);
        deviceMac1.setUser(userMaster);
        userMaster.setListDevices(deviceMac4);
        deviceMac4.setUser(userMaster);

        userInvited.setListDevices(deviceAndroid3);
        deviceAndroid3.setUser(userInvited);
        userInvited.setListDevices(deviceAndroid4);
        deviceAndroid4.setUser(userInvited);

        userInvited.setListDevices(deviceWindows1);
        deviceWindows1.setUser(userInvited);
        userInvited.setListDevices(deviceWindows2);
        deviceWindows2.setUser(userInvited);

        userInvited.setListDevices(deviceMac2);
        deviceMac2.setUser(userInvited);
        userInvited.setListDevices(deviceMac3);
        deviceMac3.setUser(userInvited);

        listDevices = new ArrayList<>();
        listDevices.add(deviceAndroid1);
        listDevices.add(deviceAndroid2);
        listDevices.add(deviceAndroid3);
        listDevices.add(deviceAndroid4);

        listDevices.add(deviceWindows1);
        listDevices.add(deviceWindows2);
        listDevices.add(deviceWindows3);
        listDevices.add(deviceWindows4);

        listDevices.add(deviceMac1);
        listDevices.add(deviceMac2);
        listDevices.add(deviceMac3);
        listDevices.add(deviceMac4);

        listUsers = new ArrayList<>();
        listUsers.add(userMaster);
        listUsers.add(userInvited);
    }

    public void createDevice(Device device) {
        listDevices.add(device);
    }

    public List<Device> listAllDevices() {
        return listDevices;
    }

    public Device readDevice(int deviceId) {
        return listDevices.stream().filter(d -> d.getId() == deviceId).findFirst().get();
    }

    public void updateDevice(Device device) {
        for (int i = 0; i < listDevices.size(); i++) {
            if (listDevices.get(i).getId() == device.getId()) {
                listDevices.add(i, device);
                break;
            }
        }
    }

    public void deleteDevice(int deviceId) {
        for (int i = 0; i < listDevices.size(); i++) {
            if (listDevices.get(i).getId() == deviceId) {
                listDevices.remove(i);
                break;
            }
        }

        listDevices.stream().filter(d -> d.getId()==deviceId).
    }

    public List<User> listAllUsers() {
        return listUsers;
    }

    public User readUser(int userId) {
        return  listUsers.stream().filter(u -> u.getId()==userId).findFirst().get();
    }
}
