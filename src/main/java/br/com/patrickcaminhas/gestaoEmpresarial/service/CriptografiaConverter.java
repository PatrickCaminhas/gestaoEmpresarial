package br.com.patrickcaminhas.gestaoEmpresarial.service;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class CriptografiaConverter implements AttributeConverter<String, String> {
    
    @Override
    public String convertToDatabaseColumn(String attribute){
        if(attribute == null) return null;
        return CriptografiaService.encriptar(attribute);
    }

    @Override
    public String convertToEntityAttribute(String dbData){
        if(dbData == null) return null;
        return CriptografiaService.desencriptar(dbData);
    }
}
