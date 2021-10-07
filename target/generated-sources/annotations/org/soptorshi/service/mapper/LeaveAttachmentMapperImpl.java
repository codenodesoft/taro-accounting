package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.LeaveApplication;
import org.soptorshi.domain.LeaveAttachment;
import org.soptorshi.service.dto.LeaveAttachmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class LeaveAttachmentMapperImpl implements LeaveAttachmentMapper {

    @Autowired
    private LeaveApplicationMapper leaveApplicationMapper;

    @Override
    public List<LeaveAttachment> toEntity(List<LeaveAttachmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<LeaveAttachment> list = new ArrayList<LeaveAttachment>( dtoList.size() );
        for ( LeaveAttachmentDTO leaveAttachmentDTO : dtoList ) {
            list.add( toEntity( leaveAttachmentDTO ) );
        }

        return list;
    }

    @Override
    public List<LeaveAttachmentDTO> toDto(List<LeaveAttachment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LeaveAttachmentDTO> list = new ArrayList<LeaveAttachmentDTO>( entityList.size() );
        for ( LeaveAttachment leaveAttachment : entityList ) {
            list.add( toDto( leaveAttachment ) );
        }

        return list;
    }

    @Override
    public LeaveAttachmentDTO toDto(LeaveAttachment leaveAttachment) {
        if ( leaveAttachment == null ) {
            return null;
        }

        LeaveAttachmentDTO leaveAttachmentDTO = new LeaveAttachmentDTO();

        Long id = leaveAttachmentLeaveApplicationId( leaveAttachment );
        if ( id != null ) {
            leaveAttachmentDTO.setLeaveApplicationId( id );
        }
        leaveAttachmentDTO.setId( leaveAttachment.getId() );
        byte[] file = leaveAttachment.getFile();
        if ( file != null ) {
            leaveAttachmentDTO.setFile( Arrays.copyOf( file, file.length ) );
        }
        leaveAttachmentDTO.setFileContentType( leaveAttachment.getFileContentType() );
        leaveAttachmentDTO.setCreatedBy( leaveAttachment.getCreatedBy() );
        leaveAttachmentDTO.setCreatedOn( leaveAttachment.getCreatedOn() );
        leaveAttachmentDTO.setUpdatedBy( leaveAttachment.getUpdatedBy() );
        leaveAttachmentDTO.setUpdatedOn( leaveAttachment.getUpdatedOn() );

        return leaveAttachmentDTO;
    }

    @Override
    public LeaveAttachment toEntity(LeaveAttachmentDTO leaveAttachmentDTO) {
        if ( leaveAttachmentDTO == null ) {
            return null;
        }

        LeaveAttachment leaveAttachment = new LeaveAttachment();

        leaveAttachment.setLeaveApplication( leaveApplicationMapper.fromId( leaveAttachmentDTO.getLeaveApplicationId() ) );
        leaveAttachment.setId( leaveAttachmentDTO.getId() );
        byte[] file = leaveAttachmentDTO.getFile();
        if ( file != null ) {
            leaveAttachment.setFile( Arrays.copyOf( file, file.length ) );
        }
        leaveAttachment.setFileContentType( leaveAttachmentDTO.getFileContentType() );
        leaveAttachment.setCreatedBy( leaveAttachmentDTO.getCreatedBy() );
        leaveAttachment.setCreatedOn( leaveAttachmentDTO.getCreatedOn() );
        leaveAttachment.setUpdatedBy( leaveAttachmentDTO.getUpdatedBy() );
        leaveAttachment.setUpdatedOn( leaveAttachmentDTO.getUpdatedOn() );

        return leaveAttachment;
    }

    private Long leaveAttachmentLeaveApplicationId(LeaveAttachment leaveAttachment) {
        if ( leaveAttachment == null ) {
            return null;
        }
        LeaveApplication leaveApplication = leaveAttachment.getLeaveApplication();
        if ( leaveApplication == null ) {
            return null;
        }
        Long id = leaveApplication.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
