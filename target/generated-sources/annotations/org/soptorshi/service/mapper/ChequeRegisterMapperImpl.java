package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.ChequeRegister;
import org.soptorshi.service.dto.ChequeRegisterDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ChequeRegisterMapperImpl implements ChequeRegisterMapper {

    @Override
    public ChequeRegister toEntity(ChequeRegisterDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ChequeRegister chequeRegister = new ChequeRegister();

        chequeRegister.setId( dto.getId() );
        chequeRegister.setChequeNo( dto.getChequeNo() );
        chequeRegister.setChequeDate( dto.getChequeDate() );
        chequeRegister.setStatus( dto.getStatus() );
        chequeRegister.setRealizationDate( dto.getRealizationDate() );
        chequeRegister.setModifiedBy( dto.getModifiedBy() );
        chequeRegister.setModifiedOn( dto.getModifiedOn() );

        return chequeRegister;
    }

    @Override
    public ChequeRegisterDTO toDto(ChequeRegister entity) {
        if ( entity == null ) {
            return null;
        }

        ChequeRegisterDTO chequeRegisterDTO = new ChequeRegisterDTO();

        chequeRegisterDTO.setId( entity.getId() );
        chequeRegisterDTO.setChequeNo( entity.getChequeNo() );
        chequeRegisterDTO.setChequeDate( entity.getChequeDate() );
        chequeRegisterDTO.setStatus( entity.getStatus() );
        chequeRegisterDTO.setRealizationDate( entity.getRealizationDate() );
        chequeRegisterDTO.setModifiedBy( entity.getModifiedBy() );
        chequeRegisterDTO.setModifiedOn( entity.getModifiedOn() );

        return chequeRegisterDTO;
    }

    @Override
    public List<ChequeRegister> toEntity(List<ChequeRegisterDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ChequeRegister> list = new ArrayList<ChequeRegister>( dtoList.size() );
        for ( ChequeRegisterDTO chequeRegisterDTO : dtoList ) {
            list.add( toEntity( chequeRegisterDTO ) );
        }

        return list;
    }

    @Override
    public List<ChequeRegisterDTO> toDto(List<ChequeRegister> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ChequeRegisterDTO> list = new ArrayList<ChequeRegisterDTO>( entityList.size() );
        for ( ChequeRegister chequeRegister : entityList ) {
            list.add( toDto( chequeRegister ) );
        }

        return list;
    }
}
