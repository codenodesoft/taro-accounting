package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Vendor;
import org.soptorshi.service.dto.VendorDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class VendorMapperImpl implements VendorMapper {

    @Override
    public Vendor toEntity(VendorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Vendor vendor = new Vendor();

        vendor.setId( dto.getId() );
        vendor.setCompanyName( dto.getCompanyName() );
        vendor.setDescription( dto.getDescription() );
        vendor.setAddress( dto.getAddress() );
        vendor.setContactNumber( dto.getContactNumber() );
        vendor.setRemarks( dto.getRemarks() );

        return vendor;
    }

    @Override
    public VendorDTO toDto(Vendor entity) {
        if ( entity == null ) {
            return null;
        }

        VendorDTO vendorDTO = new VendorDTO();

        vendorDTO.setId( entity.getId() );
        vendorDTO.setCompanyName( entity.getCompanyName() );
        vendorDTO.setDescription( entity.getDescription() );
        vendorDTO.setAddress( entity.getAddress() );
        vendorDTO.setContactNumber( entity.getContactNumber() );
        vendorDTO.setRemarks( entity.getRemarks() );

        return vendorDTO;
    }

    @Override
    public List<Vendor> toEntity(List<VendorDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Vendor> list = new ArrayList<Vendor>( dtoList.size() );
        for ( VendorDTO vendorDTO : dtoList ) {
            list.add( toEntity( vendorDTO ) );
        }

        return list;
    }

    @Override
    public List<VendorDTO> toDto(List<Vendor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VendorDTO> list = new ArrayList<VendorDTO>( entityList.size() );
        for ( Vendor vendor : entityList ) {
            list.add( toDto( vendor ) );
        }

        return list;
    }
}
