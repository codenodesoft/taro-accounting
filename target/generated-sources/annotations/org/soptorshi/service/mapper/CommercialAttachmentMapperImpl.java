package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.CommercialAttachment;
import org.soptorshi.domain.CommercialPi;
import org.soptorshi.service.dto.CommercialAttachmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class CommercialAttachmentMapperImpl implements CommercialAttachmentMapper {

    @Autowired
    private CommercialPiMapper commercialPiMapper;

    @Override
    public List<CommercialAttachment> toEntity(List<CommercialAttachmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CommercialAttachment> list = new ArrayList<CommercialAttachment>( dtoList.size() );
        for ( CommercialAttachmentDTO commercialAttachmentDTO : dtoList ) {
            list.add( toEntity( commercialAttachmentDTO ) );
        }

        return list;
    }

    @Override
    public List<CommercialAttachmentDTO> toDto(List<CommercialAttachment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CommercialAttachmentDTO> list = new ArrayList<CommercialAttachmentDTO>( entityList.size() );
        for ( CommercialAttachment commercialAttachment : entityList ) {
            list.add( toDto( commercialAttachment ) );
        }

        return list;
    }

    @Override
    public CommercialAttachmentDTO toDto(CommercialAttachment commercialAttachment) {
        if ( commercialAttachment == null ) {
            return null;
        }

        CommercialAttachmentDTO commercialAttachmentDTO = new CommercialAttachmentDTO();

        Long id = commercialAttachmentCommercialPiId( commercialAttachment );
        if ( id != null ) {
            commercialAttachmentDTO.setCommercialPiId( id );
        }
        String proformaNo = commercialAttachmentCommercialPiProformaNo( commercialAttachment );
        if ( proformaNo != null ) {
            commercialAttachmentDTO.setCommercialPiProformaNo( proformaNo );
        }
        commercialAttachmentDTO.setId( commercialAttachment.getId() );
        byte[] file = commercialAttachment.getFile();
        if ( file != null ) {
            commercialAttachmentDTO.setFile( Arrays.copyOf( file, file.length ) );
        }
        commercialAttachmentDTO.setFileContentType( commercialAttachment.getFileContentType() );

        return commercialAttachmentDTO;
    }

    @Override
    public CommercialAttachment toEntity(CommercialAttachmentDTO commercialAttachmentDTO) {
        if ( commercialAttachmentDTO == null ) {
            return null;
        }

        CommercialAttachment commercialAttachment = new CommercialAttachment();

        commercialAttachment.setCommercialPi( commercialPiMapper.fromId( commercialAttachmentDTO.getCommercialPiId() ) );
        commercialAttachment.setId( commercialAttachmentDTO.getId() );
        byte[] file = commercialAttachmentDTO.getFile();
        if ( file != null ) {
            commercialAttachment.setFile( Arrays.copyOf( file, file.length ) );
        }
        commercialAttachment.setFileContentType( commercialAttachmentDTO.getFileContentType() );

        return commercialAttachment;
    }

    private Long commercialAttachmentCommercialPiId(CommercialAttachment commercialAttachment) {
        if ( commercialAttachment == null ) {
            return null;
        }
        CommercialPi commercialPi = commercialAttachment.getCommercialPi();
        if ( commercialPi == null ) {
            return null;
        }
        Long id = commercialPi.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String commercialAttachmentCommercialPiProformaNo(CommercialAttachment commercialAttachment) {
        if ( commercialAttachment == null ) {
            return null;
        }
        CommercialPi commercialPi = commercialAttachment.getCommercialPi();
        if ( commercialPi == null ) {
            return null;
        }
        String proformaNo = commercialPi.getProformaNo();
        if ( proformaNo == null ) {
            return null;
        }
        return proformaNo;
    }
}
