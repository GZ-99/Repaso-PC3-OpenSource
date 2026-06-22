package com.sensibo.platform.u202416903.registry.domain.repositories;

import com.sensibo.platform.u202416903.registry.domain.model.aggregates.Device;
import com.sensibo.platform.u202416903.registry.domain.model.valueobjects.MacAddress;
import com.sensibo.platform.u202416903.registry.domain.model.valueobjects.SerialNumber;

import java.util.Optional;

public interface DeviceRepository {
    Device save(Device device);

    Optional<Device> findById(Long deviceId);

    boolean existsBySerialNumberAndMacAddress(SerialNumber serialNumber, MacAddress macAddress);
}
