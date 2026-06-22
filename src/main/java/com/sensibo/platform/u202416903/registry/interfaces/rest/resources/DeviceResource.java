package com.sensibo.platform.u202416903.registry.interfaces.rest.resources;

import java.time.LocalDate;

public record DeviceResource(Long id, String serialNumber, String deviceType, String modelName,
                             String macAddress, String firmwareVersion, LocalDate installationDate,
                             String roomLocation) {
}
