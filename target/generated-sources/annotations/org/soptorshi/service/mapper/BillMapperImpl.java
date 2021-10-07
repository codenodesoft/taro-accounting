package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Bill;
import org.soptorshi.domain.Employee;
import org.soptorshi.service.dto.BillDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class BillMapperImpl implements BillMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Bill> toEntity(List<BillDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Bill> list = new ArrayList<Bill>( dtoList.size() );
        for ( BillDTO billDTO : dtoList ) {
            list.add( toEntity( billDTO ) );
        }

        return list;
    }

    @Override
    public List<BillDTO> toDto(List<Bill> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<BillDTO> list = new ArrayList<BillDTO>( entityList.size() );
        for ( Bill bill : entityList ) {
            list.add( toDto( bill ) );
        }

        return list;
    }

    @Override
    public BillDTO toDto(Bill bill) {
        if ( bill == null ) {
            return null;
        }

        BillDTO billDTO = new BillDTO();

        String fullName = billEmployeeFullName( bill );
        if ( fullName != null ) {
            billDTO.setEmployeeFullName( fullName );
        }
        Long id = billEmployeeId( bill );
        if ( id != null ) {
            billDTO.setEmployeeId( id );
        }
        billDTO.setId( bill.getId() );
        billDTO.setAmount( bill.getAmount() );
        billDTO.setBillCategory( bill.getBillCategory() );
        billDTO.setReason( bill.getReason() );
        billDTO.setModifiedBy( bill.getModifiedBy() );
        billDTO.setModifiedDate( bill.getModifiedDate() );

        return billDTO;
    }

    @Override
    public Bill toEntity(BillDTO billDTO) {
        if ( billDTO == null ) {
            return null;
        }

        Bill bill = new Bill();

        bill.setEmployee( employeeMapper.fromId( billDTO.getEmployeeId() ) );
        bill.setId( billDTO.getId() );
        bill.setAmount( billDTO.getAmount() );
        bill.setBillCategory( billDTO.getBillCategory() );
        bill.setReason( billDTO.getReason() );
        bill.setModifiedBy( billDTO.getModifiedBy() );
        bill.setModifiedDate( billDTO.getModifiedDate() );

        return bill;
    }

    private String billEmployeeFullName(Bill bill) {
        if ( bill == null ) {
            return null;
        }
        Employee employee = bill.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long billEmployeeId(Bill bill) {
        if ( bill == null ) {
            return null;
        }
        Employee employee = bill.getEmployee();
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
