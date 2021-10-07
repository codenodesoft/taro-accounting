package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.FinancialAccountYear;
import org.soptorshi.domain.Voucher;
import org.soptorshi.domain.VoucherNumberControl;
import org.soptorshi.service.dto.VoucherNumberControlDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class VoucherNumberControlMapperImpl implements VoucherNumberControlMapper {

    @Autowired
    private FinancialAccountYearMapper financialAccountYearMapper;
    @Autowired
    private VoucherMapper voucherMapper;

    @Override
    public List<VoucherNumberControl> toEntity(List<VoucherNumberControlDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VoucherNumberControl> list = new ArrayList<VoucherNumberControl>( dtoList.size() );
        for ( VoucherNumberControlDTO voucherNumberControlDTO : dtoList ) {
            list.add( toEntity( voucherNumberControlDTO ) );
        }

        return list;
    }

    @Override
    public List<VoucherNumberControlDTO> toDto(List<VoucherNumberControl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VoucherNumberControlDTO> list = new ArrayList<VoucherNumberControlDTO>( entityList.size() );
        for ( VoucherNumberControl voucherNumberControl : entityList ) {
            list.add( toDto( voucherNumberControl ) );
        }

        return list;
    }

    @Override
    public VoucherNumberControlDTO toDto(VoucherNumberControl voucherNumberControl) {
        if ( voucherNumberControl == null ) {
            return null;
        }

        VoucherNumberControlDTO voucherNumberControlDTO = new VoucherNumberControlDTO();

        Long id = voucherNumberControlFinancialAccountYearId( voucherNumberControl );
        if ( id != null ) {
            voucherNumberControlDTO.setFinancialAccountYearId( id );
        }
        String durationStr = voucherNumberControlFinancialAccountYearDurationStr( voucherNumberControl );
        if ( durationStr != null ) {
            voucherNumberControlDTO.setFinancialAccountYearDurationStr( durationStr );
        }
        String name = voucherNumberControlVoucherName( voucherNumberControl );
        if ( name != null ) {
            voucherNumberControlDTO.setVoucherName( name );
        }
        Long id1 = voucherNumberControlVoucherId( voucherNumberControl );
        if ( id1 != null ) {
            voucherNumberControlDTO.setVoucherId( id1 );
        }
        voucherNumberControlDTO.setId( voucherNumberControl.getId() );
        voucherNumberControlDTO.setResetBasis( voucherNumberControl.getResetBasis() );
        voucherNumberControlDTO.setStartVoucherNo( voucherNumberControl.getStartVoucherNo() );
        voucherNumberControlDTO.setVoucherLimit( voucherNumberControl.getVoucherLimit() );
        voucherNumberControlDTO.setModifiedOn( voucherNumberControl.getModifiedOn() );
        voucherNumberControlDTO.setModifiedBy( voucherNumberControl.getModifiedBy() );

        return voucherNumberControlDTO;
    }

    @Override
    public VoucherNumberControl toEntity(VoucherNumberControlDTO voucherNumberControlDTO) {
        if ( voucherNumberControlDTO == null ) {
            return null;
        }

        VoucherNumberControl voucherNumberControl = new VoucherNumberControl();

        voucherNumberControl.setFinancialAccountYear( financialAccountYearMapper.fromId( voucherNumberControlDTO.getFinancialAccountYearId() ) );
        voucherNumberControl.setVoucher( voucherMapper.fromId( voucherNumberControlDTO.getVoucherId() ) );
        voucherNumberControl.setId( voucherNumberControlDTO.getId() );
        voucherNumberControl.setResetBasis( voucherNumberControlDTO.getResetBasis() );
        voucherNumberControl.setStartVoucherNo( voucherNumberControlDTO.getStartVoucherNo() );
        voucherNumberControl.setVoucherLimit( voucherNumberControlDTO.getVoucherLimit() );
        voucherNumberControl.setModifiedOn( voucherNumberControlDTO.getModifiedOn() );
        voucherNumberControl.setModifiedBy( voucherNumberControlDTO.getModifiedBy() );

        return voucherNumberControl;
    }

    private Long voucherNumberControlFinancialAccountYearId(VoucherNumberControl voucherNumberControl) {
        if ( voucherNumberControl == null ) {
            return null;
        }
        FinancialAccountYear financialAccountYear = voucherNumberControl.getFinancialAccountYear();
        if ( financialAccountYear == null ) {
            return null;
        }
        Long id = financialAccountYear.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String voucherNumberControlFinancialAccountYearDurationStr(VoucherNumberControl voucherNumberControl) {
        if ( voucherNumberControl == null ) {
            return null;
        }
        FinancialAccountYear financialAccountYear = voucherNumberControl.getFinancialAccountYear();
        if ( financialAccountYear == null ) {
            return null;
        }
        String durationStr = financialAccountYear.getDurationStr();
        if ( durationStr == null ) {
            return null;
        }
        return durationStr;
    }

    private String voucherNumberControlVoucherName(VoucherNumberControl voucherNumberControl) {
        if ( voucherNumberControl == null ) {
            return null;
        }
        Voucher voucher = voucherNumberControl.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        String name = voucher.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long voucherNumberControlVoucherId(VoucherNumberControl voucherNumberControl) {
        if ( voucherNumberControl == null ) {
            return null;
        }
        Voucher voucher = voucherNumberControl.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        Long id = voucher.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
