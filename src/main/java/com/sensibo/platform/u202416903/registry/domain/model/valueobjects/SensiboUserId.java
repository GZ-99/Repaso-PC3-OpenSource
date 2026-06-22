package com.sensibo.platform.u202416903.registry.domain.model.valueobjects;

import java.util.Objects;

public record SensiboUserId(Long userId) {

    public SensiboUserId {
        if (Objects.isNull(userId)) {
            throw new IllegalArgumentException("[SensiboUserId] value cannot be null");
        }
        if (userId <= 0) {
            throw new IllegalArgumentException("[SensiboUserId] value must be greater than zero");
        }
    }

    // JPA default constructor
    public SensiboUserId() { this(null); }
}
