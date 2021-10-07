package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.MstAccount;
import org.soptorshi.domain.SystemAccountMap;
import org.soptorshi.service.dto.SystemAccountMapDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SystemAccountMapMapperImpl implements SystemAccountMapMapper {

    @Autowired
    private MstAccountMapper mstAccountMapper;

    @Override
    public List<SystemAccountMap> toEntity(List<SystemAccountMapDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SystemAccountMap> list = new ArrayList<SystemAccountMap>( dtoList.size() );
        for ( SystemAccountMapDTO systemAccountMapDTO : dtoList ) {
            list.add( toEntity( systemAccountMapDTO ) );
        }

        return list;
    }

    @Override
    public List<SystemAccountMapDTO> toDto(List<SystemAccountMap> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SystemAccountMapDTO> list = new ArrayList<SystemAccountMapDTO>( entityList.size() );
        for ( SystemAccountMap systemAccountMap : entityList ) {
            list.add( toDto( systemAccountMap ) );
        }

        return list;
    }

    @Override
    public SystemAccountMapDTO toDto(SystemAccountMap systemAccountMap) {
        if ( systemAccountMap == null ) {
            return null;
        }

        SystemAccountMapDTO systemAccountMapDTO = new SystemAccountMapDTO();

        Long id = systemAccountMapAccountId( systemAccountMap );
        if ( id != null ) {
            systemAccountMapDTO.setAccountId( id );
        }
        String name = systemAccountMapAccountName( systemAccountMap );
        if ( name != null ) {
            systemAccountMapDTO.setAccountName( name );
        }
        systemAccountMapDTO.setId( systemAccountMap.getId() );
        systemAccountMapDTO.setAccountType( systemAccountMap.getAccountType() );
        systemAccountMapDTO.setModifiedBy( systemAccountMap.getModifiedBy() );
        systemAccountMapDTO.setModifiedOn( systemAccountMap.getModifiedOn() );

        return systemAccountMapDTO;
    }

    @Override
    public SystemAccountMap toEntity(SystemAccountMapDTO systemAccountMapDTO) {
        if ( systemAccountMapDTO == null ) {
            return null;
        }

        SystemAccountMap systemAccountMap = new SystemAccountMap();

        systemAccountMap.setAccount( mstAccountMapper.fromId( systemAccountMapDTO.getAccountId() ) );
        systemAccountMap.setId( systemAccountMapDTO.getId() );
        systemAccountMap.setAccountType( systemAccountMapDTO.getAccountType() );
        systemAccountMap.setModifiedBy( systemAccountMapDTO.getModifiedBy() );
        systemAccountMap.setModifiedOn( systemAccountMapDTO.getModifiedOn() );

        return systemAccountMap;
    }

    private Long systemAccountMapAccountId(SystemAccountMap systemAccountMap) {
        if ( systemAccountMap == null ) {
            return null;
        }
        MstAccount account = systemAccountMap.getAccount();
        if ( account == null ) {
            return null;
        }
        Long id = account.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String systemAccountMapAccountName(SystemAccountMap systemAccountMap) {
        if ( systemAccountMap == null ) {
            return null;
        }
        MstAccount account = systemAccountMap.getAccount();
        if ( account == null ) {
            return null;
        }
        String name = account.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
