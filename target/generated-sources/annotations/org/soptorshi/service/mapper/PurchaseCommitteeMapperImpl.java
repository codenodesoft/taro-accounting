package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.PurchaseCommittee;
import org.soptorshi.service.dto.PurchaseCommitteeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class PurchaseCommitteeMapperImpl implements PurchaseCommitteeMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<PurchaseCommittee> toEntity(List<PurchaseCommitteeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PurchaseCommittee> list = new ArrayList<PurchaseCommittee>( dtoList.size() );
        for ( PurchaseCommitteeDTO purchaseCommitteeDTO : dtoList ) {
            list.add( toEntity( purchaseCommitteeDTO ) );
        }

        return list;
    }

    @Override
    public List<PurchaseCommitteeDTO> toDto(List<PurchaseCommittee> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PurchaseCommitteeDTO> list = new ArrayList<PurchaseCommitteeDTO>( entityList.size() );
        for ( PurchaseCommittee purchaseCommittee : entityList ) {
            list.add( toDto( purchaseCommittee ) );
        }

        return list;
    }

    @Override
    public PurchaseCommitteeDTO toDto(PurchaseCommittee purchaseCommittee) {
        if ( purchaseCommittee == null ) {
            return null;
        }

        PurchaseCommitteeDTO purchaseCommitteeDTO = new PurchaseCommitteeDTO();

        String fullName = purchaseCommitteeEmployeeFullName( purchaseCommittee );
        if ( fullName != null ) {
            purchaseCommitteeDTO.setEmployeeFullName( fullName );
        }
        Long id = purchaseCommitteeEmployeeId( purchaseCommittee );
        if ( id != null ) {
            purchaseCommitteeDTO.setEmployeeId( id );
        }
        purchaseCommitteeDTO.setId( purchaseCommittee.getId() );

        return purchaseCommitteeDTO;
    }

    @Override
    public PurchaseCommittee toEntity(PurchaseCommitteeDTO purchaseCommitteeDTO) {
        if ( purchaseCommitteeDTO == null ) {
            return null;
        }

        PurchaseCommittee purchaseCommittee = new PurchaseCommittee();

        purchaseCommittee.setEmployee( employeeMapper.fromId( purchaseCommitteeDTO.getEmployeeId() ) );
        purchaseCommittee.setId( purchaseCommitteeDTO.getId() );

        return purchaseCommittee;
    }

    private String purchaseCommitteeEmployeeFullName(PurchaseCommittee purchaseCommittee) {
        if ( purchaseCommittee == null ) {
            return null;
        }
        Employee employee = purchaseCommittee.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long purchaseCommitteeEmployeeId(PurchaseCommittee purchaseCommittee) {
        if ( purchaseCommittee == null ) {
            return null;
        }
        Employee employee = purchaseCommittee.getEmployee();
        if ( employee == null ) {
            return null;
        }
        Long id = employee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
