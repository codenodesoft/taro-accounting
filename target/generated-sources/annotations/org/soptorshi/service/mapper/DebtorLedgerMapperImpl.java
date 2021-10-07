package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Customer;
import org.soptorshi.domain.DebtorLedger;
import org.soptorshi.service.dto.DebtorLedgerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class DebtorLedgerMapperImpl implements DebtorLedgerMapper {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<DebtorLedger> toEntity(List<DebtorLedgerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DebtorLedger> list = new ArrayList<DebtorLedger>( dtoList.size() );
        for ( DebtorLedgerDTO debtorLedgerDTO : dtoList ) {
            list.add( toEntity( debtorLedgerDTO ) );
        }

        return list;
    }

    @Override
    public List<DebtorLedgerDTO> toDto(List<DebtorLedger> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DebtorLedgerDTO> list = new ArrayList<DebtorLedgerDTO>( entityList.size() );
        for ( DebtorLedger debtorLedger : entityList ) {
            list.add( toDto( debtorLedger ) );
        }

        return list;
    }

    @Override
    public DebtorLedgerDTO toDto(DebtorLedger debtorLedger) {
        if ( debtorLedger == null ) {
            return null;
        }

        DebtorLedgerDTO debtorLedgerDTO = new DebtorLedgerDTO();

        Long id = debtorLedgerCustomerId( debtorLedger );
        if ( id != null ) {
            debtorLedgerDTO.setCustomerId( id );
        }
        String name = debtorLedgerCustomerName( debtorLedger );
        if ( name != null ) {
            debtorLedgerDTO.setCustomerName( name );
        }
        debtorLedgerDTO.setId( debtorLedger.getId() );
        debtorLedgerDTO.setSerialNo( debtorLedger.getSerialNo() );
        debtorLedgerDTO.setBillNo( debtorLedger.getBillNo() );
        debtorLedgerDTO.setBillDate( debtorLedger.getBillDate() );
        debtorLedgerDTO.setAmount( debtorLedger.getAmount() );
        debtorLedgerDTO.setPaidAmount( debtorLedger.getPaidAmount() );
        debtorLedgerDTO.setBillClosingFlag( debtorLedger.getBillClosingFlag() );
        debtorLedgerDTO.setDueDate( debtorLedger.getDueDate() );
        debtorLedgerDTO.setVatNo( debtorLedger.getVatNo() );
        debtorLedgerDTO.setContCode( debtorLedger.getContCode() );
        debtorLedgerDTO.setOrderNo( debtorLedger.getOrderNo() );
        debtorLedgerDTO.setModifiedBy( debtorLedger.getModifiedBy() );
        debtorLedgerDTO.setModifiedOn( debtorLedger.getModifiedOn() );

        return debtorLedgerDTO;
    }

    @Override
    public DebtorLedger toEntity(DebtorLedgerDTO debtorLedgerDTO) {
        if ( debtorLedgerDTO == null ) {
            return null;
        }

        DebtorLedger debtorLedger = new DebtorLedger();

        debtorLedger.setCustomer( customerMapper.fromId( debtorLedgerDTO.getCustomerId() ) );
        debtorLedger.setId( debtorLedgerDTO.getId() );
        debtorLedger.setSerialNo( debtorLedgerDTO.getSerialNo() );
        debtorLedger.setBillNo( debtorLedgerDTO.getBillNo() );
        debtorLedger.setBillDate( debtorLedgerDTO.getBillDate() );
        debtorLedger.setAmount( debtorLedgerDTO.getAmount() );
        debtorLedger.setPaidAmount( debtorLedgerDTO.getPaidAmount() );
        debtorLedger.setBillClosingFlag( debtorLedgerDTO.getBillClosingFlag() );
        debtorLedger.setDueDate( debtorLedgerDTO.getDueDate() );
        debtorLedger.setVatNo( debtorLedgerDTO.getVatNo() );
        debtorLedger.setContCode( debtorLedgerDTO.getContCode() );
        debtorLedger.setOrderNo( debtorLedgerDTO.getOrderNo() );
        debtorLedger.setModifiedBy( debtorLedgerDTO.getModifiedBy() );
        debtorLedger.setModifiedOn( debtorLedgerDTO.getModifiedOn() );

        return debtorLedger;
    }

    private Long debtorLedgerCustomerId(DebtorLedger debtorLedger) {
        if ( debtorLedger == null ) {
            return null;
        }
        Customer customer = debtorLedger.getCustomer();
        if ( customer == null ) {
            return null;
        }
        Long id = customer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String debtorLedgerCustomerName(DebtorLedger debtorLedger) {
        if ( debtorLedger == null ) {
            return null;
        }
        Customer customer = debtorLedger.getCustomer();
        if ( customer == null ) {
            return null;
        }
        String name = customer.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
