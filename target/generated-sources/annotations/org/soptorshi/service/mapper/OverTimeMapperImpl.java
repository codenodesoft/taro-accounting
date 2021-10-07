package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.OverTime;
import org.soptorshi.service.dto.OverTimeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class OverTimeMapperImpl implements OverTimeMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<OverTime> toEntity(List<OverTimeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OverTime> list = new ArrayList<OverTime>( dtoList.size() );
        for ( OverTimeDTO overTimeDTO : dtoList ) {
            list.add( toEntity( overTimeDTO ) );
        }

        return list;
    }

    @Override
    public List<OverTimeDTO> toDto(List<OverTime> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OverTimeDTO> list = new ArrayList<OverTimeDTO>( entityList.size() );
        for ( OverTime overTime : entityList ) {
            list.add( toDto( overTime ) );
        }

        return list;
    }

    @Override
    public OverTimeDTO toDto(OverTime overTime) {
        if ( overTime == null ) {
            return null;
        }

        OverTimeDTO overTimeDTO = new OverTimeDTO();

        String fullName = overTimeEmployeeFullName( overTime );
        if ( fullName != null ) {
            overTimeDTO.setEmployeeFullName( fullName );
        }
        Long id = overTimeEmployeeId( overTime );
        if ( id != null ) {
            overTimeDTO.setEmployeeId( id );
        }
        overTimeDTO.setId( overTime.getId() );
        overTimeDTO.setOverTimeDate( overTime.getOverTimeDate() );
        overTimeDTO.setFromTime( overTime.getFromTime() );
        overTimeDTO.setToTime( overTime.getToTime() );
        overTimeDTO.setDuration( overTime.getDuration() );
        overTimeDTO.setCreatedBy( overTime.getCreatedBy() );
        overTimeDTO.setCreatedOn( overTime.getCreatedOn() );
        overTimeDTO.setUpdatedBy( overTime.getUpdatedBy() );
        overTimeDTO.setUpdatedOn( overTime.getUpdatedOn() );

        return overTimeDTO;
    }

    @Override
    public OverTime toEntity(OverTimeDTO overTimeDTO) {
        if ( overTimeDTO == null ) {
            return null;
        }

        OverTime overTime = new OverTime();

        overTime.setEmployee( employeeMapper.fromId( overTimeDTO.getEmployeeId() ) );
        overTime.setId( overTimeDTO.getId() );
        overTime.setOverTimeDate( overTimeDTO.getOverTimeDate() );
        overTime.setFromTime( overTimeDTO.getFromTime() );
        overTime.setToTime( overTimeDTO.getToTime() );
        overTime.setDuration( overTimeDTO.getDuration() );
        overTime.setCreatedBy( overTimeDTO.getCreatedBy() );
        overTime.setCreatedOn( overTimeDTO.getCreatedOn() );
        overTime.setUpdatedBy( overTimeDTO.getUpdatedBy() );
        overTime.setUpdatedOn( overTimeDTO.getUpdatedOn() );

        return overTime;
    }

    private String overTimeEmployeeFullName(OverTime overTime) {
        if ( overTime == null ) {
            return null;
        }
        Employee employee = overTime.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long overTimeEmployeeId(OverTime overTime) {
        if ( overTime == null ) {
            return null;
        }
        Employee employee = overTime.getEmployee();
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
