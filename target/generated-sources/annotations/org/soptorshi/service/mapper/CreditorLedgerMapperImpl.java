package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.CreditorLedger;
import org.soptorshi.domain.Vendor;
import org.soptorshi.service.dto.CreditorLedgerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class CreditorLedgerMapperImpl implements CreditorLedgerMapper {

    @Autowired
    private VendorMapper vendorMapper;

    @Override
    public List<CreditorLedger> toEntity(List<CreditorLedgerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CreditorLedger> list = new ArrayList<CreditorLedger>( dtoList.size() );
        for ( CreditorLedgerDTO creditorLedgerDTO : dtoList ) {
            list.add( toEntity( creditorLedgerDTO ) );
        }

        return list;
    }

    @Override
    public List<CreditorLedgerDTO> toDto(List<CreditorLedger> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CreditorLedgerDTO> list = new ArrayList<CreditorLedgerDTO>( entityList.size() );
        for ( CreditorLedger creditorLedger : entityList ) {
            list.add( toDto( creditorLedger ) );
        }

        return list;
    }

    @Override
    public CreditorLedgerDTO toDto(CreditorLedger creditorLedger) {
        if ( creditorLedger == null ) {
            return null;
        }

        CreditorLedgerDTO creditorLedgerDTO = new CreditorLedgerDTO();

        String companyName = creditorLedgerVendorCompanyName( creditorLedger );
        if ( companyName != null ) {
            creditorLedgerDTO.setVendorCompanyName( companyName );
        }
        Long id = creditorLedgerVendorId( creditorLedger );
        if ( id != null ) {
            creditorLedgerDTO.setVendorId( id );
        }
        creditorLedgerDTO.setId( creditorLedger.getId() );
        creditorLedgerDTO.setSerialNo( creditorLedger.getSerialNo() );
        creditorLedgerDTO.setBillNo( creditorLedger.getBillNo() );
        creditorLedgerDTO.setBillDate( creditorLedger.getBillDate() );
        creditorLedgerDTO.setAmount( creditorLedger.getAmount() );
        creditorLedgerDTO.setPaidAmount( creditorLedger.getPaidAmount() );
        creditorLedgerDTO.setBalanceType( creditorLedger.getBalanceType() );
        creditorLedgerDTO.setBillClosingFlag( creditorLedger.getBillClosingFlag() );
        creditorLedgerDTO.setDueDate( creditorLedger.getDueDate() );
        creditorLedgerDTO.setVatNo( creditorLedger.getVatNo() );
        creditorLedgerDTO.setContCode( creditorLedger.getContCode() );
        creditorLedgerDTO.setOrderNo( creditorLedger.getOrderNo() );
        creditorLedgerDTO.setModifiedBy( creditorLedger.getModifiedBy() );
        creditorLedgerDTO.setModifiedOn( creditorLedger.getModifiedOn() );

        return creditorLedgerDTO;
    }

    @Override
    public CreditorLedger toEntity(CreditorLedgerDTO creditorLedgerDTO) {
        if ( creditorLedgerDTO == null ) {
            return null;
        }

        CreditorLedger creditorLedger = new CreditorLedger();

        creditorLedger.setVendor( vendorMapper.fromId( creditorLedgerDTO.getVendorId() ) );
        creditorLedger.setId( creditorLedgerDTO.getId() );
        creditorLedger.setSerialNo( creditorLedgerDTO.getSerialNo() );
        creditorLedger.setBillNo( creditorLedgerDTO.getBillNo() );
        creditorLedger.setBillDate( creditorLedgerDTO.getBillDate() );
        creditorLedger.setAmount( creditorLedgerDTO.getAmount() );
        creditorLedger.setPaidAmount( creditorLedgerDTO.getPaidAmount() );
        creditorLedger.setBalanceType( creditorLedgerDTO.getBalanceType() );
        creditorLedger.setBillClosingFlag( creditorLedgerDTO.getBillClosingFlag() );
        creditorLedger.setDueDate( creditorLedgerDTO.getDueDate() );
        creditorLedger.setVatNo( creditorLedgerDTO.getVatNo() );
        creditorLedger.setContCode( creditorLedgerDTO.getContCode() );
        creditorLedger.setOrderNo( creditorLedgerDTO.getOrderNo() );
        creditorLedger.setModifiedBy( creditorLedgerDTO.getModifiedBy() );
        creditorLedger.setModifiedOn( creditorLedgerDTO.getModifiedOn() );

        return creditorLedger;
    }

    private String creditorLedgerVendorCompanyName(CreditorLedger creditorLedger) {
        if ( creditorLedger == null ) {
            return null;
        }
        Vendor vendor = creditorLedger.getVendor();
        if ( vendor == null ) {
            return null;
        }
        String companyName = vendor.getCompanyName();
        if ( companyName == null ) {
            return null;
        }
        return companyName;
    }

    private Long creditorLedgerVendorId(CreditorLedger creditorLedger) {
        if ( creditorLedger == null ) {
            return null;
        }
        Vendor vendor = creditorLedger.getVendor();
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
