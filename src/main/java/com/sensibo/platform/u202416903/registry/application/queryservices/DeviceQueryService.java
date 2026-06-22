package com.sensibo.platform.u202416903.registry.application.queryservices;

import com.sensibo.platform.u202416903.registry.domain.model.aggregates.Device;
import com.sensibo.platform.u202416903.registry.domain.model.queries.GetDeviceById;

import java.util.Optional;

public interface DeviceQueryService {

    Optional<Device> handle(GetDeviceById query);

}
