package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.FinancialAccountYear;
import org.soptorshi.service.dto.FinancialAccountYearDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class FinancialAccountYearMapperImpl implements FinancialAccountYearMapper {

    @Override
    public FinancialAccountYear toEntity(FinancialAccountYearDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FinancialAccountYear financialAccountYear = new FinancialAccountYear();

        financialAccountYear.setId( dto.getId() );
        financialAccountYear.setStartDate( dto.getStartDate() );
        financialAccountYear.setEndDate( dto.getEndDate() );
        financialAccountYear.setPreviousStartDate( dto.getPreviousStartDate() );
        financialAccountYear.setPreviousEndDate( dto.getPreviousEndDate() );
        financialAccountYear.setDurationStr( dto.getDurationStr() );
        financialAccountYear.setStatus( dto.getStatus() );

        return financialAccountYear;
    }

    @Override
    public FinancialAccountYearDTO toDto(FinancialAccountYear entity) {
        if ( entity == null ) {
            return null;
        }

        FinancialAccountYearDTO financialAccountYearDTO = new FinancialAccountYearDTO();

        financialAccountYearDTO.setId( entity.getId() );
        financialAccountYearDTO.setStartDate( entity.getStartDate() );
        financialAccountYearDTO.setEndDate( entity.getEndDate() );
        financialAccountYearDTO.setPreviousStartDate( entity.getPreviousStartDate() );
        financialAccountYearDTO.setPreviousEndDate( entity.getPreviousEndDate() );
        financialAccountYearDTO.setDurationStr( entity.getDurationStr() );
        financialAccountYearDTO.setStatus( entity.getStatus() );

        return financialAccountYearDTO;
    }

    @Override
    public List<FinancialAccountYear> toEntity(List<FinancialAccountYearDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<FinancialAccountYear> list = new ArrayList<FinancialAccountYear>( dtoList.size() );
        for ( FinancialAccountYearDTO financialAccountYearDTO : dtoList ) {
            list.add( toEntity( financialAccountYearDTO ) );
        }

        return list;
    }

    @Override
    public List<FinancialAccountYearDTO> toDto(List<FinancialAccountYear> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<FinancialAccountYearDTO> list = new ArrayList<FinancialAccountYearDTO>( entityList.size() );
        for ( FinancialAccountYear financialAccountYear : entityList ) {
            list.add( toDto( financialAccountYear ) );
        }

        return list;
    }
}
