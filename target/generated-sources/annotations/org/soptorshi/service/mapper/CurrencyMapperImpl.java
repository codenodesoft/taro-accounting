package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Currency;
import org.soptorshi.service.dto.CurrencyDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class CurrencyMapperImpl implements CurrencyMapper {

    @Override
    public Currency toEntity(CurrencyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Currency currency = new Currency();

        currency.setId( dto.getId() );
        currency.setDescription( dto.getDescription() );
        currency.setNotation( dto.getNotation() );
        currency.setFlag( dto.getFlag() );
        currency.setModifiedBy( dto.getModifiedBy() );
        currency.setModifiedOn( dto.getModifiedOn() );

        return currency;
    }

    @Override
    public CurrencyDTO toDto(Currency entity) {
        if ( entity == null ) {
            return null;
        }

        CurrencyDTO currencyDTO = new CurrencyDTO();

        currencyDTO.setId( entity.getId() );
        currencyDTO.setDescription( entity.getDescription() );
        currencyDTO.setNotation( entity.getNotation() );
        currencyDTO.setFlag( entity.getFlag() );
        currencyDTO.setModifiedBy( entity.getModifiedBy() );
        currencyDTO.setModifiedOn( entity.getModifiedOn() );

        return currencyDTO;
    }

    @Override
    public List<Currency> toEntity(List<CurrencyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Currency> list = new ArrayList<Currency>( dtoList.size() );
        for ( CurrencyDTO currencyDTO : dtoList ) {
            list.add( toEntity( currencyDTO ) );
        }

        return list;
    }

    @Override
    public List<CurrencyDTO> toDto(List<Currency> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CurrencyDTO> list = new ArrayList<CurrencyDTO>( entityList.size() );
        for ( Currency currency : entityList ) {
            list.add( toDto( currency ) );
        }

        return list;
    }
}
