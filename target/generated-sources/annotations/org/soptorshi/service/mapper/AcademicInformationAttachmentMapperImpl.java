package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.AcademicInformationAttachment;
import org.soptorshi.domain.Employee;
import org.soptorshi.service.dto.AcademicInformationAttachmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:23+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class AcademicInformationAttachmentMapperImpl implements AcademicInformationAttachmentMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<AcademicInformationAttachment> toEntity(List<AcademicInformationAttachmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AcademicInformationAttachment> list = new ArrayList<AcademicInformationAttachment>( dtoList.size() );
        for ( AcademicInformationAttachmentDTO academicInformationAttachmentDTO : dtoList ) {
            list.add( toEntity( academicInformationAttachmentDTO ) );
        }

        return list;
    }

    @Override
    public List<AcademicInformationAttachmentDTO> toDto(List<AcademicInformationAttachment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AcademicInformationAttachmentDTO> list = new ArrayList<AcademicInformationAttachmentDTO>( entityList.size() );
        for ( AcademicInformationAttachment academicInformationAttachment : entityList ) {
            list.add( toDto( academicInformationAttachment ) );
        }

        return list;
    }

    @Override
    public AcademicInformationAttachmentDTO toDto(AcademicInformationAttachment academicInformationAttachment) {
        if ( academicInformationAttachment == null ) {
            return null;
        }

        AcademicInformationAttachmentDTO academicInformationAttachmentDTO = new AcademicInformationAttachmentDTO();

        String employeeId = academicInformationAttachmentEmployeeEmployeeId( academicInformationAttachment );
        if ( employeeId != null ) {
            academicInformationAttachmentDTO.setEmployeeEmployeeId( employeeId );
        }
        Long id = academicInformationAttachmentEmployeeId( academicInformationAttachment );
        if ( id != null ) {
            academicInformationAttachmentDTO.setEmployeeId( id );
        }
        academicInformationAttachmentDTO.setId( academicInformationAttachment.getId() );
        byte[] file = academicInformationAttachment.getFile();
        if ( file != null ) {
            academicInformationAttachmentDTO.setFile( Arrays.copyOf( file, file.length ) );
        }
        academicInformationAttachmentDTO.setFileContentType( academicInformationAttachment.getFileContentType() );

        return academicInformationAttachmentDTO;
    }

    @Override
    public AcademicInformationAttachment toEntity(AcademicInformationAttachmentDTO academicInformationAttachmentDTO) {
        if ( academicInformationAttachmentDTO == null ) {
            return null;
        }

        AcademicInformationAttachment academicInformationAttachment = new AcademicInformationAttachment();

        academicInformationAttachment.setEmployee( employeeMapper.fromId( academicInformationAttachmentDTO.getEmployeeId() ) );
        academicInformationAttachment.setId( academicInformationAttachmentDTO.getId() );
        byte[] file = academicInformationAttachmentDTO.getFile();
        if ( file != null ) {
            academicInformationAttachment.setFile( Arrays.copyOf( file, file.length ) );
        }
        academicInformationAttachment.setFileContentType( academicInformationAttachmentDTO.getFileContentType() );

        return academicInformationAttachment;
    }

    private String academicInformationAttachmentEmployeeEmployeeId(AcademicInformationAttachment academicInformationAttachment) {
        if ( academicInformationAttachment == null ) {
            return null;
        }
        Employee employee = academicInformationAttachment.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String employeeId = employee.getEmployeeId();
        if ( employeeId == null ) {
            return null;
        }
        return employeeId;
    }

    private Long academicInformationAttachmentEmployeeId(AcademicInformationAttachment academicInformationAttachment) {
        if ( academicInformationAttachment == null ) {
            return null;
        }
        Employee employee = academicInformationAttachment.getEmployee();
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
