package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.ContraVoucher;
import org.soptorshi.domain.Currency;
import org.soptorshi.service.dto.ContraVoucherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ContraVoucherMapperImpl implements ContraVoucherMapper {

    @Autowired
    private CurrencyMapper currencyMapper;

    @Override
    public List<ContraVoucher> toEntity(List<ContraVoucherDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ContraVoucher> list = new ArrayList<ContraVoucher>( dtoList.size() );
        for ( ContraVoucherDTO contraVoucherDTO : dtoList ) {
            list.add( toEntity( contraVoucherDTO ) );
        }

        return list;
    }

    @Override
    public List<ContraVoucherDTO> toDto(List<ContraVoucher> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ContraVoucherDTO> list = new ArrayList<ContraVoucherDTO>( entityList.size() );
        for ( ContraVoucher contraVoucher : entityList ) {
            list.add( toDto( contraVoucher ) );
        }

        return list;
    }

    @Override
    public ContraVoucherDTO toDto(ContraVoucher contraVoucher) {
        if ( contraVoucher == null ) {
            return null;
        }

        ContraVoucherDTO contraVoucherDTO = new ContraVoucherDTO();

        Long id = contraVoucherCurrencyId( contraVoucher );
        if ( id != null ) {
            contraVoucherDTO.setCurrencyId( id );
        }
        String notation = contraVoucherCurrencyNotation( contraVoucher );
        if ( notation != null ) {
            contraVoucherDTO.setCurrencyNotation( notation );
        }
        contraVoucherDTO.setId( contraVoucher.getId() );
        contraVoucherDTO.setVoucherNo( contraVoucher.getVoucherNo() );
        contraVoucherDTO.setVoucherDate( contraVoucher.getVoucherDate() );
        contraVoucherDTO.setPostDate( contraVoucher.getPostDate() );
        contraVoucherDTO.setApplicationType( contraVoucher.getApplicationType() );
        contraVoucherDTO.setApplicationId( contraVoucher.getApplicationId() );
        contraVoucherDTO.setConversionFactor( contraVoucher.getConversionFactor() );
        contraVoucherDTO.setModifiedBy( contraVoucher.getModifiedBy() );
        contraVoucherDTO.setModifiedOn( contraVoucher.getModifiedOn() );

        return contraVoucherDTO;
    }

    @Override
    public ContraVoucher toEntity(ContraVoucherDTO contraVoucherDTO) {
        if ( contraVoucherDTO == null ) {
            return null;
        }

        ContraVoucher contraVoucher = new ContraVoucher();

        contraVoucher.setCurrency( currencyMapper.fromId( contraVoucherDTO.getCurrencyId() ) );
        contraVoucher.setId( contraVoucherDTO.getId() );
        contraVoucher.setVoucherNo( contraVoucherDTO.getVoucherNo() );
        contraVoucher.setVoucherDate( contraVoucherDTO.getVoucherDate() );
        contraVoucher.setPostDate( contraVoucherDTO.getPostDate() );
        contraVoucher.setApplicationType( contraVoucherDTO.getApplicationType() );
        contraVoucher.setApplicationId( contraVoucherDTO.getApplicationId() );
        contraVoucher.setConversionFactor( contraVoucherDTO.getConversionFactor() );
        contraVoucher.setModifiedBy( contraVoucherDTO.getModifiedBy() );
        contraVoucher.setModifiedOn( contraVoucherDTO.getModifiedOn() );

        return contraVoucher;
    }

    private Long contraVoucherCurrencyId(ContraVoucher contraVoucher) {
        if ( contraVoucher == null ) {
            return null;
        }
        Currency currency = contraVoucher.getCurrency();
        if ( currency == null ) {
            return null;
        }
        Long id = currency.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String contraVoucherCurrencyNotation(ContraVoucher contraVoucher) {
        if ( contraVoucher == null ) {
            return null;
        }
        Currency currency = contraVoucher.getCurrency();
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
