package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.domain.SupplyZoneManager;
import org.soptorshi.service.dto.SupplyZoneManagerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyZoneManagerMapperImpl implements SupplyZoneManagerMapper {

    @Autowired
    private SupplyZoneMapper supplyZoneMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<SupplyZoneManager> toEntity(List<SupplyZoneManagerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyZoneManager> list = new ArrayList<SupplyZoneManager>( dtoList.size() );
        for ( SupplyZoneManagerDTO supplyZoneManagerDTO : dtoList ) {
            list.add( toEntity( supplyZoneManagerDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyZoneManagerDTO> toDto(List<SupplyZoneManager> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyZoneManagerDTO> list = new ArrayList<SupplyZoneManagerDTO>( entityList.size() );
        for ( SupplyZoneManager supplyZoneManager : entityList ) {
            list.add( toDto( supplyZoneManager ) );
        }

        return list;
    }

    @Override
    public SupplyZoneManagerDTO toDto(SupplyZoneManager supplyZoneManager) {
        if ( supplyZoneManager == null ) {
            return null;
        }

        SupplyZoneManagerDTO supplyZoneManagerDTO = new SupplyZoneManagerDTO();

        Long id = supplyZoneManagerEmployeeId( supplyZoneManager );
        if ( id != null ) {
            supplyZoneManagerDTO.setEmployeeId( id );
        }
        String name = supplyZoneManagerSupplyZoneName( supplyZoneManager );
        if ( name != null ) {
            supplyZoneManagerDTO.setSupplyZoneName( name );
        }
        String fullName = supplyZoneManagerEmployeeFullName( supplyZoneManager );
        if ( fullName != null ) {
            supplyZoneManagerDTO.setEmployeeFullName( fullName );
        }
        Long id1 = supplyZoneManagerSupplyZoneId( supplyZoneManager );
        if ( id1 != null ) {
            supplyZoneManagerDTO.setSupplyZoneId( id1 );
        }
        supplyZoneManagerDTO.setId( supplyZoneManager.getId() );
        supplyZoneManagerDTO.setEndDate( supplyZoneManager.getEndDate() );
        supplyZoneManagerDTO.setCreatedBy( supplyZoneManager.getCreatedBy() );
        supplyZoneManagerDTO.setCreatedOn( supplyZoneManager.getCreatedOn() );
        supplyZoneManagerDTO.setUpdatedBy( supplyZoneManager.getUpdatedBy() );
        supplyZoneManagerDTO.setUpdatedOn( supplyZoneManager.getUpdatedOn() );
        supplyZoneManagerDTO.setStatus( supplyZoneManager.getStatus() );

        return supplyZoneManagerDTO;
    }

    @Override
    public SupplyZoneManager toEntity(SupplyZoneManagerDTO supplyZoneManagerDTO) {
        if ( supplyZoneManagerDTO == null ) {
            return null;
        }

        SupplyZoneManager supplyZoneManager = new SupplyZoneManager();

        supplyZoneManager.setEmployee( employeeMapper.fromId( supplyZoneManagerDTO.getEmployeeId() ) );
        supplyZoneManager.setSupplyZone( supplyZoneMapper.fromId( supplyZoneManagerDTO.getSupplyZoneId() ) );
        supplyZoneManager.setId( supplyZoneManagerDTO.getId() );
        supplyZoneManager.setEndDate( supplyZoneManagerDTO.getEndDate() );
        supplyZoneManager.setCreatedBy( supplyZoneManagerDTO.getCreatedBy() );
        supplyZoneManager.setCreatedOn( supplyZoneManagerDTO.getCreatedOn() );
        supplyZoneManager.setUpdatedBy( supplyZoneManagerDTO.getUpdatedBy() );
        supplyZoneManager.setUpdatedOn( supplyZoneManagerDTO.getUpdatedOn() );
        supplyZoneManager.setStatus( supplyZoneManagerDTO.getStatus() );

        return supplyZoneManager;
    }

    private Long supplyZoneManagerEmployeeId(SupplyZoneManager supplyZoneManager) {
        if ( supplyZoneManager == null ) {
            return null;
        }
        Employee employee = supplyZoneManager.getEmployee();
        if ( employee == null ) {
            return null;
        }
        Long id = employee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyZoneManagerSupplyZoneName(SupplyZoneManager supplyZoneManager) {
        if ( supplyZoneManager == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyZoneManager.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        String name = supplyZone.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplyZoneManagerEmployeeFullName(SupplyZoneManager supplyZoneManager) {
        if ( supplyZoneManager == null ) {
            return null;
        }
        Employee employee = supplyZoneManager.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long supplyZoneManagerSupplyZoneId(SupplyZoneManager supplyZoneManager) {
        if ( supplyZoneManager == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyZoneManager.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        Long id = supplyZone.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
