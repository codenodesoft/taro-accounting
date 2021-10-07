package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.ConversionFactor;
import org.soptorshi.domain.Currency;
import org.soptorshi.service.dto.ConversionFactorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:23+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ConversionFactorMapperImpl implements ConversionFactorMapper {

    @Autowired
    private CurrencyMapper currencyMapper;

    @Override
    public List<ConversionFactor> toEntity(List<ConversionFactorDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ConversionFactor> list = new ArrayList<ConversionFactor>( dtoList.size() );
        for ( ConversionFactorDTO conversionFactorDTO : dtoList ) {
            list.add( toEntity( conversionFactorDTO ) );
        }

        return list;
    }

    @Override
    public List<ConversionFactorDTO> toDto(List<ConversionFactor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ConversionFactorDTO> list = new ArrayList<ConversionFactorDTO>( entityList.size() );
        for ( ConversionFactor conversionFactor : entityList ) {
            list.add( toDto( conversionFactor ) );
        }

        return list;
    }

    @Override
    public ConversionFactorDTO toDto(ConversionFactor conversionFactor) {
        if ( conversionFactor == null ) {
            return null;
        }

        ConversionFactorDTO conversionFactorDTO = new ConversionFactorDTO();

        Long id = conversionFactorCurrencyId( conversionFactor );
        if ( id != null ) {
            conversionFactorDTO.setCurrencyId( id );
        }
        String notation = conversionFactorCurrencyNotation( conversionFactor );
        if ( notation != null ) {
            conversionFactorDTO.setCurrencyNotation( notation );
        }
        conversionFactorDTO.setId( conversionFactor.getId() );
        conversionFactorDTO.setCovFactor( conversionFactor.getCovFactor() );
        conversionFactorDTO.setRcovFactor( conversionFactor.getRcovFactor() );
        conversionFactorDTO.setBcovFactor( conversionFactor.getBcovFactor() );
        conversionFactorDTO.setRbcovFactor( conversionFactor.getRbcovFactor() );
        conversionFactorDTO.setModifiedBy( conversionFactor.getModifiedBy() );
        conversionFactorDTO.setModifiedOn( conversionFactor.getModifiedOn() );

        return conversionFactorDTO;
    }

    @Override
    public ConversionFactor toEntity(ConversionFactorDTO conversionFactorDTO) {
        if ( conversionFactorDTO == null ) {
            return null;
        }

        ConversionFactor conversionFactor = new ConversionFactor();

        conversionFactor.setCurrency( currencyMapper.fromId( conversionFactorDTO.getCurrencyId() ) );
        conversionFactor.setId( conversionFactorDTO.getId() );
        conversionFactor.setCovFactor( conversionFactorDTO.getCovFactor() );
        conversionFactor.setRcovFactor( conversionFactorDTO.getRcovFactor() );
        conversionFactor.setBcovFactor( conversionFactorDTO.getBcovFactor() );
        conversionFactor.setRbcovFactor( conversionFactorDTO.getRbcovFactor() );
        conversionFactor.setModifiedBy( conversionFactorDTO.getModifiedBy() );
        conversionFactor.setModifiedOn( conversionFactorDTO.getModifiedOn() );

        return conversionFactor;
    }

    private Long conversionFactorCurrencyId(ConversionFactor conversionFactor) {
        if ( conversionFactor == null ) {
            return null;
        }
        Currency currency = conversionFactor.getCurrency();
        if ( currency == null ) {
            return null;
        }
        Long id = currency.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String conversionFactorCurrencyNotation(ConversionFactor conversionFactor) {
        if ( conversionFactor == null ) {
            return null;
        }
        Currency currency = conversionFactor.getCurrency();
        if ( currency == null ) {
            return null;
        }
        String notation = currency.getNotation();
        if ( notation == null ) {
            return null;
        }
        return notation;
    }
}
