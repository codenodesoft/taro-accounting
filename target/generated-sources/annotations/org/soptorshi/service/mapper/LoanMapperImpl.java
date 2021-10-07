package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.Loan;
import org.soptorshi.service.dto.LoanDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class LoanMapperImpl implements LoanMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Loan> toEntity(List<LoanDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Loan> list = new ArrayList<Loan>( dtoList.size() );
        for ( LoanDTO loanDTO : dtoList ) {
            list.add( toEntity( loanDTO ) );
        }

        return list;
    }

    @Override
    public List<LoanDTO> toDto(List<Loan> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LoanDTO> list = new ArrayList<LoanDTO>( entityList.size() );
        for ( Loan loan : entityList ) {
            list.add( toDto( loan ) );
        }

        return list;
    }

    @Override
    public LoanDTO toDto(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        LoanDTO loanDTO = new LoanDTO();

        String fullName = loanEmployeeFullName( loan );
        if ( fullName != null ) {
            loanDTO.setEmployeeFullName( fullName );
        }
        Long id = loanEmployeeId( loan );
        if ( id != null ) {
            loanDTO.setEmployeeId( id );
        }
        loanDTO.setId( loan.getId() );
        loanDTO.setAmount( loan.getAmount() );
        loanDTO.setTakenOn( loan.getTakenOn() );
        loanDTO.setMonthlyPayable( loan.getMonthlyPayable() );
        loanDTO.setPaymentStatus( loan.getPaymentStatus() );
        loanDTO.setLeft( loan.getLeft() );
        loanDTO.setModifiedBy( loan.getModifiedBy() );
        loanDTO.setModifiedDate( loan.getModifiedDate() );

        return loanDTO;
    }

    @Override
    public Loan toEntity(LoanDTO loanDTO) {
        if ( loanDTO == null ) {
            return null;
        }

        Loan loan = new Loan();

        loan.setEmployee( employeeMapper.fromId( loanDTO.getEmployeeId() ) );
        loan.setId( loanDTO.getId() );
        loan.setAmount( loanDTO.getAmount() );
        loan.setTakenOn( loanDTO.getTakenOn() );
        loan.setMonthlyPayable( loanDTO.getMonthlyPayable() );
        loan.setPaymentStatus( loanDTO.getPaymentStatus() );
        loan.setLeft( loanDTO.getLeft() );
        loan.setModifiedBy( loanDTO.getModifiedBy() );
        loan.setModifiedDate( loanDTO.getModifiedDate() );

        return loan;
    }

    private String loanEmployeeFullName(Loan loan) {
        if ( loan == null ) {
            return null;
        }
        Employee employee = loan.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long loanEmployeeId(Loan loan) {
        if ( loan == null ) {
            return null;
        }
        Employee employee = loan.getEmployee();
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
