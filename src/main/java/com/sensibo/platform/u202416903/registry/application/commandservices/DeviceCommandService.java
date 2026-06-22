package com.sensibo.platform.u202416903.registry.application.commandservices;

import com.sensibo.platform.u202416903.registry.domain.model.commands.CreateDeviceCommand;
import com.sensibo.platform.u202416903.shared.application.result.ApplicationError;
import com.sensibo.platform.u202416903.shared.application.result.Result;

public interface DeviceCommandService {

    Result<Long, ApplicationError> handle(CreateDeviceCommand command);

}
