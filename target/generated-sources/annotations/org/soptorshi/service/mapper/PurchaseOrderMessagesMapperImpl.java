package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.PurchaseOrder;
import org.soptorshi.domain.PurchaseOrderMessages;
import org.soptorshi.service.dto.PurchaseOrderMessagesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class PurchaseOrderMessagesMapperImpl implements PurchaseOrderMessagesMapper {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;

    @Override
    public List<PurchaseOrderMessages> toEntity(List<PurchaseOrderMessagesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PurchaseOrderMessages> list = new ArrayList<PurchaseOrderMessages>( dtoList.size() );
        for ( PurchaseOrderMessagesDTO purchaseOrderMessagesDTO : dtoList ) {
            list.add( toEntity( purchaseOrderMessagesDTO ) );
        }

        return list;
    }

    @Override
    public List<PurchaseOrderMessagesDTO> toDto(List<PurchaseOrderMessages> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PurchaseOrderMessagesDTO> list = new ArrayList<PurchaseOrderMessagesDTO>( entityList.size() );
        for ( PurchaseOrderMessages purchaseOrderMessages : entityList ) {
            list.add( toDto( purchaseOrderMessages ) );
        }

        return list;
    }

    @Override
    public PurchaseOrderMessagesDTO toDto(PurchaseOrderMessages purchaseOrderMessages) {
        if ( purchaseOrderMessages == null ) {
            return null;
        }

        PurchaseOrderMessagesDTO purchaseOrderMessagesDTO = new PurchaseOrderMessagesDTO();

        String fullName = purchaseOrderMessagesCommenterFullName( purchaseOrderMessages );
        if ( fullName != null ) {
            purchaseOrderMessagesDTO.setCommenterFullName( fullName );
        }
        Long id = purchaseOrderMessagesPurchaseOrderId( purchaseOrderMessages );
        if ( id != null ) {
            purchaseOrderMessagesDTO.setPurchaseOrderId( id );
        }
        Long id1 = purchaseOrderMessagesCommenterId( purchaseOrderMessages );
        if ( id1 != null ) {
            purchaseOrderMessagesDTO.setCommenterId( id1 );
        }
        purchaseOrderMessagesDTO.setId( purchaseOrderMessages.getId() );
        purchaseOrderMessagesDTO.setComments( purchaseOrderMessages.getComments() );
        purchaseOrderMessagesDTO.setCommentedOn( purchaseOrderMessages.getCommentedOn() );

        return purchaseOrderMessagesDTO;
    }

    @Override
    public PurchaseOrderMessages toEntity(PurchaseOrderMessagesDTO purchaseOrderMessagesDTO) {
        if ( purchaseOrderMessagesDTO == null ) {
            return null;
        }

        PurchaseOrderMessages purchaseOrderMessages = new PurchaseOrderMessages();

        purchaseOrderMessages.setPurchaseOrder( purchaseOrderMapper.fromId( purchaseOrderMessagesDTO.getPurchaseOrderId() ) );
        purchaseOrderMessages.setCommenter( employeeMapper.fromId( purchaseOrderMessagesDTO.getCommenterId() ) );
        purchaseOrderMessages.setId( purchaseOrderMessagesDTO.getId() );
        purchaseOrderMessages.setComments( purchaseOrderMessagesDTO.getComments() );
        purchaseOrderMessages.setCommentedOn( purchaseOrderMessagesDTO.getCommentedOn() );

        return purchaseOrderMessages;
    }

    private String purchaseOrderMessagesCommenterFullName(PurchaseOrderMessages purchaseOrderMessages) {
        if ( purchaseOrderMessages == null ) {
            return null;
        }
        Employee commenter = purchaseOrderMessages.getCommenter();
        if ( commenter == null ) {
            return null;
        }
        String fullName = commenter.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long purchaseOrderMessagesPurchaseOrderId(PurchaseOrderMessages purchaseOrderMessages) {
        if ( purchaseOrderMessages == null ) {
            return null;
        }
        PurchaseOrder purchaseOrder = purchaseOrderMessages.getPurchaseOrder();
        if ( purchaseOrder == null ) {
            return null;
        }
        Long id = purchaseOrder.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long purchaseOrderMessagesCommenterId(PurchaseOrderMessages purchaseOrderMessages) {
        if ( purchaseOrderMessages == null ) {
            return null;
        }
        Employee commenter = purchaseOrderMessages.getCommenter();
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
