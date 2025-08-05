package com.Callofcoders.EmployeeManage.Employee.management.config;

import com.Callofcoders.EmployeeManage.Employee.management.dtos.EmployeeDto;
import com.Callofcoders.EmployeeManage.Employee.management.entities.EmployeeEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper(){
        ModelMapper mapper = new ModelMapper();
        // ✅ Set strict matching strategy
        mapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STRICT);

        // ✅ Skip the "id" field
        mapper.typeMap(EmployeeDto.class, EmployeeEntity.class)
                .addMappings(m -> m.skip(EmployeeEntity::setId));

        return mapper;
    }


}
