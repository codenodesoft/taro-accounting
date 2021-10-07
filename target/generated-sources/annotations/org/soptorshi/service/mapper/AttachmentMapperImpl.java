package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.AcademicInformation;
import org.soptorshi.domain.Attachment;
import org.soptorshi.domain.ExperienceInformation;
import org.soptorshi.domain.TrainingInformation;
import org.soptorshi.service.dto.AttachmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class AttachmentMapperImpl implements AttachmentMapper {

    @Autowired
    private AcademicInformationMapper academicInformationMapper;
    @Autowired
    private TrainingInformationMapper trainingInformationMapper;
    @Autowired
    private ExperienceInformationMapper experienceInformationMapper;

    @Override
    public List<Attachment> toEntity(List<AttachmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Attachment> list = new ArrayList<Attachment>( dtoList.size() );
        for ( AttachmentDTO attachmentDTO : dtoList ) {
            list.add( toEntity( attachmentDTO ) );
        }

        return list;
    }

    @Override
    public List<AttachmentDTO> toDto(List<Attachment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttachmentDTO> list = new ArrayList<AttachmentDTO>( entityList.size() );
        for ( Attachment attachment : entityList ) {
            list.add( toDto( attachment ) );
        }

        return list;
    }

    @Override
    public AttachmentDTO toDto(Attachment attachment) {
        if ( attachment == null ) {
            return null;
        }

        AttachmentDTO attachmentDTO = new AttachmentDTO();

        Long id = attachmentExperienceInformationId( attachment );
        if ( id != null ) {
            attachmentDTO.setExperienceInformationId( id );
        }
        Long id1 = attachmentTrainingInformationId( attachment );
        if ( id1 != null ) {
            attachmentDTO.setTrainingInformationId( id1 );
        }
        Long id2 = attachmentAcademicInformationId( attachment );
        if ( id2 != null ) {
            attachmentDTO.setAcademicInformationId( id2 );
        }
        attachmentDTO.setId( attachment.getId() );
        byte[] file = attachment.getFile();
        if ( file != null ) {
            attachmentDTO.setFile( Arrays.copyOf( file, file.length ) );
        }
        attachmentDTO.setFileContentType( attachment.getFileContentType() );

        return attachmentDTO;
    }

    @Override
    public Attachment toEntity(AttachmentDTO attachmentDTO) {
        if ( attachmentDTO == null ) {
            return null;
        }

        Attachment attachment = new Attachment();

        attachment.setTrainingInformation( trainingInformationMapper.fromId( attachmentDTO.getTrainingInformationId() ) );
        attachment.setAcademicInformation( academicInformationMapper.fromId( attachmentDTO.getAcademicInformationId() ) );
        attachment.setExperienceInformation( experienceInformationMapper.fromId( attachmentDTO.getExperienceInformationId() ) );
        attachment.setId( attachmentDTO.getId() );
        byte[] file = attachmentDTO.getFile();
        if ( file != null ) {
            attachment.setFile( Arrays.copyOf( file, file.length ) );
        }
        attachment.setFileContentType( attachmentDTO.getFileContentType() );

        return attachment;
    }

    private Long attachmentExperienceInformationId(Attachment attachment) {
        if ( attachment == null ) {
            return null;
        }
        ExperienceInformation experienceInformation = attachment.getExperienceInformation();
        if ( experienceInformation == null ) {
            return null;
        }
        Long id = experienceInformation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long attachmentTrainingInformationId(Attachment attachment) {
        if ( attachment == null ) {
            return null;
        }
        TrainingInformation trainingInformation = attachment.getTrainingInformation();
        if ( trainingInformation == null ) {
            return null;
        }
        Long id = trainingInformation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long attachmentAcademicInformationId(Attachment attachment) {
        if ( attachment == null ) {
            return null;
        }
        AcademicInformation academicInformation = attachment.getAcademicInformation();
        if ( academicInformation == null ) {
            return null;
        }
        Long id = academicInformation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
