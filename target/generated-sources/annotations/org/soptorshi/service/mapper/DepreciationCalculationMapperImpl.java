package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.DepreciationCalculation;
import org.soptorshi.domain.FinancialAccountYear;
import org.soptorshi.service.dto.DepreciationCalculationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class DepreciationCalculationMapperImpl implements DepreciationCalculationMapper {

    @Autowired
    private FinancialAccountYearMapper financialAccountYearMapper;

    @Override
    public List<DepreciationCalculation> toEntity(List<DepreciationCalculationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DepreciationCalculation> list = new ArrayList<DepreciationCalculation>( dtoList.size() );
        for ( DepreciationCalculationDTO depreciationCalculationDTO : dtoList ) {
            list.add( toEntity( depreciationCalculationDTO ) );
        }

        return list;
    }

    @Override
    public List<DepreciationCalculationDTO> toDto(List<DepreciationCalculation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DepreciationCalculationDTO> list = new ArrayList<DepreciationCalculationDTO>( entityList.size() );
        for ( DepreciationCalculation depreciationCalculation : entityList ) {
            list.add( toDto( depreciationCalculation ) );
        }

        return list;
    }

    @Override
    public DepreciationCalculationDTO toDto(DepreciationCalculation depreciationCalculation) {
        if ( depreciationCalculation == null ) {
            return null;
        }

        DepreciationCalculationDTO depreciationCalculationDTO = new DepreciationCalculationDTO();

        Long id = depreciationCalculationFinancialAccountYearId( depreciationCalculation );
        if ( id != null ) {
            depreciationCalculationDTO.setFinancialAccountYearId( id );
        }
        depreciationCalculationDTO.setId( depreciationCalculation.getId() );
        depreciationCalculationDTO.setMonthType( depreciationCalculation.getMonthType() );
        depreciationCalculationDTO.setIsExecuted( depreciationCalculation.isIsExecuted() );
        depreciationCalculationDTO.setCreatedBy( depreciationCalculation.getCreatedBy() );
        depreciationCalculationDTO.setCreatedOn( depreciationCalculation.getCreatedOn() );
        depreciationCalculationDTO.setModifiedBy( depreciationCalculation.getModifiedBy() );
        depreciationCalculationDTO.setModifiedOn( depreciationCalculation.getModifiedOn() );

        return depreciationCalculationDTO;
    }

    @Override
    public DepreciationCalculation toEntity(DepreciationCalculationDTO depreciationCalculationDTO) {
        if ( depreciationCalculationDTO == null ) {
            return null;
        }

        DepreciationCalculation depreciationCalculation = new DepreciationCalculation();

        depreciationCalculation.setFinancialAccountYear( financialAccountYearMapper.fromId( depreciationCalculationDTO.getFinancialAccountYearId() ) );
        depreciationCalculation.setId( depreciationCalculationDTO.getId() );
        depreciationCalculation.setMonthType( depreciationCalculationDTO.getMonthType() );
        depreciationCalculation.setIsExecuted( depreciationCalculationDTO.isIsExecuted() );
        depreciationCalculation.setCreatedBy( depreciationCalculationDTO.getCreatedBy() );
        depreciationCalculation.setCreatedOn( depreciationCalculationDTO.getCreatedOn() );
        depreciationCalculation.setModifiedBy( depreciationCalculationDTO.getModifiedBy() );
        depreciationCalculation.setModifiedOn( depreciationCalculationDTO.getModifiedOn() );

        return depreciationCalculation;
    }

    private Long depreciationCalculationFinancialAccountYearId(DepreciationCalculation depreciationCalculation) {
        if ( depreciationCalculation == null ) {
            return null;
        }
        FinancialAccountYear financialAccountYear = depreciationCalculation.getFinancialAccountYear();
        if ( financialAccountYear == null ) {
            return null;
        }
        Long id = financialAccountYear.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
