package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.MstAccount;
import org.soptorshi.domain.MstGroup;
import org.soptorshi.service.dto.MstAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class MstAccountMapperImpl implements MstAccountMapper {

    @Autowired
    private MstGroupMapper mstGroupMapper;

    @Override
    public List<MstAccount> toEntity(List<MstAccountDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<MstAccount> list = new ArrayList<MstAccount>( dtoList.size() );
        for ( MstAccountDTO mstAccountDTO : dtoList ) {
            list.add( toEntity( mstAccountDTO ) );
        }

        return list;
    }

    @Override
    public List<MstAccountDTO> toDto(List<MstAccount> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MstAccountDTO> list = new ArrayList<MstAccountDTO>( entityList.size() );
        for ( MstAccount mstAccount : entityList ) {
            list.add( toDto( mstAccount ) );
        }

        return list;
    }

    @Override
    public MstAccountDTO toDto(MstAccount mstAccount) {
        if ( mstAccount == null ) {
            return null;
        }

        MstAccountDTO mstAccountDTO = new MstAccountDTO();

        String name = mstAccountGroupName( mstAccount );
        if ( name != null ) {
            mstAccountDTO.setGroupName( name );
        }
        Long id = mstAccountGroupId( mstAccount );
        if ( id != null ) {
            mstAccountDTO.setGroupId( id );
        }
        mstAccountDTO.setId( mstAccount.getId() );
        mstAccountDTO.setCode( mstAccount.getCode() );
        mstAccountDTO.setName( mstAccount.getName() );
        mstAccountDTO.setYearOpenBalance( mstAccount.getYearOpenBalance() );
        mstAccountDTO.setYearOpenBalanceType( mstAccount.getYearOpenBalanceType() );
        mstAccountDTO.setYearCloseBalance( mstAccount.getYearCloseBalance() );
        mstAccountDTO.setReservedFlag( mstAccount.getReservedFlag() );
        mstAccountDTO.setModifiedBy( mstAccount.getModifiedBy() );
        mstAccountDTO.setModifiedOn( mstAccount.getModifiedOn() );
        mstAccountDTO.setDepreciationRate( mstAccount.getDepreciationRate() );
        mstAccountDTO.setDepreciationType( mstAccount.getDepreciationType() );

        return mstAccountDTO;
    }

    @Override
    public MstAccount toEntity(MstAccountDTO mstAccountDTO) {
        if ( mstAccountDTO == null ) {
            return null;
        }

        MstAccount mstAccount = new MstAccount();

        mstAccount.setGroup( mstGroupMapper.fromId( mstAccountDTO.getGroupId() ) );
        mstAccount.setId( mstAccountDTO.getId() );
        mstAccount.setCode( mstAccountDTO.getCode() );
        mstAccount.setName( mstAccountDTO.getName() );
        mstAccount.setYearOpenBalance( mstAccountDTO.getYearOpenBalance() );
        mstAccount.setYearOpenBalanceType( mstAccountDTO.getYearOpenBalanceType() );
        mstAccount.setYearCloseBalance( mstAccountDTO.getYearCloseBalance() );
        mstAccount.setReservedFlag( mstAccountDTO.getReservedFlag() );
        mstAccount.setModifiedBy( mstAccountDTO.getModifiedBy() );
        mstAccount.setModifiedOn( mstAccountDTO.getModifiedOn() );
        mstAccount.setDepreciationRate( mstAccountDTO.getDepreciationRate() );
        mstAccount.setDepreciationType( mstAccountDTO.getDepreciationType() );

        return mstAccount;
    }

    private String mstAccountGroupName(MstAccount mstAccount) {
        if ( mstAccount == null ) {
            return null;
        }
        MstGroup group = mstAccount.getGroup();
        if ( group == null ) {
            return null;
        }
        String name = group.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long mstAccountGroupId(MstAccount mstAccount) {
        if ( mstAccount == null ) {
            return null;
        }
        MstGroup group = mstAccount.getGroup();
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
