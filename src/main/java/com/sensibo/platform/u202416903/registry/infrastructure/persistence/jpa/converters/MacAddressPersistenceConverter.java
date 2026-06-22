package com.sensibo.platform.u202416903.registry.infrastructure.persistence.jpa.converters;

import com.sensibo.platform.u202416903.registry.domain.model.valueobjects.MacAddress;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;


@Converter(autoApply = true)
public class MacAddressPersistenceConverter implements AttributeConverter<MacAddress, String> {
    @Override
    public String convertToDatabaseColumn(MacAddress attribute) {
        return attribute == null ? null : attribute.value();
    }

    @Override
    public MacAddress convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new MacAddress(dbData);
    }
}
