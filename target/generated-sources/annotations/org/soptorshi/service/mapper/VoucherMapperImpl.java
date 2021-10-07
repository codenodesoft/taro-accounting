package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Voucher;
import org.soptorshi.service.dto.VoucherDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class VoucherMapperImpl implements VoucherMapper {

    @Override
    public Voucher toEntity(VoucherDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Voucher voucher = new Voucher();

        voucher.setId( dto.getId() );
        voucher.setName( dto.getName() );
        voucher.setShortName( dto.getShortName() );
        voucher.setModifiedOn( dto.getModifiedOn() );
        voucher.setModifiedBy( dto.getModifiedBy() );

        return voucher;
    }

    @Override
    public VoucherDTO toDto(Voucher entity) {
        if ( entity == null ) {
            return null;
        }

        VoucherDTO voucherDTO = new VoucherDTO();

        voucherDTO.setId( entity.getId() );
        voucherDTO.setName( entity.getName() );
        voucherDTO.setShortName( entity.getShortName() );
        voucherDTO.setModifiedOn( entity.getModifiedOn() );
        voucherDTO.setModifiedBy( entity.getModifiedBy() );

        return voucherDTO;
    }

    @Override
    public List<Voucher> toEntity(List<VoucherDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Voucher> list = new ArrayList<Voucher>( dtoList.size() );
        for ( VoucherDTO voucherDTO : dtoList ) {
            list.add( toEntity( voucherDTO ) );
        }

        return list;
    }

    @Override
    public List<VoucherDTO> toDto(List<Voucher> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VoucherDTO> list = new ArrayList<VoucherDTO>( entityList.size() );
        for ( Voucher voucher : entityList ) {
            list.add( toDto( voucher ) );
        }

        return list;
    }
}
