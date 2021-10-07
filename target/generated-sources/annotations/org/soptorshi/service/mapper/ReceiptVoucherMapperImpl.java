package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.MstAccount;
import org.soptorshi.domain.ReceiptVoucher;
import org.soptorshi.service.dto.ReceiptVoucherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ReceiptVoucherMapperImpl implements ReceiptVoucherMapper {

    @Autowired
    private MstAccountMapper mstAccountMapper;

    @Override
    public List<ReceiptVoucher> toEntity(List<ReceiptVoucherDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ReceiptVoucher> list = new ArrayList<ReceiptVoucher>( dtoList.size() );
        for ( ReceiptVoucherDTO receiptVoucherDTO : dtoList ) {
            list.add( toEntity( receiptVoucherDTO ) );
        }

        return list;
    }

    @Override
    public List<ReceiptVoucherDTO> toDto(List<ReceiptVoucher> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReceiptVoucherDTO> list = new ArrayList<ReceiptVoucherDTO>( entityList.size() );
        for ( ReceiptVoucher receiptVoucher : entityList ) {
            list.add( toDto( receiptVoucher ) );
        }

        return list;
    }

    @Override
    public ReceiptVoucherDTO toDto(ReceiptVoucher receiptVoucher) {
        if ( receiptVoucher == null ) {
            return null;
        }

        ReceiptVoucherDTO receiptVoucherDTO = new ReceiptVoucherDTO();

        Long id = receiptVoucherAccountId( receiptVoucher );
        if ( id != null ) {
            receiptVoucherDTO.setAccountId( id );
        }
        String name = receiptVoucherAccountName( receiptVoucher );
        if ( name != null ) {
            receiptVoucherDTO.setAccountName( name );
        }
        receiptVoucherDTO.setId( receiptVoucher.getId() );
        receiptVoucherDTO.setVoucherNo( receiptVoucher.getVoucherNo() );
        receiptVoucherDTO.setVoucherDate( receiptVoucher.getVoucherDate() );
        receiptVoucherDTO.setPostDate( receiptVoucher.getPostDate() );
        receiptVoucherDTO.setApplicationType( receiptVoucher.getApplicationType() );
        receiptVoucherDTO.setApplicationId( receiptVoucher.getApplicationId() );
        receiptVoucherDTO.setModifiedBy( receiptVoucher.getModifiedBy() );
        receiptVoucherDTO.setModifiedOn( receiptVoucher.getModifiedOn() );

        return receiptVoucherDTO;
    }

    @Override
    public ReceiptVoucher toEntity(ReceiptVoucherDTO receiptVoucherDTO) {
        if ( receiptVoucherDTO == null ) {
            return null;
        }

        ReceiptVoucher receiptVoucher = new ReceiptVoucher();

        receiptVoucher.setAccount( mstAccountMapper.fromId( receiptVoucherDTO.getAccountId() ) );
        receiptVoucher.setId( receiptVoucherDTO.getId() );
        receiptVoucher.setVoucherNo( receiptVoucherDTO.getVoucherNo() );
        receiptVoucher.setVoucherDate( receiptVoucherDTO.getVoucherDate() );
        receiptVoucher.setPostDate( receiptVoucherDTO.getPostDate() );
        receiptVoucher.setApplicationType( receiptVoucherDTO.getApplicationType() );
        receiptVoucher.setApplicationId( receiptVoucherDTO.getApplicationId() );
        receiptVoucher.setModifiedBy( receiptVoucherDTO.getModifiedBy() );
        receiptVoucher.setModifiedOn( receiptVoucherDTO.getModifiedOn() );

        return receiptVoucher;
    }

    private Long receiptVoucherAccountId(ReceiptVoucher receiptVoucher) {
        if ( receiptVoucher == null ) {
            return null;
        }
        MstAccount account = receiptVoucher.getAccount();
        if ( account == null ) {
            return null;
        }
        Long id = account.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String receiptVoucherAccountName(ReceiptVoucher receiptVoucher) {
        if ( receiptVoucher == null ) {
            return null;
        }
        MstAccount account = receiptVoucher.getAccount();
        if ( account == null ) {
            return null;
        }
        String name = account.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
