package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.TrainingInformationAttachment;
import org.soptorshi.service.dto.TrainingInformationAttachmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class TrainingInformationAttachmentMapperImpl implements TrainingInformationAttachmentMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<TrainingInformationAttachment> toEntity(List<TrainingInformationAttachmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrainingInformationAttachment> list = new ArrayList<TrainingInformationAttachment>( dtoList.size() );
        for ( TrainingInformationAttachmentDTO trainingInformationAttachmentDTO : dtoList ) {
            list.add( toEntity( trainingInformationAttachmentDTO ) );
        }

        return list;
    }

    @Override
    public List<TrainingInformationAttachmentDTO> toDto(List<TrainingInformationAttachment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrainingInformationAttachmentDTO> list = new ArrayList<TrainingInformationAttachmentDTO>( entityList.size() );
        for ( TrainingInformationAttachment trainingInformationAttachment : entityList ) {
            list.add( toDto( trainingInformationAttachment ) );
        }

        return list;
    }

    @Override
    public TrainingInformationAttachmentDTO toDto(TrainingInformationAttachment trainingInformationAttachment) {
        if ( trainingInformationAttachment == null ) {
            return null;
        }

        TrainingInformationAttachmentDTO trainingInformationAttachmentDTO = new TrainingInformationAttachmentDTO();

        String employeeId = trainingInformationAttachmentEmployeeEmployeeId( trainingInformationAttachment );
        if ( employeeId != null ) {
            trainingInformationAttachmentDTO.setEmployeeEmployeeId( employeeId );
        }
        Long id = trainingInformationAttachmentEmployeeId( trainingInformationAttachment );
        if ( id != null ) {
            trainingInformationAttachmentDTO.setEmployeeId( id );
        }
        trainingInformationAttachmentDTO.setId( trainingInformationAttachment.getId() );
        byte[] file = trainingInformationAttachment.getFile();
        if ( file != null ) {
            trainingInformationAttachmentDTO.setFile( Arrays.copyOf( file, file.length ) );
        }
        trainingInformationAttachmentDTO.setFileContentType( trainingInformationAttachment.getFileContentType() );

        return trainingInformationAttachmentDTO;
    }

    @Override
    public TrainingInformationAttachment toEntity(TrainingInformationAttachmentDTO trainingInformationAttachmentDTO) {
        if ( trainingInformationAttachmentDTO == null ) {
            return null;
        }

        TrainingInformationAttachment trainingInformationAttachment = new TrainingInformationAttachment();

        trainingInformationAttachment.setEmployee( employeeMapper.fromId( trainingInformationAttachmentDTO.getEmployeeId() ) );
        trainingInformationAttachment.setId( trainingInformationAttachmentDTO.getId() );
        byte[] file = trainingInformationAttachmentDTO.getFile();
        if ( file != null ) {
            trainingInformationAttachment.setFile( Arrays.copyOf( file, file.length ) );
        }
        trainingInformationAttachment.setFileContentType( trainingInformationAttachmentDTO.getFileContentType() );

        return trainingInformationAttachment;
    }

    private String trainingInformationAttachmentEmployeeEmployeeId(TrainingInformationAttachment trainingInformationAttachment) {
        if ( trainingInformationAttachment == null ) {
            return null;
        }
        Employee employee = trainingInformationAttachment.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String employeeId = employee.getEmployeeId();
        if ( employeeId == null ) {
            return null;
        }
        return employeeId;
    }

    private Long trainingInformationAttachmentEmployeeId(TrainingInformationAttachment trainingInformationAttachment) {
        if ( trainingInformationAttachment == null ) {
            return null;
        }
        Employee employee = trainingInformationAttachment.getEmployee();
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
