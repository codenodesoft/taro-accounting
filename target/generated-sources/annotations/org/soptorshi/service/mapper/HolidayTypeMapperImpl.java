package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.HolidayType;
import org.soptorshi.service.dto.HolidayTypeDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class HolidayTypeMapperImpl implements HolidayTypeMapper {

    @Override
    public HolidayType toEntity(HolidayTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        HolidayType holidayType = new HolidayType();

        holidayType.setId( dto.getId() );
        holidayType.setName( dto.getName() );
        holidayType.setCreatedBy( dto.getCreatedBy() );
        holidayType.setCreatedOn( dto.getCreatedOn() );
        holidayType.setUpdatedBy( dto.getUpdatedBy() );
        holidayType.setUpdatedOn( dto.getUpdatedOn() );

        return holidayType;
    }

    @Override
    public HolidayTypeDTO toDto(HolidayType entity) {
        if ( entity == null ) {
            return null;
        }

        HolidayTypeDTO holidayTypeDTO = new HolidayTypeDTO();

        holidayTypeDTO.setId( entity.getId() );
        holidayTypeDTO.setName( entity.getName() );
        holidayTypeDTO.setCreatedBy( entity.getCreatedBy() );
        holidayTypeDTO.setCreatedOn( entity.getCreatedOn() );
        holidayTypeDTO.setUpdatedBy( entity.getUpdatedBy() );
        holidayTypeDTO.setUpdatedOn( entity.getUpdatedOn() );

        return holidayTypeDTO;
    }

    @Override
    public List<HolidayType> toEntity(List<HolidayTypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<HolidayType> list = new ArrayList<HolidayType>( dtoList.size() );
        for ( HolidayTypeDTO holidayTypeDTO : dtoList ) {
            list.add( toEntity( holidayTypeDTO ) );
        }

        return list;
    }

    @Override
    public List<HolidayTypeDTO> toDto(List<HolidayType> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<HolidayTypeDTO> list = new ArrayList<HolidayTypeDTO>( entityList.size() );
        for ( HolidayType holidayType : entityList ) {
            list.add( toDto( holidayType ) );
        }

        return list;
    }
}
