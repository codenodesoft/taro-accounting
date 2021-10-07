package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.AccountBalance;
import org.soptorshi.domain.MonthlyBalance;
import org.soptorshi.service.dto.MonthlyBalanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class MonthlyBalanceMapperImpl implements MonthlyBalanceMapper {

    @Autowired
    private AccountBalanceMapper accountBalanceMapper;

    @Override
    public List<MonthlyBalance> toEntity(List<MonthlyBalanceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<MonthlyBalance> list = new ArrayList<MonthlyBalance>( dtoList.size() );
        for ( MonthlyBalanceDTO monthlyBalanceDTO : dtoList ) {
            list.add( toEntity( monthlyBalanceDTO ) );
        }

        return list;
    }

    @Override
    public List<MonthlyBalanceDTO> toDto(List<MonthlyBalance> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MonthlyBalanceDTO> list = new ArrayList<MonthlyBalanceDTO>( entityList.size() );
        for ( MonthlyBalance monthlyBalance : entityList ) {
            list.add( toDto( monthlyBalance ) );
        }

        return list;
    }

    @Override
    public MonthlyBalanceDTO toDto(MonthlyBalance monthlyBalance) {
        if ( monthlyBalance == null ) {
            return null;
        }

        MonthlyBalanceDTO monthlyBalanceDTO = new MonthlyBalanceDTO();

        Long id = monthlyBalanceAccountBalanceId( monthlyBalance );
        if ( id != null ) {
            monthlyBalanceDTO.setAccountBalanceId( id );
        }
        monthlyBalanceDTO.setId( monthlyBalance.getId() );
        monthlyBalanceDTO.setMonthType( monthlyBalance.getMonthType() );
        monthlyBalanceDTO.setTotMonthDbBal( monthlyBalance.getTotMonthDbBal() );
        monthlyBalanceDTO.setTotMonthCrBal( monthlyBalance.getTotMonthCrBal() );
        monthlyBalanceDTO.setModifiedBy( monthlyBalance.getModifiedBy() );
        monthlyBalanceDTO.setModifiedOn( monthlyBalance.getModifiedOn() );

        return monthlyBalanceDTO;
    }

    @Override
    public MonthlyBalance toEntity(MonthlyBalanceDTO monthlyBalanceDTO) {
        if ( monthlyBalanceDTO == null ) {
            return null;
        }

        MonthlyBalance monthlyBalance = new MonthlyBalance();

        monthlyBalance.setAccountBalance( accountBalanceMapper.fromId( monthlyBalanceDTO.getAccountBalanceId() ) );
        monthlyBalance.setId( monthlyBalanceDTO.getId() );
        monthlyBalance.setMonthType( monthlyBalanceDTO.getMonthType() );
        monthlyBalance.setTotMonthDbBal( monthlyBalanceDTO.getTotMonthDbBal() );
        monthlyBalance.setTotMonthCrBal( monthlyBalanceDTO.getTotMonthCrBal() );
        monthlyBalance.setModifiedBy( monthlyBalanceDTO.getModifiedBy() );
        monthlyBalance.setModifiedOn( monthlyBalanceDTO.getModifiedOn() );

        return monthlyBalance;
    }

    private Long monthlyBalanceAccountBalanceId(MonthlyBalance monthlyBalance) {
        if ( monthlyBalance == null ) {
            return null;
        }
        AccountBalance accountBalance = monthlyBalance.getAccountBalance();
        if ( accountBalance == null ) {
            return null;
        }
        Long id = accountBalance.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
