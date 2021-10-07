package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.FamilyInformation;
import org.soptorshi.service.dto.FamilyInformationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class FamilyInformationMapperImpl implements FamilyInformationMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<FamilyInformation> toEntity(List<FamilyInformationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<FamilyInformation> list = new ArrayList<FamilyInformation>( dtoList.size() );
        for ( FamilyInformationDTO familyInformationDTO : dtoList ) {
            list.add( toEntity( familyInformationDTO ) );
        }

        return list;
    }

    @Override
    public List<FamilyInformationDTO> toDto(List<FamilyInformation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<FamilyInformationDTO> list = new ArrayList<FamilyInformationDTO>( entityList.size() );
        for ( FamilyInformation familyInformation : entityList ) {
            list.add( toDto( familyInformation ) );
        }

        return list;
    }

    @Override
    public FamilyInformationDTO toDto(FamilyInformation familyInformation) {
        if ( familyInformation == null ) {
            return null;
        }

        FamilyInformationDTO familyInformationDTO = new FamilyInformationDTO();

        Long id = familyInformationEmployeeId( familyInformation );
        if ( id != null ) {
            familyInformationDTO.setEmployeeId( id );
        }
        familyInformationDTO.setId( familyInformation.getId() );
        familyInformationDTO.setName( familyInformation.getName() );
        familyInformationDTO.setRelation( familyInformation.getRelation() );
        familyInformationDTO.setContactNumber( familyInformation.getContactNumber() );

        return familyInformationDTO;
    }

    @Override
    public FamilyInformation toEntity(FamilyInformationDTO familyInformationDTO) {
        if ( familyInformationDTO == null ) {
            return null;
        }

        FamilyInformation familyInformation = new FamilyInformation();

        familyInformation.setEmployee( employeeMapper.fromId( familyInformationDTO.getEmployeeId() ) );
        familyInformation.setId( familyInformationDTO.getId() );
        familyInformation.setName( familyInformationDTO.getName() );
        familyInformation.setRelation( familyInformationDTO.getRelation() );
        familyInformation.setContactNumber( familyInformationDTO.getContactNumber() );

        return familyInformation;
    }

    private Long familyInformationEmployeeId(FamilyInformation familyInformation) {
        if ( familyInformation == null ) {
            return null;
        }
        Employee employee = familyInformation.getEmployee();
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
