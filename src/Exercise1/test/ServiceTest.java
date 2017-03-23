package Exercise1.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import Exercise1.model.Device;
import Exercise1.model.Status;
import Exercise1.service.Service;


/**
 * Created by computer on 22/03/17.
 */
public class ServiceTest {

    private Service service;


    @Test
    public void testGetServicseByDefault() {

        service = new Service();
        List<Device> listServiceActual = service.getDeviceByStatus(Status.CONNECTED);

        for (Device dev : listServiceActual) {
            assertTrue(Status.CONNECTED == dev.getStatus());
        }

    }
}
