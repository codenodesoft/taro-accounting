package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.Quotation;
import org.soptorshi.domain.QuotationDetails;
import org.soptorshi.domain.RequisitionDetails;
import org.soptorshi.service.dto.QuotationDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class QuotationDetailsMapperImpl implements QuotationDetailsMapper {

    @Autowired
    private QuotationMapper quotationMapper;
    @Autowired
    private RequisitionDetailsMapper requisitionDetailsMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<QuotationDetails> toEntity(List<QuotationDetailsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<QuotationDetails> list = new ArrayList<QuotationDetails>( dtoList.size() );
        for ( QuotationDetailsDTO quotationDetailsDTO : dtoList ) {
            list.add( toEntity( quotationDetailsDTO ) );
        }

        return list;
    }

    @Override
    public List<QuotationDetailsDTO> toDto(List<QuotationDetails> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<QuotationDetailsDTO> list = new ArrayList<QuotationDetailsDTO>( entityList.size() );
        for ( QuotationDetails quotationDetails : entityList ) {
            list.add( toDto( quotationDetails ) );
        }

        return list;
    }

    @Override
    public QuotationDetailsDTO toDto(QuotationDetails quotationDetails) {
        if ( quotationDetails == null ) {
            return null;
        }

        QuotationDetailsDTO quotationDetailsDTO = new QuotationDetailsDTO();

        String quotationNo = quotationDetailsQuotationQuotationNo( quotationDetails );
        if ( quotationNo != null ) {
            quotationDetailsDTO.setQuotationQuotationNo( quotationNo );
        }
        Long id = quotationDetailsRequisitionDetailsId( quotationDetails );
        if ( id != null ) {
            quotationDetailsDTO.setRequisitionDetailsId( id );
        }
        Long id1 = quotationDetailsProductId( quotationDetails );
        if ( id1 != null ) {
            quotationDetailsDTO.setProductId( id1 );
        }
        Long id2 = quotationDetailsQuotationId( quotationDetails );
        if ( id2 != null ) {
            quotationDetailsDTO.setQuotationId( id2 );
        }
        String name = quotationDetailsProductName( quotationDetails );
        if ( name != null ) {
            quotationDetailsDTO.setProductName( name );
        }
        quotationDetailsDTO.setId( quotationDetails.getId() );
        quotationDetailsDTO.setCurrency( quotationDetails.getCurrency() );
        quotationDetailsDTO.setRate( quotationDetails.getRate() );
        quotationDetailsDTO.setUnitOfMeasurements( quotationDetails.getUnitOfMeasurements() );
        quotationDetailsDTO.setQuantity( quotationDetails.getQuantity() );
        quotationDetailsDTO.setPayType( quotationDetails.getPayType() );
        quotationDetailsDTO.setCreditLimit( quotationDetails.getCreditLimit() );
        quotationDetailsDTO.setVatStatus( quotationDetails.getVatStatus() );
        quotationDetailsDTO.setVatPercentage( quotationDetails.getVatPercentage() );
        quotationDetailsDTO.setAitStatus( quotationDetails.getAitStatus() );
        quotationDetailsDTO.setAitPercentage( quotationDetails.getAitPercentage() );
        quotationDetailsDTO.setEstimatedDate( quotationDetails.getEstimatedDate() );
        quotationDetailsDTO.setWarrantyStatus( quotationDetails.getWarrantyStatus() );
        quotationDetailsDTO.setLoadingPort( quotationDetails.getLoadingPort() );
        quotationDetailsDTO.setRemarks( quotationDetails.getRemarks() );
        quotationDetailsDTO.setModifiedBy( quotationDetails.getModifiedBy() );
        quotationDetailsDTO.setModifiedOn( quotationDetails.getModifiedOn() );

        return quotationDetailsDTO;
    }

    @Override
    public QuotationDetails toEntity(QuotationDetailsDTO quotationDetailsDTO) {
        if ( quotationDetailsDTO == null ) {
            return null;
        }

        QuotationDetails quotationDetails = new QuotationDetails();

        quotationDetails.setProduct( productMapper.fromId( quotationDetailsDTO.getProductId() ) );
        quotationDetails.setRequisitionDetails( requisitionDetailsMapper.fromId( quotationDetailsDTO.getRequisitionDetailsId() ) );
        quotationDetails.setQuotation( quotationMapper.fromId( quotationDetailsDTO.getQuotationId() ) );
        quotationDetails.setId( quotationDetailsDTO.getId() );
        quotationDetails.setCurrency( quotationDetailsDTO.getCurrency() );
        quotationDetails.setRate( quotationDetailsDTO.getRate() );
        quotationDetails.setUnitOfMeasurements( quotationDetailsDTO.getUnitOfMeasurements() );
        quotationDetails.setQuantity( quotationDetailsDTO.getQuantity() );
        quotationDetails.setPayType( quotationDetailsDTO.getPayType() );
        quotationDetails.setCreditLimit( quotationDetailsDTO.getCreditLimit() );
        quotationDetails.setVatStatus( quotationDetailsDTO.getVatStatus() );
        quotationDetails.setVatPercentage( quotationDetailsDTO.getVatPercentage() );
        quotationDetails.setAitStatus( quotationDetailsDTO.getAitStatus() );
        quotationDetails.setAitPercentage( quotationDetailsDTO.getAitPercentage() );
        quotationDetails.setEstimatedDate( quotationDetailsDTO.getEstimatedDate() );
        quotationDetails.setWarrantyStatus( quotationDetailsDTO.getWarrantyStatus() );
        quotationDetails.setLoadingPort( quotationDetailsDTO.getLoadingPort() );
        quotationDetails.setRemarks( quotationDetailsDTO.getRemarks() );
        quotationDetails.setModifiedBy( quotationDetailsDTO.getModifiedBy() );
        quotationDetails.setModifiedOn( quotationDetailsDTO.getModifiedOn() );

        return quotationDetails;
    }

    private String quotationDetailsQuotationQuotationNo(QuotationDetails quotationDetails) {
        if ( quotationDetails == null ) {
            return null;
        }
        Quotation quotation = quotationDetails.getQuotation();
        if ( quotation == null ) {
            return null;
        }
        String quotationNo = quotation.getQuotationNo();
        if ( quotationNo == null ) {
            return null;
        }
        return quotationNo;
    }

    private Long quotationDetailsRequisitionDetailsId(QuotationDetails quotationDetails) {
        if ( quotationDetails == null ) {
            return null;
        }
        RequisitionDetails requisitionDetails = quotationDetails.getRequisitionDetails();
        if ( requisitionDetails == null ) {
            return null;
        }
        Long id = requisitionDetails.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long quotationDetailsProductId(QuotationDetails quotationDetails) {
        if ( quotationDetails == null ) {
            return null;
        }
        Product product = quotationDetails.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long quotationDetailsQuotationId(QuotationDetails quotationDetails) {
        if ( quotationDetails == null ) {
            return null;
        }
        Quotation quotation = quotationDetails.getQuotation();
        if ( quotation == null ) {
            return null;
        }
        Long id = quotation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String quotationDetailsProductName(QuotationDetails quotationDetails) {
        if ( quotationDetails == null ) {
            return null;
        }
        Product product = quotationDetails.getProduct();
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
