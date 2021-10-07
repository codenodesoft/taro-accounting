package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Department;
import org.soptorshi.domain.Designation;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.Office;
import org.soptorshi.service.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private OfficeMapper officeMapper;
    @Autowired
    private DesignationMapper designationMapper;

    @Override
    public List<Employee> toEntity(List<EmployeeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( dtoList.size() );
        for ( EmployeeDTO employeeDTO : dtoList ) {
            list.add( toEntity( employeeDTO ) );
        }

        return list;
    }

    @Override
    public List<EmployeeDTO> toDto(List<Employee> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<EmployeeDTO> list = new ArrayList<EmployeeDTO>( entityList.size() );
        for ( Employee employee : entityList ) {
            list.add( toDto( employee ) );
        }

        return list;
    }

    @Override
    public EmployeeDTO toDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        String name = employeeDepartmentName( employee );
        if ( name != null ) {
            employeeDTO.setDepartmentName( name );
        }
        String name1 = employeeDesignationName( employee );
        if ( name1 != null ) {
            employeeDTO.setDesignationName( name1 );
        }
        String name2 = employeeOfficeName( employee );
        if ( name2 != null ) {
            employeeDTO.setOfficeName( name2 );
        }
        Long id = employeeOfficeId( employee );
        if ( id != null ) {
            employeeDTO.setOfficeId( id );
        }
        Long id1 = employeeDesignationId( employee );
        if ( id1 != null ) {
            employeeDTO.setDesignationId( id1 );
        }
        Long id2 = employeeDepartmentId( employee );
        if ( id2 != null ) {
            employeeDTO.setDepartmentId( id2 );
        }
        employeeDTO.setId( employee.getId() );
        employeeDTO.setEmployeeId( employee.getEmployeeId() );
        employeeDTO.setFullName( employee.getFullName() );
        employeeDTO.setFathersName( employee.getFathersName() );
        employeeDTO.setMothersName( employee.getMothersName() );
        employeeDTO.setBirthDate( employee.getBirthDate() );
        employeeDTO.setMaritalStatus( employee.getMaritalStatus() );
        employeeDTO.setGender( employee.getGender() );
        employeeDTO.setReligion( employee.getReligion() );
        employeeDTO.setPermanentAddress( employee.getPermanentAddress() );
        employeeDTO.setPresentAddress( employee.getPresentAddress() );
        employeeDTO.setnId( employee.getnId() );
        employeeDTO.setTin( employee.getTin() );
        employeeDTO.setContactNumber( employee.getContactNumber() );
        employeeDTO.setEmail( employee.getEmail() );
        employeeDTO.setBloodGroup( employee.getBloodGroup() );
        employeeDTO.setEmergencyContact( employee.getEmergencyContact() );
        employeeDTO.setJoiningDate( employee.getJoiningDate() );
        employeeDTO.setManager( employee.getManager() );
        employeeDTO.setEmployeeStatus( employee.getEmployeeStatus() );
        employeeDTO.setEmploymentType( employee.getEmploymentType() );
        employeeDTO.setTerminationDate( employee.getTerminationDate() );
        employeeDTO.setReasonOfTermination( employee.getReasonOfTermination() );
        employeeDTO.setUserAccount( employee.isUserAccount() );
        byte[] photo = employee.getPhoto();
        if ( photo != null ) {
            employeeDTO.setPhoto( Arrays.copyOf( photo, photo.length ) );
        }
        employeeDTO.setPhotoContentType( employee.getPhotoContentType() );
        employeeDTO.setHourlySalary( employee.getHourlySalary() );
        employeeDTO.setBankAccountNo( employee.getBankAccountNo() );
        employeeDTO.setBankName( employee.getBankName() );

        return employeeDTO;
    }

    @Override
    public Employee toEntity(EmployeeDTO employeeDTO) {
        if ( employeeDTO == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setOffice( officeMapper.fromId( employeeDTO.getOfficeId() ) );
        employee.setDesignation( designationMapper.fromId( employeeDTO.getDesignationId() ) );
        employee.setDepartment( departmentMapper.fromId( employeeDTO.getDepartmentId() ) );
        employee.setId( employeeDTO.getId() );
        employee.setEmployeeId( employeeDTO.getEmployeeId() );
        employee.setFullName( employeeDTO.getFullName() );
        employee.setFathersName( employeeDTO.getFathersName() );
        employee.setMothersName( employeeDTO.getMothersName() );
        employee.setBirthDate( employeeDTO.getBirthDate() );
        employee.setMaritalStatus( employeeDTO.getMaritalStatus() );
        employee.setGender( employeeDTO.getGender() );
        employee.setReligion( employeeDTO.getReligion() );
        employee.setPermanentAddress( employeeDTO.getPermanentAddress() );
        employee.setPresentAddress( employeeDTO.getPresentAddress() );
        employee.setnId( employeeDTO.getnId() );
        employee.setTin( employeeDTO.getTin() );
        employee.setContactNumber( employeeDTO.getContactNumber() );
        employee.setEmail( employeeDTO.getEmail() );
        employee.setBloodGroup( employeeDTO.getBloodGroup() );
        employee.setEmergencyContact( employeeDTO.getEmergencyContact() );
        employee.setJoiningDate( employeeDTO.getJoiningDate() );
        employee.setManager( employeeDTO.getManager() );
        employee.setEmployeeStatus( employeeDTO.getEmployeeStatus() );
        employee.setEmploymentType( employeeDTO.getEmploymentType() );
        employee.setTerminationDate( employeeDTO.getTerminationDate() );
        employee.setReasonOfTermination( employeeDTO.getReasonOfTermination() );
        employee.setUserAccount( employeeDTO.isUserAccount() );
        byte[] photo = employeeDTO.getPhoto();
        if ( photo != null ) {
            employee.setPhoto( Arrays.copyOf( photo, photo.length ) );
        }
        employee.setPhotoContentType( employeeDTO.getPhotoContentType() );
        employee.setHourlySalary( employeeDTO.getHourlySalary() );
        employee.setBankAccountNo( employeeDTO.getBankAccountNo() );
        employee.setBankName( employeeDTO.getBankName() );

        return employee;
    }

    private String employeeDepartmentName(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Department department = employee.getDepartment();
        if ( department == null ) {
            return null;
        }
        String name = department.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String employeeDesignationName(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Designation designation = employee.getDesignation();
        if ( designation == null ) {
            return null;
        }
        String name = designation.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String employeeOfficeName(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Office office = employee.getOffice();
        if ( office == null ) {
            return null;
        }
        String name = office.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long employeeOfficeId(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Office office = employee.getOffice();
        if ( office == null ) {
            return null;
        }
        Long id = office.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long employeeDesignationId(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Designation designation = employee.getDesignation();
        if ( designation == null ) {
            return null;
        }
        Long id = designation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long employeeDepartmentId(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Department department = employee.getDepartment();
        if ( department == null ) {
            return null;
        }
        Long id = department.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
