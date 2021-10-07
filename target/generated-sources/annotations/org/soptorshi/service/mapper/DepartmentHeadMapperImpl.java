package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Department;
import org.soptorshi.domain.DepartmentHead;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.Office;
import org.soptorshi.service.dto.DepartmentHeadDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class DepartmentHeadMapperImpl implements DepartmentHeadMapper {

    @Autowired
    private OfficeMapper officeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<DepartmentHead> toEntity(List<DepartmentHeadDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DepartmentHead> list = new ArrayList<DepartmentHead>( dtoList.size() );
        for ( DepartmentHeadDTO departmentHeadDTO : dtoList ) {
            list.add( toEntity( departmentHeadDTO ) );
        }

        return list;
    }

    @Override
    public List<DepartmentHeadDTO> toDto(List<DepartmentHead> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DepartmentHeadDTO> list = new ArrayList<DepartmentHeadDTO>( entityList.size() );
        for ( DepartmentHead departmentHead : entityList ) {
            list.add( toDto( departmentHead ) );
        }

        return list;
    }

    @Override
    public DepartmentHeadDTO toDto(DepartmentHead departmentHead) {
        if ( departmentHead == null ) {
            return null;
        }

        DepartmentHeadDTO departmentHeadDTO = new DepartmentHeadDTO();

        String name = departmentHeadDepartmentName( departmentHead );
        if ( name != null ) {
            departmentHeadDTO.setDepartmentName( name );
        }
        String name1 = departmentHeadOfficeName( departmentHead );
        if ( name1 != null ) {
            departmentHeadDTO.setOfficeName( name1 );
        }
        Long id = departmentHeadOfficeId( departmentHead );
        if ( id != null ) {
            departmentHeadDTO.setOfficeId( id );
        }
        String fullName = departmentHeadEmployeeFullName( departmentHead );
        if ( fullName != null ) {
            departmentHeadDTO.setEmployeeFullName( fullName );
        }
        Long id1 = departmentHeadDepartmentId( departmentHead );
        if ( id1 != null ) {
            departmentHeadDTO.setDepartmentId( id1 );
        }
        Long id2 = departmentHeadEmployeeId( departmentHead );
        if ( id2 != null ) {
            departmentHeadDTO.setEmployeeId( id2 );
        }
        departmentHeadDTO.setId( departmentHead.getId() );

        return departmentHeadDTO;
    }

    @Override
    public DepartmentHead toEntity(DepartmentHeadDTO departmentHeadDTO) {
        if ( departmentHeadDTO == null ) {
            return null;
        }

        DepartmentHead departmentHead = new DepartmentHead();

        departmentHead.setOffice( officeMapper.fromId( departmentHeadDTO.getOfficeId() ) );
        departmentHead.setDepartment( departmentMapper.fromId( departmentHeadDTO.getDepartmentId() ) );
        departmentHead.setEmployee( employeeMapper.fromId( departmentHeadDTO.getEmployeeId() ) );
        departmentHead.setId( departmentHeadDTO.getId() );

        return departmentHead;
    }

    private String departmentHeadDepartmentName(DepartmentHead departmentHead) {
        if ( departmentHead == null ) {
            return null;
        }
        Department department = departmentHead.getDepartment();
        if ( department == null ) {
            return null;
        }
        String name = department.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String departmentHeadOfficeName(DepartmentHead departmentHead) {
        if ( departmentHead == null ) {
            return null;
        }
        Office office = departmentHead.getOffice();
        if ( office == null ) {
            return null;
        }
        String name = office.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long departmentHeadOfficeId(DepartmentHead departmentHead) {
        if ( departmentHead == null ) {
            return null;
        }
        Office office = departmentHead.getOffice();
        if ( office == null ) {
            return null;
        }
        Long id = office.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String departmentHeadEmployeeFullName(DepartmentHead departmentHead) {
        if ( departmentHead == null ) {
            return null;
        }
        Employee employee = departmentHead.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long departmentHeadDepartmentId(DepartmentHead departmentHead) {
        if ( departmentHead == null ) {
            return null;
        }
        Department department = departmentHead.getDepartment();
        if ( department == null ) {
            return null;
        }
        Long id = department.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long departmentHeadEmployeeId(DepartmentHead departmentHead) {
        if ( departmentHead == null ) {
            return null;
        }
        Employee employee = departmentHead.getEmployee();
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
