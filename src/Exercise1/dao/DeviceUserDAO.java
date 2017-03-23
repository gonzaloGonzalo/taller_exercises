package Exercise1.dao;

import java.util.List;

import Exercise1.model.Device;
import Exercise1.model.User;

/**
 * Created by computer on 22/03/17.
 */
public interface DeviceUserDAO {

    public void createDevice(Device device);

    public List<Device> listAllDevices();

    public Device readDevice(int deviceId);

    public void updateDevice(Device device);

    public void deleteDevice(int deviceId);

    public List<User> listAllUsers();

    public User readUser(int userId);
}
