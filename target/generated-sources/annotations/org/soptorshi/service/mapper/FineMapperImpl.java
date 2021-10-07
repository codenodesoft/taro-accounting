package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.Fine;
import org.soptorshi.service.dto.FineDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class FineMapperImpl implements FineMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Fine> toEntity(List<FineDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Fine> list = new ArrayList<Fine>( dtoList.size() );
        for ( FineDTO fineDTO : dtoList ) {
            list.add( toEntity( fineDTO ) );
        }

        return list;
    }

    @Override
    public List<FineDTO> toDto(List<Fine> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<FineDTO> list = new ArrayList<FineDTO>( entityList.size() );
        for ( Fine fine : entityList ) {
            list.add( toDto( fine ) );
        }

        return list;
    }

    @Override
    public FineDTO toDto(Fine fine) {
        if ( fine == null ) {
            return null;
        }

        FineDTO fineDTO = new FineDTO();

        String fullName = fineEmployeeFullName( fine );
        if ( fullName != null ) {
            fineDTO.setEmployeeFullName( fullName );
        }
        Long id = fineEmployeeId( fine );
        if ( id != null ) {
            fineDTO.setEmployeeId( id );
        }
        fineDTO.setId( fine.getId() );
        fineDTO.setAmount( fine.getAmount() );
        fineDTO.setFineDate( fine.getFineDate() );
        fineDTO.setMonthlyPayable( fine.getMonthlyPayable() );
        fineDTO.setPaymentStatus( fine.getPaymentStatus() );
        fineDTO.setLeft( fine.getLeft() );
        fineDTO.setModifiedBy( fine.getModifiedBy() );
        fineDTO.setModifiedDate( fine.getModifiedDate() );
        fineDTO.setReason( fine.getReason() );

        return fineDTO;
    }

    @Override
    public Fine toEntity(FineDTO fineDTO) {
        if ( fineDTO == null ) {
            return null;
        }

        Fine fine = new Fine();

        fine.setEmployee( employeeMapper.fromId( fineDTO.getEmployeeId() ) );
        fine.setId( fineDTO.getId() );
        fine.setAmount( fineDTO.getAmount() );
        fine.setFineDate( fineDTO.getFineDate() );
        fine.setMonthlyPayable( fineDTO.getMonthlyPayable() );
        fine.setPaymentStatus( fineDTO.getPaymentStatus() );
        fine.setLeft( fineDTO.getLeft() );
        fine.setModifiedBy( fineDTO.getModifiedBy() );
        fine.setModifiedDate( fineDTO.getModifiedDate() );
        fine.setReason( fineDTO.getReason() );

        return fine;
    }

    private String fineEmployeeFullName(Fine fine) {
        if ( fine == null ) {
            return null;
        }
        Employee employee = fine.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long fineEmployeeId(Fine fine) {
        if ( fine == null ) {
            return null;
        }
        Employee employee = fine.getEmployee();
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
