package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.LeaveType;
import org.soptorshi.service.dto.LeaveTypeDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class LeaveTypeMapperImpl implements LeaveTypeMapper {

    @Override
    public LeaveType toEntity(LeaveTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        LeaveType leaveType = new LeaveType();

        leaveType.setId( dto.getId() );
        leaveType.setName( dto.getName() );
        leaveType.setPaidLeave( dto.getPaidLeave() );
        leaveType.setMaximumNumberOfDays( dto.getMaximumNumberOfDays() );
        leaveType.setDescription( dto.getDescription() );
        leaveType.setCreatedBy( dto.getCreatedBy() );
        leaveType.setCreatedOn( dto.getCreatedOn() );
        leaveType.setUpdatedBy( dto.getUpdatedBy() );
        leaveType.setUpdatedOn( dto.getUpdatedOn() );

        return leaveType;
    }

    @Override
    public LeaveTypeDTO toDto(LeaveType entity) {
        if ( entity == null ) {
            return null;
        }

        LeaveTypeDTO leaveTypeDTO = new LeaveTypeDTO();

        leaveTypeDTO.setId( entity.getId() );
        leaveTypeDTO.setName( entity.getName() );
        leaveTypeDTO.setPaidLeave( entity.getPaidLeave() );
        leaveTypeDTO.setMaximumNumberOfDays( entity.getMaximumNumberOfDays() );
        leaveTypeDTO.setDescription( entity.getDescription() );
        leaveTypeDTO.setCreatedBy( entity.getCreatedBy() );
        leaveTypeDTO.setCreatedOn( entity.getCreatedOn() );
        leaveTypeDTO.setUpdatedBy( entity.getUpdatedBy() );
        leaveTypeDTO.setUpdatedOn( entity.getUpdatedOn() );

        return leaveTypeDTO;
    }

    @Override
    public List<LeaveType> toEntity(List<LeaveTypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<LeaveType> list = new ArrayList<LeaveType>( dtoList.size() );
        for ( LeaveTypeDTO leaveTypeDTO : dtoList ) {
            list.add( toEntity( leaveTypeDTO ) );
        }

        return list;
    }

    @Override
    public List<LeaveTypeDTO> toDto(List<LeaveType> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LeaveTypeDTO> list = new ArrayList<LeaveTypeDTO>( entityList.size() );
        for ( LeaveType leaveType : entityList ) {
            list.add( toDto( leaveType ) );
        }

        return list;
    }
}
