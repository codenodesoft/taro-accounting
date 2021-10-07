package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Designation;
import org.soptorshi.domain.DesignationWiseAllowance;
import org.soptorshi.service.dto.DesignationWiseAllowanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class DesignationWiseAllowanceMapperImpl implements DesignationWiseAllowanceMapper {

    @Autowired
    private DesignationMapper designationMapper;

    @Override
    public List<DesignationWiseAllowance> toEntity(List<DesignationWiseAllowanceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DesignationWiseAllowance> list = new ArrayList<DesignationWiseAllowance>( dtoList.size() );
        for ( DesignationWiseAllowanceDTO designationWiseAllowanceDTO : dtoList ) {
            list.add( toEntity( designationWiseAllowanceDTO ) );
        }

        return list;
    }

    @Override
    public List<DesignationWiseAllowanceDTO> toDto(List<DesignationWiseAllowance> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DesignationWiseAllowanceDTO> list = new ArrayList<DesignationWiseAllowanceDTO>( entityList.size() );
        for ( DesignationWiseAllowance designationWiseAllowance : entityList ) {
            list.add( toDto( designationWiseAllowance ) );
        }

        return list;
    }

    @Override
    public DesignationWiseAllowanceDTO toDto(DesignationWiseAllowance designationWiseAllowance) {
        if ( designationWiseAllowance == null ) {
            return null;
        }

        DesignationWiseAllowanceDTO designationWiseAllowanceDTO = new DesignationWiseAllowanceDTO();

        Long id = designationWiseAllowanceDesignationId( designationWiseAllowance );
        if ( id != null ) {
            designationWiseAllowanceDTO.setDesignationId( id );
        }
        designationWiseAllowanceDTO.setId( designationWiseAllowance.getId() );
        designationWiseAllowanceDTO.setAllowanceType( designationWiseAllowance.getAllowanceType() );
        designationWiseAllowanceDTO.setAllowanceCategory( designationWiseAllowance.getAllowanceCategory() );
        designationWiseAllowanceDTO.setAmount( designationWiseAllowance.getAmount() );
        designationWiseAllowanceDTO.setModifiedBy( designationWiseAllowance.getModifiedBy() );
        designationWiseAllowanceDTO.setModifiedOn( designationWiseAllowance.getModifiedOn() );

        return designationWiseAllowanceDTO;
    }

    @Override
    public DesignationWiseAllowance toEntity(DesignationWiseAllowanceDTO designationWiseAllowanceDTO) {
        if ( designationWiseAllowanceDTO == null ) {
            return null;
        }

        DesignationWiseAllowance designationWiseAllowance = new DesignationWiseAllowance();

        designationWiseAllowance.setDesignation( designationMapper.fromId( designationWiseAllowanceDTO.getDesignationId() ) );
        designationWiseAllowance.setId( designationWiseAllowanceDTO.getId() );
        designationWiseAllowance.setAllowanceType( designationWiseAllowanceDTO.getAllowanceType() );
        designationWiseAllowance.setAllowanceCategory( designationWiseAllowanceDTO.getAllowanceCategory() );
        designationWiseAllowance.setAmount( designationWiseAllowanceDTO.getAmount() );
        designationWiseAllowance.setModifiedBy( designationWiseAllowanceDTO.getModifiedBy() );
        designationWiseAllowance.setModifiedOn( designationWiseAllowanceDTO.getModifiedOn() );

        return designationWiseAllowance;
    }

    private Long designationWiseAllowanceDesignationId(DesignationWiseAllowance designationWiseAllowance) {
        if ( designationWiseAllowance == null ) {
            return null;
        }
        Designation designation = designationWiseAllowance.getDesignation();
        if ( designation == null ) {
            return null;
        }
        Long id = designation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
