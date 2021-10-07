package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Quotation;
import org.soptorshi.domain.Requisition;
import org.soptorshi.domain.Vendor;
import org.soptorshi.service.dto.QuotationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class QuotationMapperImpl implements QuotationMapper {

    @Autowired
    private RequisitionMapper requisitionMapper;
    @Autowired
    private VendorMapper vendorMapper;

    @Override
    public List<Quotation> toEntity(List<QuotationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Quotation> list = new ArrayList<Quotation>( dtoList.size() );
        for ( QuotationDTO quotationDTO : dtoList ) {
            list.add( toEntity( quotationDTO ) );
        }

        return list;
    }

    @Override
    public List<QuotationDTO> toDto(List<Quotation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<QuotationDTO> list = new ArrayList<QuotationDTO>( entityList.size() );
        for ( Quotation quotation : entityList ) {
            list.add( toDto( quotation ) );
        }

        return list;
    }

    @Override
    public QuotationDTO toDto(Quotation quotation) {
        if ( quotation == null ) {
            return null;
        }

        QuotationDTO quotationDTO = new QuotationDTO();

        Long id = quotationRequisitionId( quotation );
        if ( id != null ) {
            quotationDTO.setRequisitionId( id );
        }
        String companyName = quotationVendorCompanyName( quotation );
        if ( companyName != null ) {
            quotationDTO.setVendorCompanyName( companyName );
        }
        Long id1 = quotationVendorId( quotation );
        if ( id1 != null ) {
            quotationDTO.setVendorId( id1 );
        }
        String requisitionNo = quotationRequisitionRequisitionNo( quotation );
        if ( requisitionNo != null ) {
            quotationDTO.setRequisitionRequisitionNo( requisitionNo );
        }
        quotationDTO.setId( quotation.getId() );
        quotationDTO.setQuotationNo( quotation.getQuotationNo() );
        byte[] attachment = quotation.getAttachment();
        if ( attachment != null ) {
            quotationDTO.setAttachment( Arrays.copyOf( attachment, attachment.length ) );
        }
        quotationDTO.setAttachmentContentType( quotation.getAttachmentContentType() );
        quotationDTO.setSelectionStatus( quotation.getSelectionStatus() );
        quotationDTO.setTotalAmount( quotation.getTotalAmount() );
        quotationDTO.setModifiedBy( quotation.getModifiedBy() );
        quotationDTO.setModifiedOn( quotation.getModifiedOn() );

        return quotationDTO;
    }

    @Override
    public Quotation toEntity(QuotationDTO quotationDTO) {
        if ( quotationDTO == null ) {
            return null;
        }

        Quotation quotation = new Quotation();

        quotation.setRequisition( requisitionMapper.fromId( quotationDTO.getRequisitionId() ) );
        quotation.setVendor( vendorMapper.fromId( quotationDTO.getVendorId() ) );
        quotation.setId( quotationDTO.getId() );
        quotation.setQuotationNo( quotationDTO.getQuotationNo() );
        byte[] attachment = quotationDTO.getAttachment();
        if ( attachment != null ) {
            quotation.setAttachment( Arrays.copyOf( attachment, attachment.length ) );
        }
        quotation.setAttachmentContentType( quotationDTO.getAttachmentContentType() );
        quotation.setSelectionStatus( quotationDTO.getSelectionStatus() );
        quotation.setTotalAmount( quotationDTO.getTotalAmount() );
        quotation.setModifiedBy( quotationDTO.getModifiedBy() );
        quotation.setModifiedOn( quotationDTO.getModifiedOn() );

        return quotation;
    }

    private Long quotationRequisitionId(Quotation quotation) {
        if ( quotation == null ) {
            return null;
        }
        Requisition requisition = quotation.getRequisition();
        if ( requisition == null ) {
            return null;
        }
        Long id = requisition.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String quotationVendorCompanyName(Quotation quotation) {
        if ( quotation == null ) {
            return null;
        }
        Vendor vendor = quotation.getVendor();
        if ( vendor == null ) {
            return null;
        }
        String companyName = vendor.getCompanyName();
        if ( companyName == null ) {
            return null;
        }
        return companyName;
    }

    private Long quotationVendorId(Quotation quotation) {
        if ( quotation == null ) {
            return null;
        }
        Vendor vendor = quotation.getVendor();
        if ( vendor == null ) {
            return null;
        }
        Long id = vendor.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String quotationRequisitionRequisitionNo(Quotation quotation) {
        if ( quotation == null ) {
            return null;
        }
        Requisition requisition = quotation.getRequisition();
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
