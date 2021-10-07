package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Advance;
import org.soptorshi.domain.Employee;
import org.soptorshi.service.dto.AdvanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class AdvanceMapperImpl implements AdvanceMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Advance> toEntity(List<AdvanceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Advance> list = new ArrayList<Advance>( dtoList.size() );
        for ( AdvanceDTO advanceDTO : dtoList ) {
            list.add( toEntity( advanceDTO ) );
        }

        return list;
    }

    @Override
    public List<AdvanceDTO> toDto(List<Advance> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AdvanceDTO> list = new ArrayList<AdvanceDTO>( entityList.size() );
        for ( Advance advance : entityList ) {
            list.add( toDto( advance ) );
        }

        return list;
    }

    @Override
    public AdvanceDTO toDto(Advance advance) {
        if ( advance == null ) {
            return null;
        }

        AdvanceDTO advanceDTO = new AdvanceDTO();

        String fullName = advanceEmployeeFullName( advance );
        if ( fullName != null ) {
            advanceDTO.setEmployeeFullName( fullName );
        }
        Long id = advanceEmployeeId( advance );
        if ( id != null ) {
            advanceDTO.setEmployeeId( id );
        }
        advanceDTO.setId( advance.getId() );
        advanceDTO.setAmount( advance.getAmount() );
        advanceDTO.setReason( advance.getReason() );
        advanceDTO.setProvidedOn( advance.getProvidedOn() );
        advanceDTO.setMonthlyPayable( advance.getMonthlyPayable() );
        advanceDTO.setPaymentStatus( advance.getPaymentStatus() );
        advanceDTO.setLeft( advance.getLeft() );
        advanceDTO.setModifiedBy( advance.getModifiedBy() );
        advanceDTO.setModifiedOn( advance.getModifiedOn() );

        return advanceDTO;
    }

    @Override
    public Advance toEntity(AdvanceDTO advanceDTO) {
        if ( advanceDTO == null ) {
            return null;
        }

        Advance advance = new Advance();

        advance.setEmployee( employeeMapper.fromId( advanceDTO.getEmployeeId() ) );
        advance.setId( advanceDTO.getId() );
        advance.setAmount( advanceDTO.getAmount() );
        advance.setReason( advanceDTO.getReason() );
        advance.setProvidedOn( advanceDTO.getProvidedOn() );
        advance.setMonthlyPayable( advanceDTO.getMonthlyPayable() );
        advance.setPaymentStatus( advanceDTO.getPaymentStatus() );
        advance.setLeft( advanceDTO.getLeft() );
        advance.setModifiedBy( advanceDTO.getModifiedBy() );
        advance.setModifiedOn( advanceDTO.getModifiedOn() );

        return advance;
    }

    private String advanceEmployeeFullName(Advance advance) {
        if ( advance == null ) {
            return null;
        }
        Employee employee = advance.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long advanceEmployeeId(Advance advance) {
        if ( advance == null ) {
            return null;
        }
        Employee employee = advance.getEmployee();
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
