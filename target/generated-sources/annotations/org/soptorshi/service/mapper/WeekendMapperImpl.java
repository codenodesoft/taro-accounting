package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Weekend;
import org.soptorshi.service.dto.WeekendDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class WeekendMapperImpl implements WeekendMapper {

    @Override
    public Weekend toEntity(WeekendDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Weekend weekend = new Weekend();

        weekend.setId( dto.getId() );
        weekend.setNumberOfDays( dto.getNumberOfDays() );
        weekend.setActiveFrom( dto.getActiveFrom() );
        weekend.setActiveTo( dto.getActiveTo() );
        weekend.setDay1( dto.getDay1() );
        weekend.setDay2( dto.getDay2() );
        weekend.setDay3( dto.getDay3() );
        weekend.setStatus( dto.getStatus() );
        weekend.setCreatedBy( dto.getCreatedBy() );
        weekend.setCreatedOn( dto.getCreatedOn() );
        weekend.setUpdatedBy( dto.getUpdatedBy() );
        weekend.setUpdatedOn( dto.getUpdatedOn() );

        return weekend;
    }

    @Override
    public WeekendDTO toDto(Weekend entity) {
        if ( entity == null ) {
            return null;
        }

        WeekendDTO weekendDTO = new WeekendDTO();

        weekendDTO.setId( entity.getId() );
        weekendDTO.setNumberOfDays( entity.getNumberOfDays() );
        weekendDTO.setActiveFrom( entity.getActiveFrom() );
        weekendDTO.setActiveTo( entity.getActiveTo() );
        weekendDTO.setDay1( entity.getDay1() );
        weekendDTO.setDay2( entity.getDay2() );
        weekendDTO.setDay3( entity.getDay3() );
        weekendDTO.setStatus( entity.getStatus() );
        weekendDTO.setCreatedBy( entity.getCreatedBy() );
        weekendDTO.setCreatedOn( entity.getCreatedOn() );
        weekendDTO.setUpdatedBy( entity.getUpdatedBy() );
        weekendDTO.setUpdatedOn( entity.getUpdatedOn() );

        return weekendDTO;
    }

    @Override
    public List<Weekend> toEntity(List<WeekendDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Weekend> list = new ArrayList<Weekend>( dtoList.size() );
        for ( WeekendDTO weekendDTO : dtoList ) {
            list.add( toEntity( weekendDTO ) );
        }

        return list;
    }

    @Override
    public List<WeekendDTO> toDto(List<Weekend> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<WeekendDTO> list = new ArrayList<WeekendDTO>( entityList.size() );
        for ( Weekend weekend : entityList ) {
            list.add( toDto( weekend ) );
        }

        return list;
    }
}
