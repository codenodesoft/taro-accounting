package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Vendor;
import org.soptorshi.domain.VendorContactPerson;
import org.soptorshi.service.dto.VendorContactPersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:23+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class VendorContactPersonMapperImpl implements VendorContactPersonMapper {

    @Autowired
    private VendorMapper vendorMapper;

    @Override
    public List<VendorContactPerson> toEntity(List<VendorContactPersonDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VendorContactPerson> list = new ArrayList<VendorContactPerson>( dtoList.size() );
        for ( VendorContactPersonDTO vendorContactPersonDTO : dtoList ) {
            list.add( toEntity( vendorContactPersonDTO ) );
        }

        return list;
    }

    @Override
    public List<VendorContactPersonDTO> toDto(List<VendorContactPerson> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VendorContactPersonDTO> list = new ArrayList<VendorContactPersonDTO>( entityList.size() );
        for ( VendorContactPerson vendorContactPerson : entityList ) {
            list.add( toDto( vendorContactPerson ) );
        }

        return list;
    }

    @Override
    public VendorContactPersonDTO toDto(VendorContactPerson vendorContactPerson) {
        if ( vendorContactPerson == null ) {
            return null;
        }

        VendorContactPersonDTO vendorContactPersonDTO = new VendorContactPersonDTO();

        String companyName = vendorContactPersonVendorCompanyName( vendorContactPerson );
        if ( companyName != null ) {
            vendorContactPersonDTO.setVendorCompanyName( companyName );
        }
        Long id = vendorContactPersonVendorId( vendorContactPerson );
        if ( id != null ) {
            vendorContactPersonDTO.setVendorId( id );
        }
        vendorContactPersonDTO.setId( vendorContactPerson.getId() );
        vendorContactPersonDTO.setName( vendorContactPerson.getName() );
        vendorContactPersonDTO.setDesignation( vendorContactPerson.getDesignation() );
        vendorContactPersonDTO.setContactNumber( vendorContactPerson.getContactNumber() );

        return vendorContactPersonDTO;
    }

    @Override
    public VendorContactPerson toEntity(VendorContactPersonDTO vendorContactPersonDTO) {
        if ( vendorContactPersonDTO == null ) {
            return null;
        }

        VendorContactPerson vendorContactPerson = new VendorContactPerson();

        vendorContactPerson.setVendor( vendorMapper.fromId( vendorContactPersonDTO.getVendorId() ) );
        vendorContactPerson.setId( vendorContactPersonDTO.getId() );
        vendorContactPerson.setName( vendorContactPersonDTO.getName() );
        vendorContactPerson.setDesignation( vendorContactPersonDTO.getDesignation() );
        vendorContactPerson.setContactNumber( vendorContactPersonDTO.getContactNumber() );

        return vendorContactPerson;
    }

    private String vendorContactPersonVendorCompanyName(VendorContactPerson vendorContactPerson) {
        if ( vendorContactPerson == null ) {
            return null;
        }
        Vendor vendor = vendorContactPerson.getVendor();
        if ( vendor == null ) {
            return null;
        }
        String companyName = vendor.getCompanyName();
        if ( companyName == null ) {
            return null;
        }
        return companyName;
    }

    private Long vendorContactPersonVendorId(VendorContactPerson vendorContactPerson) {
        if ( vendorContactPerson == null ) {
            return null;
        }
        Vendor vendor = vendorContactPerson.getVendor();
        if ( vendor == null ) {
            return null;
        }
        Long id = vendor.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
