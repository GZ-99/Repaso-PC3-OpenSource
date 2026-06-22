package com.sensibo.platform.u202416903.registry.domain.model.queries;

public record GetDeviceById(Long deviceId) {
    public GetDeviceById {
        if (deviceId == null) {
            throw new IllegalArgumentException("deviceId cannot be null");
        }
        if (deviceId.intValue() < 0) {
            throw new IllegalArgumentException("deviceId cannot be negative");
        }
    }
}
