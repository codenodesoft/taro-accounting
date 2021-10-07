package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.Manager;
import org.soptorshi.service.dto.ManagerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ManagerMapperImpl implements ManagerMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Manager> toEntity(List<ManagerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Manager> list = new ArrayList<Manager>( dtoList.size() );
        for ( ManagerDTO managerDTO : dtoList ) {
            list.add( toEntity( managerDTO ) );
        }

        return list;
    }

    @Override
    public List<ManagerDTO> toDto(List<Manager> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ManagerDTO> list = new ArrayList<ManagerDTO>( entityList.size() );
        for ( Manager manager : entityList ) {
            list.add( toDto( manager ) );
        }

        return list;
    }

    @Override
    public ManagerDTO toDto(Manager manager) {
        if ( manager == null ) {
            return null;
        }

        ManagerDTO managerDTO = new ManagerDTO();

        String fullName = managerEmployeeFullName( manager );
        if ( fullName != null ) {
            managerDTO.setEmployeeFullName( fullName );
        }
        Long id = managerEmployeeId( manager );
        if ( id != null ) {
            managerDTO.setEmployeeId( id );
        }
        managerDTO.setId( manager.getId() );
        managerDTO.setParentEmployeeId( manager.getParentEmployeeId() );
        managerDTO.setModifiedBy( manager.getModifiedBy() );
        managerDTO.setModifiedOn( manager.getModifiedOn() );

        return managerDTO;
    }

    @Override
    public Manager toEntity(ManagerDTO managerDTO) {
        if ( managerDTO == null ) {
            return null;
        }

        Manager manager = new Manager();

        manager.setEmployee( employeeMapper.fromId( managerDTO.getEmployeeId() ) );
        manager.setId( managerDTO.getId() );
        manager.setParentEmployeeId( managerDTO.getParentEmployeeId() );
        manager.setModifiedBy( managerDTO.getModifiedBy() );
        manager.setModifiedOn( managerDTO.getModifiedOn() );

        return manager;
    }

    private String managerEmployeeFullName(Manager manager) {
        if ( manager == null ) {
            return null;
        }
        Employee employee = manager.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long managerEmployeeId(Manager manager) {
        if ( manager == null ) {
            return null;
        }
        Employee employee = manager.getEmployee();
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
