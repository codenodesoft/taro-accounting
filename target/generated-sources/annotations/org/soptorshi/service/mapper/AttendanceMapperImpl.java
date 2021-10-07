package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Attendance;
import org.soptorshi.domain.AttendanceExcelUpload;
import org.soptorshi.domain.Employee;
import org.soptorshi.service.dto.AttendanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class AttendanceMapperImpl implements AttendanceMapper {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private AttendanceExcelUploadMapper attendanceExcelUploadMapper;

    @Override
    public List<Attendance> toEntity(List<AttendanceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Attendance> list = new ArrayList<Attendance>( dtoList.size() );
        for ( AttendanceDTO attendanceDTO : dtoList ) {
            list.add( toEntity( attendanceDTO ) );
        }

        return list;
    }

    @Override
    public List<AttendanceDTO> toDto(List<Attendance> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttendanceDTO> list = new ArrayList<AttendanceDTO>( entityList.size() );
        for ( Attendance attendance : entityList ) {
            list.add( toDto( attendance ) );
        }

        return list;
    }

    @Override
    public AttendanceDTO toDto(Attendance attendance) {
        if ( attendance == null ) {
            return null;
        }

        AttendanceDTO attendanceDTO = new AttendanceDTO();

        Long id = attendanceEmployeeId( attendance );
        if ( id != null ) {
            attendanceDTO.setEmployeeId( id );
        }
        Long id1 = attendanceAttendanceExcelUploadId( attendance );
        if ( id1 != null ) {
            attendanceDTO.setAttendanceExcelUploadId( id1 );
        }
        String fullName = attendanceEmployeeFullName( attendance );
        if ( fullName != null ) {
            attendanceDTO.setEmployeeFullName( fullName );
        }
        attendanceDTO.setId( attendance.getId() );
        attendanceDTO.setAttendanceDate( attendance.getAttendanceDate() );
        attendanceDTO.setInTime( attendance.getInTime() );
        attendanceDTO.setOutTime( attendance.getOutTime() );
        attendanceDTO.setDuration( attendance.getDuration() );
        attendanceDTO.setRemarks( attendance.getRemarks() );
        attendanceDTO.setCreatedBy( attendance.getCreatedBy() );
        attendanceDTO.setCreatedOn( attendance.getCreatedOn() );
        attendanceDTO.setUpdatedBy( attendance.getUpdatedBy() );
        attendanceDTO.setUpdatedOn( attendance.getUpdatedOn() );

        return attendanceDTO;
    }

    @Override
    public Attendance toEntity(AttendanceDTO attendanceDTO) {
        if ( attendanceDTO == null ) {
            return null;
        }

        Attendance attendance = new Attendance();

        attendance.setAttendanceExcelUpload( attendanceExcelUploadMapper.fromId( attendanceDTO.getAttendanceExcelUploadId() ) );
        attendance.setEmployee( employeeMapper.fromId( attendanceDTO.getEmployeeId() ) );
        attendance.setId( attendanceDTO.getId() );
        attendance.setAttendanceDate( attendanceDTO.getAttendanceDate() );
        attendance.setInTime( attendanceDTO.getInTime() );
        attendance.setOutTime( attendanceDTO.getOutTime() );
        attendance.setDuration( attendanceDTO.getDuration() );
        attendance.setRemarks( attendanceDTO.getRemarks() );
        attendance.setCreatedBy( attendanceDTO.getCreatedBy() );
        attendance.setCreatedOn( attendanceDTO.getCreatedOn() );
        attendance.setUpdatedBy( attendanceDTO.getUpdatedBy() );
        attendance.setUpdatedOn( attendanceDTO.getUpdatedOn() );

        return attendance;
    }

    private Long attendanceEmployeeId(Attendance attendance) {
        if ( attendance == null ) {
            return null;
        }
        Employee employee = attendance.getEmployee();
        if ( employee == null ) {
            return null;
        }
        Long id = employee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long attendanceAttendanceExcelUploadId(Attendance attendance) {
        if ( attendance == null ) {
            return null;
        }
        AttendanceExcelUpload attendanceExcelUpload = attendance.getAttendanceExcelUpload();
        if ( attendanceExcelUpload == null ) {
            return null;
        }
        Long id = attendanceExcelUpload.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String attendanceEmployeeFullName(Attendance attendance) {
        if ( attendance == null ) {
            return null;
        }
        Employee employee = attendance.getEmployee();
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
