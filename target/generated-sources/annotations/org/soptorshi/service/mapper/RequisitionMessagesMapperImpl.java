package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.Requisition;
import org.soptorshi.domain.RequisitionMessages;
import org.soptorshi.service.dto.RequisitionMessagesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class RequisitionMessagesMapperImpl implements RequisitionMessagesMapper {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private RequisitionMapper requisitionMapper;

    @Override
    public List<RequisitionMessages> toEntity(List<RequisitionMessagesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<RequisitionMessages> list = new ArrayList<RequisitionMessages>( dtoList.size() );
        for ( RequisitionMessagesDTO requisitionMessagesDTO : dtoList ) {
            list.add( toEntity( requisitionMessagesDTO ) );
        }

        return list;
    }

    @Override
    public List<RequisitionMessagesDTO> toDto(List<RequisitionMessages> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RequisitionMessagesDTO> list = new ArrayList<RequisitionMessagesDTO>( entityList.size() );
        for ( RequisitionMessages requisitionMessages : entityList ) {
            list.add( toDto( requisitionMessages ) );
        }

        return list;
    }

    @Override
    public RequisitionMessagesDTO toDto(RequisitionMessages requisitionMessages) {
        if ( requisitionMessages == null ) {
            return null;
        }

        RequisitionMessagesDTO requisitionMessagesDTO = new RequisitionMessagesDTO();

        Long id = requisitionMessagesRequisitionId( requisitionMessages );
        if ( id != null ) {
            requisitionMessagesDTO.setRequisitionId( id );
        }
        String fullName = requisitionMessagesCommenterFullName( requisitionMessages );
        if ( fullName != null ) {
            requisitionMessagesDTO.setCommenterFullName( fullName );
        }
        Long id1 = requisitionMessagesCommenterId( requisitionMessages );
        if ( id1 != null ) {
            requisitionMessagesDTO.setCommenterId( id1 );
        }
        requisitionMessagesDTO.setId( requisitionMessages.getId() );
        requisitionMessagesDTO.setComments( requisitionMessages.getComments() );
        requisitionMessagesDTO.setCommentedOn( requisitionMessages.getCommentedOn() );

        return requisitionMessagesDTO;
    }

    @Override
    public RequisitionMessages toEntity(RequisitionMessagesDTO requisitionMessagesDTO) {
        if ( requisitionMessagesDTO == null ) {
            return null;
        }

        RequisitionMessages requisitionMessages = new RequisitionMessages();

        requisitionMessages.setRequisition( requisitionMapper.fromId( requisitionMessagesDTO.getRequisitionId() ) );
        requisitionMessages.setCommenter( employeeMapper.fromId( requisitionMessagesDTO.getCommenterId() ) );
        requisitionMessages.setId( requisitionMessagesDTO.getId() );
        requisitionMessages.setComments( requisitionMessagesDTO.getComments() );
        requisitionMessages.setCommentedOn( requisitionMessagesDTO.getCommentedOn() );

        return requisitionMessages;
    }

    private Long requisitionMessagesRequisitionId(RequisitionMessages requisitionMessages) {
        if ( requisitionMessages == null ) {
            return null;
        }
        Requisition requisition = requisitionMessages.getRequisition();
        if ( requisition == null ) {
            return null;
        }
        Long id = requisition.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String requisitionMessagesCommenterFullName(RequisitionMessages requisitionMessages) {
        if ( requisitionMessages == null ) {
            return null;
        }
        Employee commenter = requisitionMessages.getCommenter();
        if ( commenter == null ) {
            return null;
        }
        String fullName = commenter.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long requisitionMessagesCommenterId(RequisitionMessages requisitionMessages) {
        if ( requisitionMessages == null ) {
            return null;
        }
        Employee commenter = requisitionMessages.getCommenter();
        if ( commenter == null ) {
            return null;
        }
        Long id = commenter.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
