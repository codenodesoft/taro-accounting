package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.ExperienceInformation;
import org.soptorshi.service.dto.ExperienceInformationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ExperienceInformationMapperImpl implements ExperienceInformationMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<ExperienceInformation> toEntity(List<ExperienceInformationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ExperienceInformation> list = new ArrayList<ExperienceInformation>( dtoList.size() );
        for ( ExperienceInformationDTO experienceInformationDTO : dtoList ) {
            list.add( toEntity( experienceInformationDTO ) );
        }

        return list;
    }

    @Override
    public List<ExperienceInformationDTO> toDto(List<ExperienceInformation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ExperienceInformationDTO> list = new ArrayList<ExperienceInformationDTO>( entityList.size() );
        for ( ExperienceInformation experienceInformation : entityList ) {
            list.add( toDto( experienceInformation ) );
        }

        return list;
    }

    @Override
    public ExperienceInformationDTO toDto(ExperienceInformation experienceInformation) {
        if ( experienceInformation == null ) {
            return null;
        }

        ExperienceInformationDTO experienceInformationDTO = new ExperienceInformationDTO();

        Long id = experienceInformationEmployeeId( experienceInformation );
        if ( id != null ) {
            experienceInformationDTO.setEmployeeId( id );
        }
        experienceInformationDTO.setId( experienceInformation.getId() );
        experienceInformationDTO.setOrganization( experienceInformation.getOrganization() );
        experienceInformationDTO.setDesignation( experienceInformation.getDesignation() );
        experienceInformationDTO.setStartDate( experienceInformation.getStartDate() );
        experienceInformationDTO.setEndDate( experienceInformation.getEndDate() );
        experienceInformationDTO.setEmploymentType( experienceInformation.getEmploymentType() );

        return experienceInformationDTO;
    }

    @Override
    public ExperienceInformation toEntity(ExperienceInformationDTO experienceInformationDTO) {
        if ( experienceInformationDTO == null ) {
            return null;
        }

        ExperienceInformation experienceInformation = new ExperienceInformation();

        experienceInformation.setEmployee( employeeMapper.fromId( experienceInformationDTO.getEmployeeId() ) );
        experienceInformation.setId( experienceInformationDTO.getId() );
        experienceInformation.setOrganization( experienceInformationDTO.getOrganization() );
        experienceInformation.setDesignation( experienceInformationDTO.getDesignation() );
        experienceInformation.setStartDate( experienceInformationDTO.getStartDate() );
        experienceInformation.setEndDate( experienceInformationDTO.getEndDate() );
        experienceInformation.setEmploymentType( experienceInformationDTO.getEmploymentType() );

        return experienceInformation;
    }

    private Long experienceInformationEmployeeId(ExperienceInformation experienceInformation) {
        if ( experienceInformation == null ) {
            return null;
        }
        Employee employee = experienceInformation.getEmployee();
        if ( employee == null ) {
            return null;
        }
        Long id = employee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
