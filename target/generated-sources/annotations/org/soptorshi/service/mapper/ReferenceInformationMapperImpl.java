package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.ReferenceInformation;
import org.soptorshi.service.dto.ReferenceInformationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ReferenceInformationMapperImpl implements ReferenceInformationMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<ReferenceInformation> toEntity(List<ReferenceInformationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ReferenceInformation> list = new ArrayList<ReferenceInformation>( dtoList.size() );
        for ( ReferenceInformationDTO referenceInformationDTO : dtoList ) {
            list.add( toEntity( referenceInformationDTO ) );
        }

        return list;
    }

    @Override
    public List<ReferenceInformationDTO> toDto(List<ReferenceInformation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReferenceInformationDTO> list = new ArrayList<ReferenceInformationDTO>( entityList.size() );
        for ( ReferenceInformation referenceInformation : entityList ) {
            list.add( toDto( referenceInformation ) );
        }

        return list;
    }

    @Override
    public ReferenceInformationDTO toDto(ReferenceInformation referenceInformation) {
        if ( referenceInformation == null ) {
            return null;
        }

        ReferenceInformationDTO referenceInformationDTO = new ReferenceInformationDTO();

        Long id = referenceInformationEmployeeId( referenceInformation );
        if ( id != null ) {
            referenceInformationDTO.setEmployeeId( id );
        }
        referenceInformationDTO.setId( referenceInformation.getId() );
        referenceInformationDTO.setName( referenceInformation.getName() );
        referenceInformationDTO.setDesignation( referenceInformation.getDesignation() );
        referenceInformationDTO.setOrganization( referenceInformation.getOrganization() );
        referenceInformationDTO.setContactNumber( referenceInformation.getContactNumber() );

        return referenceInformationDTO;
    }

    @Override
    public ReferenceInformation toEntity(ReferenceInformationDTO referenceInformationDTO) {
        if ( referenceInformationDTO == null ) {
            return null;
        }

        ReferenceInformation referenceInformation = new ReferenceInformation();

        referenceInformation.setEmployee( employeeMapper.fromId( referenceInformationDTO.getEmployeeId() ) );
        referenceInformation.setId( referenceInformationDTO.getId() );
        referenceInformation.setName( referenceInformationDTO.getName() );
        referenceInformation.setDesignation( referenceInformationDTO.getDesignation() );
        referenceInformation.setOrganization( referenceInformationDTO.getOrganization() );
        referenceInformation.setContactNumber( referenceInformationDTO.getContactNumber() );

        return referenceInformation;
    }

    private Long referenceInformationEmployeeId(ReferenceInformation referenceInformation) {
        if ( referenceInformation == null ) {
            return null;
        }
        Employee employee = referenceInformation.getEmployee();
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
