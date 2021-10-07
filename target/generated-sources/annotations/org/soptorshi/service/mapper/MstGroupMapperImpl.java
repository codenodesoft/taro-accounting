package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.MstGroup;
import org.soptorshi.service.dto.MstGroupDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class MstGroupMapperImpl implements MstGroupMapper {

    @Override
    public MstGroup toEntity(MstGroupDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MstGroup mstGroup = new MstGroup();

        mstGroup.setId( dto.getId() );
        mstGroup.setName( dto.getName() );
        mstGroup.setMainGroup( dto.getMainGroup() );
        mstGroup.setReservedFlag( dto.getReservedFlag() );
        mstGroup.setModifiedBy( dto.getModifiedBy() );
        mstGroup.setModifiedOn( dto.getModifiedOn() );

        return mstGroup;
    }

    @Override
    public MstGroupDTO toDto(MstGroup entity) {
        if ( entity == null ) {
            return null;
        }

        MstGroupDTO mstGroupDTO = new MstGroupDTO();

        mstGroupDTO.setId( entity.getId() );
        mstGroupDTO.setName( entity.getName() );
        mstGroupDTO.setMainGroup( entity.getMainGroup() );
        mstGroupDTO.setReservedFlag( entity.getReservedFlag() );
        mstGroupDTO.setModifiedBy( entity.getModifiedBy() );
        mstGroupDTO.setModifiedOn( entity.getModifiedOn() );

        return mstGroupDTO;
    }

    @Override
    public List<MstGroup> toEntity(List<MstGroupDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<MstGroup> list = new ArrayList<MstGroup>( dtoList.size() );
        for ( MstGroupDTO mstGroupDTO : dtoList ) {
            list.add( toEntity( mstGroupDTO ) );
        }

        return list;
    }

    @Override
    public List<MstGroupDTO> toDto(List<MstGroup> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MstGroupDTO> list = new ArrayList<MstGroupDTO>( entityList.size() );
        for ( MstGroup mstGroup : entityList ) {
            list.add( toDto( mstGroup ) );
        }

        return list;
    }
}
