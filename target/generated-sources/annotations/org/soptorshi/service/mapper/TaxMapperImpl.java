package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.FinancialAccountYear;
import org.soptorshi.domain.Tax;
import org.soptorshi.service.dto.TaxDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class TaxMapperImpl implements TaxMapper {

    @Autowired
    private FinancialAccountYearMapper financialAccountYearMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Tax> toEntity(List<TaxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Tax> list = new ArrayList<Tax>( dtoList.size() );
        for ( TaxDTO taxDTO : dtoList ) {
            list.add( toEntity( taxDTO ) );
        }

        return list;
    }

    @Override
    public List<TaxDTO> toDto(List<Tax> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TaxDTO> list = new ArrayList<TaxDTO>( entityList.size() );
        for ( Tax tax : entityList ) {
            list.add( toDto( tax ) );
        }

        return list;
    }

    @Override
    public TaxDTO toDto(Tax tax) {
        if ( tax == null ) {
            return null;
        }

        TaxDTO taxDTO = new TaxDTO();

        Long id = taxFinancialAccountYearId( tax );
        if ( id != null ) {
            taxDTO.setFinancialAccountYearId( id );
        }
        Long id1 = taxEmployeeId( tax );
        if ( id1 != null ) {
            taxDTO.setEmployeeId( id1 );
        }
        String fullName = taxEmployeeFullName( tax );
        if ( fullName != null ) {
            taxDTO.setEmployeeFullName( fullName );
        }
        taxDTO.setId( tax.getId() );
        taxDTO.setAmount( tax.getAmount() );
        taxDTO.setTaxStatus( tax.getTaxStatus() );
        taxDTO.setModifiedBy( tax.getModifiedBy() );
        taxDTO.setModifiedOn( tax.getModifiedOn() );

        return taxDTO;
    }

    @Override
    public Tax toEntity(TaxDTO taxDTO) {
        if ( taxDTO == null ) {
            return null;
        }

        Tax tax = new Tax();

        tax.setEmployee( employeeMapper.fromId( taxDTO.getEmployeeId() ) );
        tax.setFinancialAccountYear( financialAccountYearMapper.fromId( taxDTO.getFinancialAccountYearId() ) );
        tax.setId( taxDTO.getId() );
        tax.setAmount( taxDTO.getAmount() );
        tax.setTaxStatus( taxDTO.getTaxStatus() );
        tax.setModifiedBy( taxDTO.getModifiedBy() );
        tax.setModifiedOn( taxDTO.getModifiedOn() );

        return tax;
    }

    private Long taxFinancialAccountYearId(Tax tax) {
        if ( tax == null ) {
            return null;
        }
        FinancialAccountYear financialAccountYear = tax.getFinancialAccountYear();
        if ( financialAccountYear == null ) {
            return null;
        }
        Long id = financialAccountYear.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long taxEmployeeId(Tax tax) {
        if ( tax == null ) {
            return null;
        }
        Employee employee = tax.getEmployee();
        if ( employee == null ) {
            return null;
        }
        Long id = employee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String taxEmployeeFullName(Tax tax) {
        if ( tax == null ) {
            return null;
        }
        Employee employee = tax.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }
}
