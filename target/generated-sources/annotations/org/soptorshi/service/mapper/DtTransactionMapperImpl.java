package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Currency;
import org.soptorshi.domain.DtTransaction;
import org.soptorshi.domain.MstAccount;
import org.soptorshi.domain.Voucher;
import org.soptorshi.service.dto.DtTransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class DtTransactionMapperImpl implements DtTransactionMapper {

    @Autowired
    private MstAccountMapper mstAccountMapper;
    @Autowired
    private VoucherMapper voucherMapper;
    @Autowired
    private CurrencyMapper currencyMapper;

    @Override
    public List<DtTransaction> toEntity(List<DtTransactionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DtTransaction> list = new ArrayList<DtTransaction>( dtoList.size() );
        for ( DtTransactionDTO dtTransactionDTO : dtoList ) {
            list.add( toEntity( dtTransactionDTO ) );
        }

        return list;
    }

    @Override
    public List<DtTransactionDTO> toDto(List<DtTransaction> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DtTransactionDTO> list = new ArrayList<DtTransactionDTO>( entityList.size() );
        for ( DtTransaction dtTransaction : entityList ) {
            list.add( toDto( dtTransaction ) );
        }

        return list;
    }

    @Override
    public DtTransactionDTO toDto(DtTransaction dtTransaction) {
        if ( dtTransaction == null ) {
            return null;
        }

        DtTransactionDTO dtTransactionDTO = new DtTransactionDTO();

        Long id = dtTransactionAccountId( dtTransaction );
        if ( id != null ) {
            dtTransactionDTO.setAccountId( id );
        }
        String name = dtTransactionVoucherName( dtTransaction );
        if ( name != null ) {
            dtTransactionDTO.setVoucherName( name );
        }
        String name1 = dtTransactionAccountName( dtTransaction );
        if ( name1 != null ) {
            dtTransactionDTO.setAccountName( name1 );
        }
        String notation = dtTransactionCurrencyNotation( dtTransaction );
        if ( notation != null ) {
            dtTransactionDTO.setCurrencyNotation( notation );
        }
        Long id1 = dtTransactionVoucherId( dtTransaction );
        if ( id1 != null ) {
            dtTransactionDTO.setVoucherId( id1 );
        }
        Long id2 = dtTransactionCurrencyId( dtTransaction );
        if ( id2 != null ) {
            dtTransactionDTO.setCurrencyId( id2 );
        }
        dtTransactionDTO.setId( dtTransaction.getId() );
        dtTransactionDTO.setVoucherNo( dtTransaction.getVoucherNo() );
        dtTransactionDTO.setVoucherDate( dtTransaction.getVoucherDate() );
        dtTransactionDTO.setSerialNo( dtTransaction.getSerialNo() );
        dtTransactionDTO.setAmount( dtTransaction.getAmount() );
        dtTransactionDTO.setBalanceType( dtTransaction.getBalanceType() );
        dtTransactionDTO.setType( dtTransaction.getType() );
        dtTransactionDTO.setInvoiceNo( dtTransaction.getInvoiceNo() );
        dtTransactionDTO.setInvoiceDate( dtTransaction.getInvoiceDate() );
        dtTransactionDTO.setInstrumentType( dtTransaction.getInstrumentType() );
        dtTransactionDTO.setInstrumentNo( dtTransaction.getInstrumentNo() );
        dtTransactionDTO.setInstrumentDate( dtTransaction.getInstrumentDate() );
        dtTransactionDTO.setfCurrency( dtTransaction.getfCurrency() );
        dtTransactionDTO.setConvFactor( dtTransaction.getConvFactor() );
        dtTransactionDTO.setPostDate( dtTransaction.getPostDate() );
        dtTransactionDTO.setNarration( dtTransaction.getNarration() );
        dtTransactionDTO.setModifiedBy( dtTransaction.getModifiedBy() );
        dtTransactionDTO.setModifiedOn( dtTransaction.getModifiedOn() );
        dtTransactionDTO.setReference( dtTransaction.getReference() );

        return dtTransactionDTO;
    }

    @Override
    public DtTransaction toEntity(DtTransactionDTO dtTransactionDTO) {
        if ( dtTransactionDTO == null ) {
            return null;
        }

        DtTransaction dtTransaction = new DtTransaction();

        dtTransaction.setCurrency( currencyMapper.fromId( dtTransactionDTO.getCurrencyId() ) );
        dtTransaction.setVoucher( voucherMapper.fromId( dtTransactionDTO.getVoucherId() ) );
        dtTransaction.setAccount( mstAccountMapper.fromId( dtTransactionDTO.getAccountId() ) );
        dtTransaction.setId( dtTransactionDTO.getId() );
        dtTransaction.setVoucherNo( dtTransactionDTO.getVoucherNo() );
        dtTransaction.setVoucherDate( dtTransactionDTO.getVoucherDate() );
        dtTransaction.setSerialNo( dtTransactionDTO.getSerialNo() );
        dtTransaction.setAmount( dtTransactionDTO.getAmount() );
        dtTransaction.setBalanceType( dtTransactionDTO.getBalanceType() );
        dtTransaction.setType( dtTransactionDTO.getType() );
        dtTransaction.setInvoiceNo( dtTransactionDTO.getInvoiceNo() );
        dtTransaction.setInvoiceDate( dtTransactionDTO.getInvoiceDate() );
        dtTransaction.setInstrumentType( dtTransactionDTO.getInstrumentType() );
        dtTransaction.setInstrumentNo( dtTransactionDTO.getInstrumentNo() );
        dtTransaction.setInstrumentDate( dtTransactionDTO.getInstrumentDate() );
        dtTransaction.setfCurrency( dtTransactionDTO.getfCurrency() );
        dtTransaction.setConvFactor( dtTransactionDTO.getConvFactor() );
        dtTransaction.setPostDate( dtTransactionDTO.getPostDate() );
        dtTransaction.setNarration( dtTransactionDTO.getNarration() );
        dtTransaction.setModifiedBy( dtTransactionDTO.getModifiedBy() );
        dtTransaction.setModifiedOn( dtTransactionDTO.getModifiedOn() );
        dtTransaction.setReference( dtTransactionDTO.getReference() );

        return dtTransaction;
    }

    private Long dtTransactionAccountId(DtTransaction dtTransaction) {
        if ( dtTransaction == null ) {
            return null;
        }
        MstAccount account = dtTransaction.getAccount();
        if ( account == null ) {
            return null;
        }
        Long id = account.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String dtTransactionVoucherName(DtTransaction dtTransaction) {
        if ( dtTransaction == null ) {
            return null;
        }
        Voucher voucher = dtTransaction.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        String name = voucher.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String dtTransactionAccountName(DtTransaction dtTransaction) {
        if ( dtTransaction == null ) {
            return null;
        }
        MstAccount account = dtTransaction.getAccount();
        if ( account == null ) {
            return null;
        }
        String name = account.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String dtTransactionCurrencyNotation(DtTransaction dtTransaction) {
        if ( dtTransaction == null ) {
            return null;
        }
        Currency currency = dtTransaction.getCurrency();
        if ( currency == null ) {
            return null;
        }
        String notation = currency.getNotation();
        if ( notation == null ) {
            return null;
        }
        return notation;
    }

    private Long dtTransactionVoucherId(DtTransaction dtTransaction) {
        if ( dtTransaction == null ) {
            return null;
        }
        Voucher voucher = dtTransaction.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        Long id = voucher.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long dtTransactionCurrencyId(DtTransaction dtTransaction) {
        if ( dtTransaction == null ) {
            return null;
        }
        Currency currency = dtTransaction.getCurrency();
        if ( currency == null ) {
            return null;
        }
        Long id = currency.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
