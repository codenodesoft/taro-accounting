package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.SupplyArea;
import org.soptorshi.domain.SupplyAreaManager;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.domain.SupplyZoneManager;
import org.soptorshi.service.dto.SupplyAreaManagerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:23+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyAreaManagerMapperImpl implements SupplyAreaManagerMapper {

    @Autowired
    private SupplyZoneMapper supplyZoneMapper;
    @Autowired
    private SupplyAreaMapper supplyAreaMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private SupplyZoneManagerMapper supplyZoneManagerMapper;

    @Override
    public List<SupplyAreaManager> toEntity(List<SupplyAreaManagerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyAreaManager> list = new ArrayList<SupplyAreaManager>( dtoList.size() );
        for ( SupplyAreaManagerDTO supplyAreaManagerDTO : dtoList ) {
            list.add( toEntity( supplyAreaManagerDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyAreaManagerDTO> toDto(List<SupplyAreaManager> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyAreaManagerDTO> list = new ArrayList<SupplyAreaManagerDTO>( entityList.size() );
        for ( SupplyAreaManager supplyAreaManager : entityList ) {
            list.add( toDto( supplyAreaManager ) );
        }

        return list;
    }

    @Override
    public SupplyAreaManagerDTO toDto(SupplyAreaManager supplyAreaManager) {
        if ( supplyAreaManager == null ) {
            return null;
        }

        SupplyAreaManagerDTO supplyAreaManagerDTO = new SupplyAreaManagerDTO();

        Long id = supplyAreaManagerSupplyAreaId( supplyAreaManager );
        if ( id != null ) {
            supplyAreaManagerDTO.setSupplyAreaId( id );
        }
        String name = supplyAreaManagerSupplyAreaName( supplyAreaManager );
        if ( name != null ) {
            supplyAreaManagerDTO.setSupplyAreaName( name );
        }
        String name1 = supplyAreaManagerSupplyZoneName( supplyAreaManager );
        if ( name1 != null ) {
            supplyAreaManagerDTO.setSupplyZoneName( name1 );
        }
        Long id1 = supplyAreaManagerSupplyZoneManagerId( supplyAreaManager );
        if ( id1 != null ) {
            supplyAreaManagerDTO.setSupplyZoneManagerId( id1 );
        }
        String fullName = supplyAreaManagerEmployeeFullName( supplyAreaManager );
        if ( fullName != null ) {
            supplyAreaManagerDTO.setEmployeeFullName( fullName );
        }
        Long id2 = supplyAreaManagerEmployeeId( supplyAreaManager );
        if ( id2 != null ) {
            supplyAreaManagerDTO.setEmployeeId( id2 );
        }
        Long id3 = supplyAreaManagerSupplyZoneId( supplyAreaManager );
        if ( id3 != null ) {
            supplyAreaManagerDTO.setSupplyZoneId( id3 );
        }
        supplyAreaManagerDTO.setId( supplyAreaManager.getId() );
        supplyAreaManagerDTO.setCreatedBy( supplyAreaManager.getCreatedBy() );
        supplyAreaManagerDTO.setCreatedOn( supplyAreaManager.getCreatedOn() );
        supplyAreaManagerDTO.setUpdatedBy( supplyAreaManager.getUpdatedBy() );
        supplyAreaManagerDTO.setUpdatedOn( supplyAreaManager.getUpdatedOn() );
        supplyAreaManagerDTO.setEndDate( supplyAreaManager.getEndDate() );
        supplyAreaManagerDTO.setStatus( supplyAreaManager.getStatus() );

        return supplyAreaManagerDTO;
    }

    @Override
    public SupplyAreaManager toEntity(SupplyAreaManagerDTO supplyAreaManagerDTO) {
        if ( supplyAreaManagerDTO == null ) {
            return null;
        }

        SupplyAreaManager supplyAreaManager = new SupplyAreaManager();

        supplyAreaManager.setSupplyArea( supplyAreaMapper.fromId( supplyAreaManagerDTO.getSupplyAreaId() ) );
        supplyAreaManager.setSupplyZone( supplyZoneMapper.fromId( supplyAreaManagerDTO.getSupplyZoneId() ) );
        supplyAreaManager.setEmployee( employeeMapper.fromId( supplyAreaManagerDTO.getEmployeeId() ) );
        supplyAreaManager.setSupplyZoneManager( supplyZoneManagerMapper.fromId( supplyAreaManagerDTO.getSupplyZoneManagerId() ) );
        supplyAreaManager.setId( supplyAreaManagerDTO.getId() );
        supplyAreaManager.setCreatedBy( supplyAreaManagerDTO.getCreatedBy() );
        supplyAreaManager.setCreatedOn( supplyAreaManagerDTO.getCreatedOn() );
        supplyAreaManager.setUpdatedBy( supplyAreaManagerDTO.getUpdatedBy() );
        supplyAreaManager.setUpdatedOn( supplyAreaManagerDTO.getUpdatedOn() );
        supplyAreaManager.setEndDate( supplyAreaManagerDTO.getEndDate() );
        supplyAreaManager.setStatus( supplyAreaManagerDTO.getStatus() );

        return supplyAreaManager;
    }

    private Long supplyAreaManagerSupplyAreaId(SupplyAreaManager supplyAreaManager) {
        if ( supplyAreaManager == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyAreaManager.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        Long id = supplyArea.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyAreaManagerSupplyAreaName(SupplyAreaManager supplyAreaManager) {
        if ( supplyAreaManager == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyAreaManager.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        String name = supplyArea.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplyAreaManagerSupplyZoneName(SupplyAreaManager supplyAreaManager) {
        if ( supplyAreaManager == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyAreaManager.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        String name = supplyZone.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyAreaManagerSupplyZoneManagerId(SupplyAreaManager supplyAreaManager) {
        if ( supplyAreaManager == null ) {
            return null;
        }
        SupplyZoneManager supplyZoneManager = supplyAreaManager.getSupplyZoneManager();
        if ( supplyZoneManager == null ) {
            return null;
        }
        Long id = supplyZoneManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyAreaManagerEmployeeFullName(SupplyAreaManager supplyAreaManager) {
        if ( supplyAreaManager == null ) {
            return null;
        }
        Employee employee = supplyAreaManager.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long supplyAreaManagerEmployeeId(SupplyAreaManager supplyAreaManager) {
        if ( supplyAreaManager == null ) {
            return null;
        }
        Employee employee = supplyAreaManager.getEmployee();
        if ( employee == null ) {
            return null;
        }
        Long id = employee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyAreaManagerSupplyZoneId(SupplyAreaManager supplyAreaManager) {
        if ( supplyAreaManager == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyAreaManager.getSupplyZone();
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
