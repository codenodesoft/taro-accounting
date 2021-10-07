package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Requisition;
import org.soptorshi.domain.WorkOrder;
import org.soptorshi.service.dto.WorkOrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:23+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class WorkOrderMapperImpl implements WorkOrderMapper {

    @Autowired
    private RequisitionMapper requisitionMapper;

    @Override
    public List<WorkOrder> toEntity(List<WorkOrderDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<WorkOrder> list = new ArrayList<WorkOrder>( dtoList.size() );
        for ( WorkOrderDTO workOrderDTO : dtoList ) {
            list.add( toEntity( workOrderDTO ) );
        }

        return list;
    }

    @Override
    public List<WorkOrderDTO> toDto(List<WorkOrder> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<WorkOrderDTO> list = new ArrayList<WorkOrderDTO>( entityList.size() );
        for ( WorkOrder workOrder : entityList ) {
            list.add( toDto( workOrder ) );
        }

        return list;
    }

    @Override
    public WorkOrderDTO toDto(WorkOrder workOrder) {
        if ( workOrder == null ) {
            return null;
        }

        WorkOrderDTO workOrderDTO = new WorkOrderDTO();

        Long id = workOrderRequisitionId( workOrder );
        if ( id != null ) {
            workOrderDTO.setRequisitionId( id );
        }
        String requisitionNo = workOrderRequisitionRequisitionNo( workOrder );
        if ( requisitionNo != null ) {
            workOrderDTO.setRequisitionRequisitionNo( requisitionNo );
        }
        workOrderDTO.setId( workOrder.getId() );
        workOrderDTO.setReferenceNo( workOrder.getReferenceNo() );
        workOrderDTO.setIssueDate( workOrder.getIssueDate() );
        workOrderDTO.setReferredTo( workOrder.getReferredTo() );
        workOrderDTO.setSubject( workOrder.getSubject() );
        workOrderDTO.setNote( workOrder.getNote() );
        workOrderDTO.setLaborOrOtherAmount( workOrder.getLaborOrOtherAmount() );
        workOrderDTO.setDiscount( workOrder.getDiscount() );
        workOrderDTO.setModifiedBy( workOrder.getModifiedBy() );
        workOrderDTO.setModifiedOn( workOrder.getModifiedOn() );

        return workOrderDTO;
    }

    @Override
    public WorkOrder toEntity(WorkOrderDTO workOrderDTO) {
        if ( workOrderDTO == null ) {
            return null;
        }

        WorkOrder workOrder = new WorkOrder();

        workOrder.setRequisition( requisitionMapper.fromId( workOrderDTO.getRequisitionId() ) );
        workOrder.setId( workOrderDTO.getId() );
        workOrder.setReferenceNo( workOrderDTO.getReferenceNo() );
        workOrder.setIssueDate( workOrderDTO.getIssueDate() );
        workOrder.setReferredTo( workOrderDTO.getReferredTo() );
        workOrder.setSubject( workOrderDTO.getSubject() );
        workOrder.setNote( workOrderDTO.getNote() );
        workOrder.setLaborOrOtherAmount( workOrderDTO.getLaborOrOtherAmount() );
        workOrder.setDiscount( workOrderDTO.getDiscount() );
        workOrder.setModifiedBy( workOrderDTO.getModifiedBy() );
        workOrder.setModifiedOn( workOrderDTO.getModifiedOn() );

        return workOrder;
    }

    private Long workOrderRequisitionId(WorkOrder workOrder) {
        if ( workOrder == null ) {
            return null;
        }
        Requisition requisition = workOrder.getRequisition();
        if ( requisition == null ) {
            return null;
        }
        Long id = requisition.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String workOrderRequisitionRequisitionNo(WorkOrder workOrder) {
        if ( workOrder == null ) {
            return null;
        }
        Requisition requisition = workOrder.getRequisition();
        if ( requisition == null ) {
            return null;
        }
        String requisitionNo = requisition.getRequisitionNo();
        if ( requisitionNo == null ) {
            return null;
        }
        return requisitionNo;
    }
}
