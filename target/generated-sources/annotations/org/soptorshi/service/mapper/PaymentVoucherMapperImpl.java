package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.MstAccount;
import org.soptorshi.domain.PaymentVoucher;
import org.soptorshi.service.dto.PaymentVoucherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class PaymentVoucherMapperImpl implements PaymentVoucherMapper {

    @Autowired
    private MstAccountMapper mstAccountMapper;

    @Override
    public List<PaymentVoucher> toEntity(List<PaymentVoucherDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PaymentVoucher> list = new ArrayList<PaymentVoucher>( dtoList.size() );
        for ( PaymentVoucherDTO paymentVoucherDTO : dtoList ) {
            list.add( toEntity( paymentVoucherDTO ) );
        }

        return list;
    }

    @Override
    public List<PaymentVoucherDTO> toDto(List<PaymentVoucher> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PaymentVoucherDTO> list = new ArrayList<PaymentVoucherDTO>( entityList.size() );
        for ( PaymentVoucher paymentVoucher : entityList ) {
            list.add( toDto( paymentVoucher ) );
        }

        return list;
    }

    @Override
    public PaymentVoucherDTO toDto(PaymentVoucher paymentVoucher) {
        if ( paymentVoucher == null ) {
            return null;
        }

        PaymentVoucherDTO paymentVoucherDTO = new PaymentVoucherDTO();

        Long id = paymentVoucherAccountId( paymentVoucher );
        if ( id != null ) {
            paymentVoucherDTO.setAccountId( id );
        }
        String name = paymentVoucherAccountName( paymentVoucher );
        if ( name != null ) {
            paymentVoucherDTO.setAccountName( name );
        }
        paymentVoucherDTO.setId( paymentVoucher.getId() );
        paymentVoucherDTO.setVoucherNo( paymentVoucher.getVoucherNo() );
        paymentVoucherDTO.setVoucherDate( paymentVoucher.getVoucherDate() );
        paymentVoucherDTO.setPostDate( paymentVoucher.getPostDate() );
        paymentVoucherDTO.setApplicationType( paymentVoucher.getApplicationType() );
        paymentVoucherDTO.setApplicationId( paymentVoucher.getApplicationId() );
        paymentVoucherDTO.setModifiedBy( paymentVoucher.getModifiedBy() );
        paymentVoucherDTO.setModifiedOn( paymentVoucher.getModifiedOn() );

        return paymentVoucherDTO;
    }

    @Override
    public PaymentVoucher toEntity(PaymentVoucherDTO paymentVoucherDTO) {
        if ( paymentVoucherDTO == null ) {
            return null;
        }

        PaymentVoucher paymentVoucher = new PaymentVoucher();

        paymentVoucher.setAccount( mstAccountMapper.fromId( paymentVoucherDTO.getAccountId() ) );
        paymentVoucher.setId( paymentVoucherDTO.getId() );
        paymentVoucher.setVoucherNo( paymentVoucherDTO.getVoucherNo() );
        paymentVoucher.setVoucherDate( paymentVoucherDTO.getVoucherDate() );
        paymentVoucher.setPostDate( paymentVoucherDTO.getPostDate() );
        paymentVoucher.setApplicationType( paymentVoucherDTO.getApplicationType() );
        paymentVoucher.setApplicationId( paymentVoucherDTO.getApplicationId() );
        paymentVoucher.setModifiedBy( paymentVoucherDTO.getModifiedBy() );
        paymentVoucher.setModifiedOn( paymentVoucherDTO.getModifiedOn() );

        return paymentVoucher;
    }

    private Long paymentVoucherAccountId(PaymentVoucher paymentVoucher) {
        if ( paymentVoucher == null ) {
            return null;
        }
        MstAccount account = paymentVoucher.getAccount();
        if ( account == null ) {
            return null;
        }
        Long id = account.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String paymentVoucherAccountName(PaymentVoucher paymentVoucher) {
        if ( paymentVoucher == null ) {
            return null;
        }
        MstAccount account = paymentVoucher.getAccount();
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
