package com.sensibo.platform.u202416903.registry.domain.model.aggregates;

import com.sensibo.platform.u202416903.registry.domain.model.valueobjects.*;
import com.sensibo.platform.u202416903.shared.domain.model.aggregates.AbstractDomainAggregateRoot;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Device extends AbstractDomainAggregateRoot {
    private Long id;

    private SensiboUserId userId;

    private DeviceTypes deviceType;

    private String modelName;

    private SerialNumber serialNumber;

    private MacAddress macAddress;

    private Version firmwareVersion;

    private LocalDate installationDate;

    private String roomLocation;
}
