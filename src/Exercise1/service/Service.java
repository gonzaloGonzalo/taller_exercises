package Exercise1.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Exercise1.dao.DeviceUserDAO;
import Exercise1.dao.DeviceUserDAOimpl;
import Exercise1.model.Device;
import Exercise1.model.Status;

/**
 * Created by computer on 22/03/17.
 */
public class Service {

    List<Device> listDevicesByStatus;
    List<Device> listDevicesBelongUser;
    DeviceUserDAO deviceUserDAO;

    public Service() {
        deviceUserDAO = new DeviceUserDAOimpl();
    }

    public List<Device> getDeviceByStatus(Status status) {
        return deviceUserDAO.listAllDevices().stream().filter(s -> s.getStatus() == status)
                .collect(Collectors.toList());
    }

    public List<Device> getDevicesBelongUser(int userId) {
        listDevicesBelongUser = deviceUserDAO.readUser(userId).getListDevices();
        listDevicesBelongUser.sort(Comparator.comparing(Device::getStatus));
        return listDevicesBelongUser;
    }

    public Device getDeviceById(int idDevice){
        return deviceUserDAO.readDevice(idDevice);
    }
}
