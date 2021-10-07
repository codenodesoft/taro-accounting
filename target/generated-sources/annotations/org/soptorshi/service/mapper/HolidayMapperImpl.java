package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Holiday;
import org.soptorshi.domain.HolidayType;
import org.soptorshi.service.dto.HolidayDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class HolidayMapperImpl implements HolidayMapper {

    @Autowired
    private HolidayTypeMapper holidayTypeMapper;

    @Override
    public List<Holiday> toEntity(List<HolidayDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Holiday> list = new ArrayList<Holiday>( dtoList.size() );
        for ( HolidayDTO holidayDTO : dtoList ) {
            list.add( toEntity( holidayDTO ) );
        }

        return list;
    }

    @Override
    public List<HolidayDTO> toDto(List<Holiday> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<HolidayDTO> list = new ArrayList<HolidayDTO>( entityList.size() );
        for ( Holiday holiday : entityList ) {
            list.add( toDto( holiday ) );
        }

        return list;
    }

    @Override
    public HolidayDTO toDto(Holiday holiday) {
        if ( holiday == null ) {
            return null;
        }

        HolidayDTO holidayDTO = new HolidayDTO();

        Long id = holidayHolidayTypeId( holiday );
        if ( id != null ) {
            holidayDTO.setHolidayTypeId( id );
        }
        String name = holidayHolidayTypeName( holiday );
        if ( name != null ) {
            holidayDTO.setHolidayTypeName( name );
        }
        holidayDTO.setId( holiday.getId() );
        holidayDTO.setFromDate( holiday.getFromDate() );
        holidayDTO.setToDate( holiday.getToDate() );
        holidayDTO.setNumberOfDays( holiday.getNumberOfDays() );
        holidayDTO.setMoonDependency( holiday.getMoonDependency() );
        holidayDTO.setHolidayDeclaredBy( holiday.getHolidayDeclaredBy() );
        holidayDTO.setRemarks( holiday.getRemarks() );
        holidayDTO.setCreatedBy( holiday.getCreatedBy() );
        holidayDTO.setCreatedOn( holiday.getCreatedOn() );
        holidayDTO.setUpdatedBy( holiday.getUpdatedBy() );
        holidayDTO.setUpdatedOn( holiday.getUpdatedOn() );
        holidayDTO.setHolidayYear( holiday.getHolidayYear() );

        return holidayDTO;
    }

    @Override
    public Holiday toEntity(HolidayDTO holidayDTO) {
        if ( holidayDTO == null ) {
            return null;
        }

        Holiday holiday = new Holiday();

        holiday.setHolidayType( holidayTypeMapper.fromId( holidayDTO.getHolidayTypeId() ) );
        holiday.setId( holidayDTO.getId() );
        holiday.setFromDate( holidayDTO.getFromDate() );
        holiday.setToDate( holidayDTO.getToDate() );
        holiday.setNumberOfDays( holidayDTO.getNumberOfDays() );
        holiday.setMoonDependency( holidayDTO.getMoonDependency() );
        holiday.setHolidayDeclaredBy( holidayDTO.getHolidayDeclaredBy() );
        holiday.setRemarks( holidayDTO.getRemarks() );
        holiday.setCreatedBy( holidayDTO.getCreatedBy() );
        holiday.setCreatedOn( holidayDTO.getCreatedOn() );
        holiday.setUpdatedBy( holidayDTO.getUpdatedBy() );
        holiday.setUpdatedOn( holidayDTO.getUpdatedOn() );
        holiday.setHolidayYear( holidayDTO.getHolidayYear() );

        return holiday;
    }

    private Long holidayHolidayTypeId(Holiday holiday) {
        if ( holiday == null ) {
            return null;
        }
        HolidayType holidayType = holiday.getHolidayType();
        if ( holidayType == null ) {
            return null;
        }
        Long id = holidayType.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String holidayHolidayTypeName(Holiday holiday) {
        if ( holiday == null ) {
            return null;
        }
        HolidayType holidayType = holiday.getHolidayType();
        if ( holidayType == null ) {
            return null;
        }
        String name = holidayType.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
