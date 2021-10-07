package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.DepreciationMap;
import org.soptorshi.service.dto.DepreciationMapDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class DepreciationMapMapperImpl implements DepreciationMapMapper {

    @Override
    public DepreciationMap toEntity(DepreciationMapDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DepreciationMap depreciationMap = new DepreciationMap();

        depreciationMap.setId( dto.getId() );
        depreciationMap.setDepreciationAccountId( dto.getDepreciationAccountId() );
        depreciationMap.setDepreciationAccountName( dto.getDepreciationAccountName() );
        depreciationMap.setAccountId( dto.getAccountId() );
        depreciationMap.setAccountName( dto.getAccountName() );
        depreciationMap.setCreatedBy( dto.getCreatedBy() );
        depreciationMap.setCreatedOn( dto.getCreatedOn() );
        depreciationMap.setModifiedBy( dto.getModifiedBy() );
        depreciationMap.setModifiedOn( dto.getModifiedOn() );

        return depreciationMap;
    }

    @Override
    public DepreciationMapDTO toDto(DepreciationMap entity) {
        if ( entity == null ) {
            return null;
        }

        DepreciationMapDTO depreciationMapDTO = new DepreciationMapDTO();

        depreciationMapDTO.setId( entity.getId() );
        depreciationMapDTO.setDepreciationAccountId( entity.getDepreciationAccountId() );
        depreciationMapDTO.setDepreciationAccountName( entity.getDepreciationAccountName() );
        depreciationMapDTO.setAccountId( entity.getAccountId() );
        depreciationMapDTO.setAccountName( entity.getAccountName() );
        depreciationMapDTO.setCreatedBy( entity.getCreatedBy() );
        depreciationMapDTO.setCreatedOn( entity.getCreatedOn() );
        depreciationMapDTO.setModifiedBy( entity.getModifiedBy() );
        depreciationMapDTO.setModifiedOn( entity.getModifiedOn() );

        return depreciationMapDTO;
    }

    @Override
    public List<DepreciationMap> toEntity(List<DepreciationMapDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DepreciationMap> list = new ArrayList<DepreciationMap>( dtoList.size() );
        for ( DepreciationMapDTO depreciationMapDTO : dtoList ) {
            list.add( toEntity( depreciationMapDTO ) );
        }

        return list;
    }

    @Override
    public List<DepreciationMapDTO> toDto(List<DepreciationMap> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DepreciationMapDTO> list = new ArrayList<DepreciationMapDTO>( entityList.size() );
        for ( DepreciationMap depreciationMap : entityList ) {
            list.add( toDto( depreciationMap ) );
        }

        return list;
    }
}
