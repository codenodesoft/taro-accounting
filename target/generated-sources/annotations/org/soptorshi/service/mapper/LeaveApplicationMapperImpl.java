package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.LeaveApplication;
import org.soptorshi.domain.LeaveType;
import org.soptorshi.service.dto.LeaveApplicationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class LeaveApplicationMapperImpl implements LeaveApplicationMapper {

    @Autowired
    private LeaveTypeMapper leaveTypeMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<LeaveApplication> toEntity(List<LeaveApplicationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<LeaveApplication> list = new ArrayList<LeaveApplication>( dtoList.size() );
        for ( LeaveApplicationDTO leaveApplicationDTO : dtoList ) {
            list.add( toEntity( leaveApplicationDTO ) );
        }

        return list;
    }

    @Override
    public List<LeaveApplicationDTO> toDto(List<LeaveApplication> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LeaveApplicationDTO> list = new ArrayList<LeaveApplicationDTO>( entityList.size() );
        for ( LeaveApplication leaveApplication : entityList ) {
            list.add( toDto( leaveApplication ) );
        }

        return list;
    }

    @Override
    public LeaveApplicationDTO toDto(LeaveApplication leaveApplication) {
        if ( leaveApplication == null ) {
            return null;
        }

        LeaveApplicationDTO leaveApplicationDTO = new LeaveApplicationDTO();

        Long id = leaveApplicationAppliedByIdId( leaveApplication );
        if ( id != null ) {
            leaveApplicationDTO.setAppliedByIdId( id );
        }
        String fullName = leaveApplicationAppliedByIdFullName( leaveApplication );
        if ( fullName != null ) {
            leaveApplicationDTO.setAppliedByIdFullName( fullName );
        }
        String name = leaveApplicationLeaveTypesName( leaveApplication );
        if ( name != null ) {
            leaveApplicationDTO.setLeaveTypesName( name );
        }
        String fullName1 = leaveApplicationActionTakenByIdFullName( leaveApplication );
        if ( fullName1 != null ) {
            leaveApplicationDTO.setActionTakenByIdFullName( fullName1 );
        }
        String fullName2 = leaveApplicationEmployeesFullName( leaveApplication );
        if ( fullName2 != null ) {
            leaveApplicationDTO.setEmployeesFullName( fullName2 );
        }
        Long id1 = leaveApplicationActionTakenByIdId( leaveApplication );
        if ( id1 != null ) {
            leaveApplicationDTO.setActionTakenByIdId( id1 );
        }
        Long id2 = leaveApplicationLeaveTypesId( leaveApplication );
        if ( id2 != null ) {
            leaveApplicationDTO.setLeaveTypesId( id2 );
        }
        Long id3 = leaveApplicationEmployeesId( leaveApplication );
        if ( id3 != null ) {
            leaveApplicationDTO.setEmployeesId( id3 );
        }
        leaveApplicationDTO.setId( leaveApplication.getId() );
        leaveApplicationDTO.setFromDate( leaveApplication.getFromDate() );
        leaveApplicationDTO.setToDate( leaveApplication.getToDate() );
        leaveApplicationDTO.setNumberOfDays( leaveApplication.getNumberOfDays() );
        leaveApplicationDTO.setPaidLeave( leaveApplication.getPaidLeave() );
        leaveApplicationDTO.setReason( leaveApplication.getReason() );
        leaveApplicationDTO.setAppliedOn( leaveApplication.getAppliedOn() );
        leaveApplicationDTO.setActionTakenOn( leaveApplication.getActionTakenOn() );
        leaveApplicationDTO.setStatus( leaveApplication.getStatus() );

        return leaveApplicationDTO;
    }

    @Override
    public LeaveApplication toEntity(LeaveApplicationDTO leaveApplicationDTO) {
        if ( leaveApplicationDTO == null ) {
            return null;
        }

        LeaveApplication leaveApplication = new LeaveApplication();

        leaveApplication.setLeaveTypes( leaveTypeMapper.fromId( leaveApplicationDTO.getLeaveTypesId() ) );
        leaveApplication.setEmployees( employeeMapper.fromId( leaveApplicationDTO.getEmployeesId() ) );
        leaveApplication.setAppliedById( employeeMapper.fromId( leaveApplicationDTO.getAppliedByIdId() ) );
        leaveApplication.setActionTakenById( employeeMapper.fromId( leaveApplicationDTO.getActionTakenByIdId() ) );
        leaveApplication.setId( leaveApplicationDTO.getId() );
        leaveApplication.setFromDate( leaveApplicationDTO.getFromDate() );
        leaveApplication.setToDate( leaveApplicationDTO.getToDate() );
        leaveApplication.setNumberOfDays( leaveApplicationDTO.getNumberOfDays() );
        leaveApplication.setPaidLeave( leaveApplicationDTO.getPaidLeave() );
        leaveApplication.setReason( leaveApplicationDTO.getReason() );
        leaveApplication.setAppliedOn( leaveApplicationDTO.getAppliedOn() );
        leaveApplication.setActionTakenOn( leaveApplicationDTO.getActionTakenOn() );
        leaveApplication.setStatus( leaveApplicationDTO.getStatus() );

        return leaveApplication;
    }

    private Long leaveApplicationAppliedByIdId(LeaveApplication leaveApplication) {
        if ( leaveApplication == null ) {
            return null;
        }
        Employee appliedById = leaveApplication.getAppliedById();
        if ( appliedById == null ) {
            return null;
        }
        Long id = appliedById.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String leaveApplicationAppliedByIdFullName(LeaveApplication leaveApplication) {
        if ( leaveApplication == null ) {
            return null;
        }
        Employee appliedById = leaveApplication.getAppliedById();
        if ( appliedById == null ) {
            return null;
        }
        String fullName = appliedById.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private String leaveApplicationLeaveTypesName(LeaveApplication leaveApplication) {
        if ( leaveApplication == null ) {
            return null;
        }
        LeaveType leaveTypes = leaveApplication.getLeaveTypes();
        if ( leaveTypes == null ) {
            return null;
        }
        String name = leaveTypes.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String leaveApplicationActionTakenByIdFullName(LeaveApplication leaveApplication) {
        if ( leaveApplication == null ) {
            return null;
        }
        Employee actionTakenById = leaveApplication.getActionTakenById();
        if ( actionTakenById == null ) {
            return null;
        }
        String fullName = actionTakenById.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private String leaveApplicationEmployeesFullName(LeaveApplication leaveApplication) {
        if ( leaveApplication == null ) {
            return null;
        }
        Employee employees = leaveApplication.getEmployees();
        if ( employees == null ) {
            return null;
        }
        String fullName = employees.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long leaveApplicationActionTakenByIdId(LeaveApplication leaveApplication) {
        if ( leaveApplication == null ) {
            return null;
        }
        Employee actionTakenById = leaveApplication.getActionTakenById();
        if ( actionTakenById == null ) {
            return null;
        }
        Long id = actionTakenById.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long leaveApplicationLeaveTypesId(LeaveApplication leaveApplication) {
        if ( leaveApplication == null ) {
            return null;
        }
        LeaveType leaveTypes = leaveApplication.getLeaveTypes();
        if ( leaveTypes == null ) {
            return null;
        }
        Long id = leaveTypes.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long leaveApplicationEmployeesId(LeaveApplication leaveApplication) {
        if ( leaveApplication == null ) {
            return null;
        }
        Employee employees = leaveApplication.getEmployees();
        if ( employees == null ) {
            return null;
        }
        Long id = employees.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
