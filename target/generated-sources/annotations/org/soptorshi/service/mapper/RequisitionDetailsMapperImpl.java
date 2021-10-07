package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.domain.Requisition;
import org.soptorshi.domain.RequisitionDetails;
import org.soptorshi.service.dto.RequisitionDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class RequisitionDetailsMapperImpl implements RequisitionDetailsMapper {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private RequisitionMapper requisitionMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<RequisitionDetails> toEntity(List<RequisitionDetailsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<RequisitionDetails> list = new ArrayList<RequisitionDetails>( dtoList.size() );
        for ( RequisitionDetailsDTO requisitionDetailsDTO : dtoList ) {
            list.add( toEntity( requisitionDetailsDTO ) );
        }

        return list;
    }

    @Override
    public List<RequisitionDetailsDTO> toDto(List<RequisitionDetails> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RequisitionDetailsDTO> list = new ArrayList<RequisitionDetailsDTO>( entityList.size() );
        for ( RequisitionDetails requisitionDetails : entityList ) {
            list.add( toDto( requisitionDetails ) );
        }

        return list;
    }

    @Override
    public RequisitionDetailsDTO toDto(RequisitionDetails requisitionDetails) {
        if ( requisitionDetails == null ) {
            return null;
        }

        RequisitionDetailsDTO requisitionDetailsDTO = new RequisitionDetailsDTO();

        Long id = requisitionDetailsRequisitionId( requisitionDetails );
        if ( id != null ) {
            requisitionDetailsDTO.setRequisitionId( id );
        }
        Long id1 = requisitionDetailsProductCategoryId( requisitionDetails );
        if ( id1 != null ) {
            requisitionDetailsDTO.setProductCategoryId( id1 );
        }
        Long id2 = requisitionDetailsProductId( requisitionDetails );
        if ( id2 != null ) {
            requisitionDetailsDTO.setProductId( id2 );
        }
        String name = requisitionDetailsProductCategoryName( requisitionDetails );
        if ( name != null ) {
            requisitionDetailsDTO.setProductCategoryName( name );
        }
        String requisitionNo = requisitionDetailsRequisitionRequisitionNo( requisitionDetails );
        if ( requisitionNo != null ) {
            requisitionDetailsDTO.setRequisitionRequisitionNo( requisitionNo );
        }
        String name1 = requisitionDetailsProductName( requisitionDetails );
        if ( name1 != null ) {
            requisitionDetailsDTO.setProductName( name1 );
        }
        requisitionDetailsDTO.setId( requisitionDetails.getId() );
        requisitionDetailsDTO.setRequiredOn( requisitionDetails.getRequiredOn() );
        requisitionDetailsDTO.setEstimatedDate( requisitionDetails.getEstimatedDate() );
        requisitionDetailsDTO.setUom( requisitionDetails.getUom() );
        requisitionDetailsDTO.setUnit( requisitionDetails.getUnit() );
        requisitionDetailsDTO.setUnitPrice( requisitionDetails.getUnitPrice() );
        requisitionDetailsDTO.setQuantity( requisitionDetails.getQuantity() );
        requisitionDetailsDTO.setModifiedBy( requisitionDetails.getModifiedBy() );
        requisitionDetailsDTO.setModifiedOn( requisitionDetails.getModifiedOn() );

        return requisitionDetailsDTO;
    }

    @Override
    public RequisitionDetails toEntity(RequisitionDetailsDTO requisitionDetailsDTO) {
        if ( requisitionDetailsDTO == null ) {
            return null;
        }

        RequisitionDetails requisitionDetails = new RequisitionDetails();

        requisitionDetails.setProduct( productMapper.fromId( requisitionDetailsDTO.getProductId() ) );
        requisitionDetails.setRequisition( requisitionMapper.fromId( requisitionDetailsDTO.getRequisitionId() ) );
        requisitionDetails.setProductCategory( productCategoryMapper.fromId( requisitionDetailsDTO.getProductCategoryId() ) );
        requisitionDetails.setId( requisitionDetailsDTO.getId() );
        requisitionDetails.setRequiredOn( requisitionDetailsDTO.getRequiredOn() );
        requisitionDetails.setEstimatedDate( requisitionDetailsDTO.getEstimatedDate() );
        requisitionDetails.setUom( requisitionDetailsDTO.getUom() );
        requisitionDetails.setUnit( requisitionDetailsDTO.getUnit() );
        requisitionDetails.setUnitPrice( requisitionDetailsDTO.getUnitPrice() );
        requisitionDetails.setQuantity( requisitionDetailsDTO.getQuantity() );
        requisitionDetails.setModifiedBy( requisitionDetailsDTO.getModifiedBy() );
        requisitionDetails.setModifiedOn( requisitionDetailsDTO.getModifiedOn() );

        return requisitionDetails;
    }

    private Long requisitionDetailsRequisitionId(RequisitionDetails requisitionDetails) {
        if ( requisitionDetails == null ) {
            return null;
        }
        Requisition requisition = requisitionDetails.getRequisition();
        if ( requisition == null ) {
            return null;
        }
        Long id = requisition.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long requisitionDetailsProductCategoryId(RequisitionDetails requisitionDetails) {
        if ( requisitionDetails == null ) {
            return null;
        }
        ProductCategory productCategory = requisitionDetails.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        Long id = productCategory.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long requisitionDetailsProductId(RequisitionDetails requisitionDetails) {
        if ( requisitionDetails == null ) {
            return null;
        }
        Product product = requisitionDetails.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String requisitionDetailsProductCategoryName(RequisitionDetails requisitionDetails) {
        if ( requisitionDetails == null ) {
            return null;
        }
        ProductCategory productCategory = requisitionDetails.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        String name = productCategory.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String requisitionDetailsRequisitionRequisitionNo(RequisitionDetails requisitionDetails) {
        if ( requisitionDetails == null ) {
            return null;
        }
        Requisition requisition = requisitionDetails.getRequisition();
        if ( requisition == null ) {
            return null;
        }
        String requisitionNo = requisition.getRequisitionNo();
        if ( requisitionNo == null ) {
            return null;
        }
        return requisitionNo;
    }

    private String requisitionDetailsProductName(RequisitionDetails requisitionDetails) {
        if ( requisitionDetails == null ) {
            return null;
        }
        Product product = requisitionDetails.getProduct();
        if ( product == null ) {
            return null;
        }
        String name = product.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
