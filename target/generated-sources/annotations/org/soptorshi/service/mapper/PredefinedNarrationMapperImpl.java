package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.PredefinedNarration;
import org.soptorshi.domain.Voucher;
import org.soptorshi.service.dto.PredefinedNarrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class PredefinedNarrationMapperImpl implements PredefinedNarrationMapper {

    @Autowired
    private VoucherMapper voucherMapper;

    @Override
    public List<PredefinedNarration> toEntity(List<PredefinedNarrationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PredefinedNarration> list = new ArrayList<PredefinedNarration>( dtoList.size() );
        for ( PredefinedNarrationDTO predefinedNarrationDTO : dtoList ) {
            list.add( toEntity( predefinedNarrationDTO ) );
        }

        return list;
    }

    @Override
    public List<PredefinedNarrationDTO> toDto(List<PredefinedNarration> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PredefinedNarrationDTO> list = new ArrayList<PredefinedNarrationDTO>( entityList.size() );
        for ( PredefinedNarration predefinedNarration : entityList ) {
            list.add( toDto( predefinedNarration ) );
        }

        return list;
    }

    @Override
    public PredefinedNarrationDTO toDto(PredefinedNarration predefinedNarration) {
        if ( predefinedNarration == null ) {
            return null;
        }

        PredefinedNarrationDTO predefinedNarrationDTO = new PredefinedNarrationDTO();

        Long id = predefinedNarrationVoucherId( predefinedNarration );
        if ( id != null ) {
            predefinedNarrationDTO.setVoucherId( id );
        }
        String name = predefinedNarrationVoucherName( predefinedNarration );
        if ( name != null ) {
            predefinedNarrationDTO.setVoucherName( name );
        }
        predefinedNarrationDTO.setId( predefinedNarration.getId() );
        predefinedNarrationDTO.setNarration( predefinedNarration.getNarration() );
        predefinedNarrationDTO.setModifiedBy( predefinedNarration.getModifiedBy() );
        predefinedNarrationDTO.setModifiedOn( predefinedNarration.getModifiedOn() );

        return predefinedNarrationDTO;
    }

    @Override
    public PredefinedNarration toEntity(PredefinedNarrationDTO predefinedNarrationDTO) {
        if ( predefinedNarrationDTO == null ) {
            return null;
        }

        PredefinedNarration predefinedNarration = new PredefinedNarration();

        predefinedNarration.setVoucher( voucherMapper.fromId( predefinedNarrationDTO.getVoucherId() ) );
        predefinedNarration.setId( predefinedNarrationDTO.getId() );
        predefinedNarration.setNarration( predefinedNarrationDTO.getNarration() );
        predefinedNarration.setModifiedBy( predefinedNarrationDTO.getModifiedBy() );
        predefinedNarration.setModifiedOn( predefinedNarrationDTO.getModifiedOn() );

        return predefinedNarration;
    }

    private Long predefinedNarrationVoucherId(PredefinedNarration predefinedNarration) {
        if ( predefinedNarration == null ) {
            return null;
        }
        Voucher voucher = predefinedNarration.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        Long id = voucher.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String predefinedNarrationVoucherName(PredefinedNarration predefinedNarration) {
        if ( predefinedNarration == null ) {
            return null;
        }
        Voucher voucher = predefinedNarration.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        String name = voucher.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
