package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Currency;
import org.soptorshi.domain.JournalVoucher;
import org.soptorshi.service.dto.JournalVoucherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class JournalVoucherMapperImpl implements JournalVoucherMapper {

    @Autowired
    private CurrencyMapper currencyMapper;

    @Override
    public List<JournalVoucher> toEntity(List<JournalVoucherDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<JournalVoucher> list = new ArrayList<JournalVoucher>( dtoList.size() );
        for ( JournalVoucherDTO journalVoucherDTO : dtoList ) {
            list.add( toEntity( journalVoucherDTO ) );
        }

        return list;
    }

    @Override
    public List<JournalVoucherDTO> toDto(List<JournalVoucher> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<JournalVoucherDTO> list = new ArrayList<JournalVoucherDTO>( entityList.size() );
        for ( JournalVoucher journalVoucher : entityList ) {
            list.add( toDto( journalVoucher ) );
        }

        return list;
    }

    @Override
    public JournalVoucherDTO toDto(JournalVoucher journalVoucher) {
        if ( journalVoucher == null ) {
            return null;
        }

        JournalVoucherDTO journalVoucherDTO = new JournalVoucherDTO();

        Long id = journalVoucherCurrencyId( journalVoucher );
        if ( id != null ) {
            journalVoucherDTO.setCurrencyId( id );
        }
        String notation = journalVoucherCurrencyNotation( journalVoucher );
        if ( notation != null ) {
            journalVoucherDTO.setCurrencyNotation( notation );
        }
        journalVoucherDTO.setId( journalVoucher.getId() );
        journalVoucherDTO.setVoucherNo( journalVoucher.getVoucherNo() );
        journalVoucherDTO.setVoucherDate( journalVoucher.getVoucherDate() );
        journalVoucherDTO.setPostDate( journalVoucher.getPostDate() );
        journalVoucherDTO.setType( journalVoucher.getType() );
        journalVoucherDTO.setConversionFactor( journalVoucher.getConversionFactor() );
        journalVoucherDTO.setReference( journalVoucher.getReference() );
        journalVoucherDTO.setApplicationType( journalVoucher.getApplicationType() );
        journalVoucherDTO.setApplicationId( journalVoucher.getApplicationId() );
        journalVoucherDTO.setReferenceId( journalVoucher.getReferenceId() );
        journalVoucherDTO.setModifiedBy( journalVoucher.getModifiedBy() );
        journalVoucherDTO.setModifiedOn( journalVoucher.getModifiedOn() );

        return journalVoucherDTO;
    }

    @Override
    public JournalVoucher toEntity(JournalVoucherDTO journalVoucherDTO) {
        if ( journalVoucherDTO == null ) {
            return null;
        }

        JournalVoucher journalVoucher = new JournalVoucher();

        journalVoucher.setCurrency( currencyMapper.fromId( journalVoucherDTO.getCurrencyId() ) );
        journalVoucher.setId( journalVoucherDTO.getId() );
        journalVoucher.setVoucherNo( journalVoucherDTO.getVoucherNo() );
        journalVoucher.setVoucherDate( journalVoucherDTO.getVoucherDate() );
        journalVoucher.setPostDate( journalVoucherDTO.getPostDate() );
        journalVoucher.setType( journalVoucherDTO.getType() );
        journalVoucher.setConversionFactor( journalVoucherDTO.getConversionFactor() );
        journalVoucher.setReference( journalVoucherDTO.getReference() );
        journalVoucher.setApplicationType( journalVoucherDTO.getApplicationType() );
        journalVoucher.setApplicationId( journalVoucherDTO.getApplicationId() );
        journalVoucher.setReferenceId( journalVoucherDTO.getReferenceId() );
        journalVoucher.setModifiedBy( journalVoucherDTO.getModifiedBy() );
        journalVoucher.setModifiedOn( journalVoucherDTO.getModifiedOn() );

        return journalVoucher;
    }

    private Long journalVoucherCurrencyId(JournalVoucher journalVoucher) {
        if ( journalVoucher == null ) {
            return null;
        }
        Currency currency = journalVoucher.getCurrency();
        if ( currency == null ) {
            return null;
        }
        Long id = currency.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String journalVoucherCurrencyNotation(JournalVoucher journalVoucher) {
        if ( journalVoucher == null ) {
            return null;
        }
        Currency currency = journalVoucher.getCurrency();
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
