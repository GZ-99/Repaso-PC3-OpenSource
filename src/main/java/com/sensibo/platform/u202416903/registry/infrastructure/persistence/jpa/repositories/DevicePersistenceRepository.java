package com.sensibo.platform.u202416903.registry.infrastructure.persistence.jpa.repositories;

import com.sensibo.platform.u202416903.registry.domain.model.valueobjects.MacAddress;
import com.sensibo.platform.u202416903.registry.domain.model.valueobjects.SerialNumber;
import com.sensibo.platform.u202416903.registry.infrastructure.persistence.jpa.entities.DevicePersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicePersistenceRepository extends JpaRepository<DevicePersistenceEntity, Long> {

    boolean existsBySerialNumberAndMacAddress(SerialNumber serialNumber, MacAddress macAddress);
}
