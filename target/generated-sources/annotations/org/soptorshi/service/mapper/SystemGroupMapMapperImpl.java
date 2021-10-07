package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.MstGroup;
import org.soptorshi.domain.SystemGroupMap;
import org.soptorshi.service.dto.SystemGroupMapDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SystemGroupMapMapperImpl implements SystemGroupMapMapper {

    @Autowired
    private MstGroupMapper mstGroupMapper;

    @Override
    public List<SystemGroupMap> toEntity(List<SystemGroupMapDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SystemGroupMap> list = new ArrayList<SystemGroupMap>( dtoList.size() );
        for ( SystemGroupMapDTO systemGroupMapDTO : dtoList ) {
            list.add( toEntity( systemGroupMapDTO ) );
        }

        return list;
    }

    @Override
    public List<SystemGroupMapDTO> toDto(List<SystemGroupMap> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SystemGroupMapDTO> list = new ArrayList<SystemGroupMapDTO>( entityList.size() );
        for ( SystemGroupMap systemGroupMap : entityList ) {
            list.add( toDto( systemGroupMap ) );
        }

        return list;
    }

    @Override
    public SystemGroupMapDTO toDto(SystemGroupMap systemGroupMap) {
        if ( systemGroupMap == null ) {
            return null;
        }

        SystemGroupMapDTO systemGroupMapDTO = new SystemGroupMapDTO();

        String name = systemGroupMapGroupName( systemGroupMap );
        if ( name != null ) {
            systemGroupMapDTO.setGroupName( name );
        }
        Long id = systemGroupMapGroupId( systemGroupMap );
        if ( id != null ) {
            systemGroupMapDTO.setGroupId( id );
        }
        systemGroupMapDTO.setId( systemGroupMap.getId() );
        systemGroupMapDTO.setGroupType( systemGroupMap.getGroupType() );
        systemGroupMapDTO.setModifiedBy( systemGroupMap.getModifiedBy() );
        systemGroupMapDTO.setModifiedOn( systemGroupMap.getModifiedOn() );

        return systemGroupMapDTO;
    }

    @Override
    public SystemGroupMap toEntity(SystemGroupMapDTO systemGroupMapDTO) {
        if ( systemGroupMapDTO == null ) {
            return null;
        }

        SystemGroupMap systemGroupMap = new SystemGroupMap();

        systemGroupMap.setGroup( mstGroupMapper.fromId( systemGroupMapDTO.getGroupId() ) );
        systemGroupMap.setId( systemGroupMapDTO.getId() );
        systemGroupMap.setGroupType( systemGroupMapDTO.getGroupType() );
        systemGroupMap.setModifiedBy( systemGroupMapDTO.getModifiedBy() );
        systemGroupMap.setModifiedOn( systemGroupMapDTO.getModifiedOn() );

        return systemGroupMap;
    }

    private String systemGroupMapGroupName(SystemGroupMap systemGroupMap) {
        if ( systemGroupMap == null ) {
            return null;
        }
        MstGroup group = systemGroupMap.getGroup();
        if ( group == null ) {
            return null;
        }
        String name = group.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long systemGroupMapGroupId(SystemGroupMap systemGroupMap) {
        if ( systemGroupMap == null ) {
            return null;
        }
        MstGroup group = systemGroupMap.getGroup();
        if ( group == null ) {
            return null;
        }
        Long id = group.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
