package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.ExperienceInformationAttachment;
import org.soptorshi.service.dto.ExperienceInformationAttachmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ExperienceInformationAttachmentMapperImpl implements ExperienceInformationAttachmentMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<ExperienceInformationAttachment> toEntity(List<ExperienceInformationAttachmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ExperienceInformationAttachment> list = new ArrayList<ExperienceInformationAttachment>( dtoList.size() );
        for ( ExperienceInformationAttachmentDTO experienceInformationAttachmentDTO : dtoList ) {
            list.add( toEntity( experienceInformationAttachmentDTO ) );
        }

        return list;
    }

    @Override
    public List<ExperienceInformationAttachmentDTO> toDto(List<ExperienceInformationAttachment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ExperienceInformationAttachmentDTO> list = new ArrayList<ExperienceInformationAttachmentDTO>( entityList.size() );
        for ( ExperienceInformationAttachment experienceInformationAttachment : entityList ) {
            list.add( toDto( experienceInformationAttachment ) );
        }

        return list;
    }

    @Override
    public ExperienceInformationAttachmentDTO toDto(ExperienceInformationAttachment experienceInformationAttachment) {
        if ( experienceInformationAttachment == null ) {
            return null;
        }

        ExperienceInformationAttachmentDTO experienceInformationAttachmentDTO = new ExperienceInformationAttachmentDTO();

        String employeeId = experienceInformationAttachmentEmployeeEmployeeId( experienceInformationAttachment );
        if ( employeeId != null ) {
            experienceInformationAttachmentDTO.setEmployeeEmployeeId( employeeId );
        }
        Long id = experienceInformationAttachmentEmployeeId( experienceInformationAttachment );
        if ( id != null ) {
            experienceInformationAttachmentDTO.setEmployeeId( id );
        }
        experienceInformationAttachmentDTO.setId( experienceInformationAttachment.getId() );
        byte[] file = experienceInformationAttachment.getFile();
        if ( file != null ) {
            experienceInformationAttachmentDTO.setFile( Arrays.copyOf( file, file.length ) );
        }
        experienceInformationAttachmentDTO.setFileContentType( experienceInformationAttachment.getFileContentType() );

        return experienceInformationAttachmentDTO;
    }

    @Override
    public ExperienceInformationAttachment toEntity(ExperienceInformationAttachmentDTO experienceInformationAttachmentDTO) {
        if ( experienceInformationAttachmentDTO == null ) {
            return null;
        }

        ExperienceInformationAttachment experienceInformationAttachment = new ExperienceInformationAttachment();

        experienceInformationAttachment.setEmployee( employeeMapper.fromId( experienceInformationAttachmentDTO.getEmployeeId() ) );
        experienceInformationAttachment.setId( experienceInformationAttachmentDTO.getId() );
        byte[] file = experienceInformationAttachmentDTO.getFile();
        if ( file != null ) {
            experienceInformationAttachment.setFile( Arrays.copyOf( file, file.length ) );
        }
        experienceInformationAttachment.setFileContentType( experienceInformationAttachmentDTO.getFileContentType() );

        return experienceInformationAttachment;
    }

    private String experienceInformationAttachmentEmployeeEmployeeId(ExperienceInformationAttachment experienceInformationAttachment) {
        if ( experienceInformationAttachment == null ) {
            return null;
        }
        Employee employee = experienceInformationAttachment.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String employeeId = employee.getEmployeeId();
        if ( employeeId == null ) {
            return null;
        }
        return employeeId;
    }

    private Long experienceInformationAttachmentEmployeeId(ExperienceInformationAttachment experienceInformationAttachment) {
        if ( experienceInformationAttachment == null ) {
            return null;
        }
        Employee employee = experienceInformationAttachment.getEmployee();
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
