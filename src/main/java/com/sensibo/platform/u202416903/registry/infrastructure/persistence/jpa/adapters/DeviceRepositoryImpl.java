package com.sensibo.platform.u202416903.registry.infrastructure.persistence.jpa.adapters;

import com.sensibo.platform.u202416903.registry.domain.model.aggregates.Device;
import com.sensibo.platform.u202416903.registry.domain.model.valueobjects.MacAddress;
import com.sensibo.platform.u202416903.registry.domain.model.valueobjects.SerialNumber;
import com.sensibo.platform.u202416903.registry.domain.repositories.DeviceRepository;
import com.sensibo.platform.u202416903.registry.infrastructure.persistence.jpa.assemblers.DevicePersistenceAssembler;
import com.sensibo.platform.u202416903.registry.infrastructure.persistence.jpa.repositories.DevicePersistenceRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DeviceRepositoryImpl implements DeviceRepository {

    private final DevicePersistenceRepository devicePersistenceRepository;
    public DeviceRepositoryImpl(DevicePersistenceRepository devicePersistenceRepository) {
        this.devicePersistenceRepository = devicePersistenceRepository;
    }

    @Override
    public Device save(Device device) {
        var persistenceSaved = this.devicePersistenceRepository
                .save(DevicePersistenceAssembler.toPersistenceFromDomain(device));
        return DevicePersistenceAssembler.toDomainFromPersistence(persistenceSaved);
    }

    @Override
    public Optional<Device> findById(Long deviceId) {
        //var persistence = this.devicePersistenceRepository.findById(deviceId);
        //return Optional.of(DevicePersistenceAssembler.toDomainFromPersistence(persistence.get()));
        return this.devicePersistenceRepository.findById(deviceId)
                .map(DevicePersistenceAssembler::toDomainFromPersistence);
    }

    @Override
    public boolean existsBySerialNumberAndMacAddress(SerialNumber serialNumber, MacAddress macAddress) {
        return this.devicePersistenceRepository.existsBySerialNumberAndMacAddress(serialNumber, macAddress);
    }
}
