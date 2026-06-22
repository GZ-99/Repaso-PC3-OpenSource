package com.sensibo.platform.u202416903.registry.domain.model.commands;

import java.time.LocalDate;

public record CreateDeviceCommand(Long userId, String deviceType, String modelName, String serialNumber,
                                  String macAddress, String firmwareVersion, LocalDate installationDate,
                                  String roomLocation) {
    public CreateDeviceCommand {
        if (userId == null) {
            throw new IllegalArgumentException("userId cannot be null");
        }
        if (deviceType == null) {
            throw new IllegalArgumentException("deviceType cannot be null");
        }
        if (modelName == null) {
            throw new IllegalArgumentException("modelName cannot be null");
        }
        if (serialNumber == null) {
            throw new IllegalArgumentException("serialNumber cannot be null");
        }
        if (firmwareVersion == null) {
            throw new IllegalArgumentException("firmwareVersion cannot be null");
        }
        if (installationDate == null) {
            throw new IllegalArgumentException("installationDate cannot be null");
        }
        if (roomLocation == null) {
            throw new IllegalArgumentException("roomLocation cannot be null");
        }

    }
}
