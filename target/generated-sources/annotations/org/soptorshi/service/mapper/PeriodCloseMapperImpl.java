package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.FinancialAccountYear;
import org.soptorshi.domain.PeriodClose;
import org.soptorshi.service.dto.PeriodCloseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class PeriodCloseMapperImpl implements PeriodCloseMapper {

    @Autowired
    private FinancialAccountYearMapper financialAccountYearMapper;

    @Override
    public List<PeriodClose> toEntity(List<PeriodCloseDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PeriodClose> list = new ArrayList<PeriodClose>( dtoList.size() );
        for ( PeriodCloseDTO periodCloseDTO : dtoList ) {
            list.add( toEntity( periodCloseDTO ) );
        }

        return list;
    }

    @Override
    public List<PeriodCloseDTO> toDto(List<PeriodClose> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PeriodCloseDTO> list = new ArrayList<PeriodCloseDTO>( entityList.size() );
        for ( PeriodClose periodClose : entityList ) {
            list.add( toDto( periodClose ) );
        }

        return list;
    }

    @Override
    public PeriodCloseDTO toDto(PeriodClose periodClose) {
        if ( periodClose == null ) {
            return null;
        }

        PeriodCloseDTO periodCloseDTO = new PeriodCloseDTO();

        Long id = periodCloseFinancialAccountYearId( periodClose );
        if ( id != null ) {
            periodCloseDTO.setFinancialAccountYearId( id );
        }
        String durationStr = periodCloseFinancialAccountYearDurationStr( periodClose );
        if ( durationStr != null ) {
            periodCloseDTO.setFinancialAccountYearDurationStr( durationStr );
        }
        periodCloseDTO.setId( periodClose.getId() );
        periodCloseDTO.setMonthType( periodClose.getMonthType() );
        periodCloseDTO.setCloseYear( periodClose.getCloseYear() );
        periodCloseDTO.setFlag( periodClose.getFlag() );
        periodCloseDTO.setModifiedBy( periodClose.getModifiedBy() );
        periodCloseDTO.setModifiedOn( periodClose.getModifiedOn() );

        return periodCloseDTO;
    }

    @Override
    public PeriodClose toEntity(PeriodCloseDTO periodCloseDTO) {
        if ( periodCloseDTO == null ) {
            return null;
        }

        PeriodClose periodClose = new PeriodClose();

        periodClose.setFinancialAccountYear( financialAccountYearMapper.fromId( periodCloseDTO.getFinancialAccountYearId() ) );
        periodClose.setId( periodCloseDTO.getId() );
        periodClose.setMonthType( periodCloseDTO.getMonthType() );
        periodClose.setCloseYear( periodCloseDTO.getCloseYear() );
        periodClose.setFlag( periodCloseDTO.getFlag() );
        periodClose.setModifiedBy( periodCloseDTO.getModifiedBy() );
        periodClose.setModifiedOn( periodCloseDTO.getModifiedOn() );

        return periodClose;
    }

    private Long periodCloseFinancialAccountYearId(PeriodClose periodClose) {
        if ( periodClose == null ) {
            return null;
        }
        FinancialAccountYear financialAccountYear = periodClose.getFinancialAccountYear();
        if ( financialAccountYear == null ) {
            return null;
        }
        Long id = financialAccountYear.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String periodCloseFinancialAccountYearDurationStr(PeriodClose periodClose) {
        if ( periodClose == null ) {
            return null;
        }
        FinancialAccountYear financialAccountYear = periodClose.getFinancialAccountYear();
        if ( financialAccountYear == null ) {
            return null;
        }
        String durationStr = financialAccountYear.getDurationStr();
        if ( durationStr == null ) {
            return null;
        }
        return durationStr;
    }
}
