package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.Salary;
import org.soptorshi.service.dto.SalaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SalaryMapperImpl implements SalaryMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Salary> toEntity(List<SalaryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Salary> list = new ArrayList<Salary>( dtoList.size() );
        for ( SalaryDTO salaryDTO : dtoList ) {
            list.add( toEntity( salaryDTO ) );
        }

        return list;
    }

    @Override
    public List<SalaryDTO> toDto(List<Salary> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalaryDTO> list = new ArrayList<SalaryDTO>( entityList.size() );
        for ( Salary salary : entityList ) {
            list.add( toDto( salary ) );
        }

        return list;
    }

    @Override
    public SalaryDTO toDto(Salary salary) {
        if ( salary == null ) {
            return null;
        }

        SalaryDTO salaryDTO = new SalaryDTO();

        String fullName = salaryEmployeeFullName( salary );
        if ( fullName != null ) {
            salaryDTO.setEmployeeFullName( fullName );
        }
        Long id = salaryEmployeeId( salary );
        if ( id != null ) {
            salaryDTO.setEmployeeId( id );
        }
        salaryDTO.setId( salary.getId() );
        salaryDTO.setBasic( salary.getBasic() );
        salaryDTO.setGross( salary.getGross() );
        salaryDTO.setStartedOn( salary.getStartedOn() );
        salaryDTO.setEndedOn( salary.getEndedOn() );
        salaryDTO.setSalaryStatus( salary.getSalaryStatus() );
        salaryDTO.setModifiedBy( salary.getModifiedBy() );
        salaryDTO.setModifiedOn( salary.getModifiedOn() );

        return salaryDTO;
    }

    @Override
    public Salary toEntity(SalaryDTO salaryDTO) {
        if ( salaryDTO == null ) {
            return null;
        }

        Salary salary = new Salary();

        salary.setEmployee( employeeMapper.fromId( salaryDTO.getEmployeeId() ) );
        salary.setId( salaryDTO.getId() );
        salary.setBasic( salaryDTO.getBasic() );
        salary.setGross( salaryDTO.getGross() );
        salary.setStartedOn( salaryDTO.getStartedOn() );
        salary.setEndedOn( salaryDTO.getEndedOn() );
        salary.setSalaryStatus( salaryDTO.getSalaryStatus() );
        salary.setModifiedBy( salaryDTO.getModifiedBy() );
        salary.setModifiedOn( salaryDTO.getModifiedOn() );

        return salary;
    }

    private String salaryEmployeeFullName(Salary salary) {
        if ( salary == null ) {
            return null;
        }
        Employee employee = salary.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long salaryEmployeeId(Salary salary) {
        if ( salary == null ) {
            return null;
        }
        Employee employee = salary.getEmployee();
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
