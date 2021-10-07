package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.AccountBalance;
import org.soptorshi.domain.FinancialAccountYear;
import org.soptorshi.domain.MstAccount;
import org.soptorshi.service.dto.AccountBalanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class AccountBalanceMapperImpl implements AccountBalanceMapper {

    @Autowired
    private FinancialAccountYearMapper financialAccountYearMapper;
    @Autowired
    private MstAccountMapper mstAccountMapper;

    @Override
    public List<AccountBalance> toEntity(List<AccountBalanceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AccountBalance> list = new ArrayList<AccountBalance>( dtoList.size() );
        for ( AccountBalanceDTO accountBalanceDTO : dtoList ) {
            list.add( toEntity( accountBalanceDTO ) );
        }

        return list;
    }

    @Override
    public List<AccountBalanceDTO> toDto(List<AccountBalance> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AccountBalanceDTO> list = new ArrayList<AccountBalanceDTO>( entityList.size() );
        for ( AccountBalance accountBalance : entityList ) {
            list.add( toDto( accountBalance ) );
        }

        return list;
    }

    @Override
    public AccountBalanceDTO toDto(AccountBalance accountBalance) {
        if ( accountBalance == null ) {
            return null;
        }

        AccountBalanceDTO accountBalanceDTO = new AccountBalanceDTO();

        Long id = accountBalanceAccountId( accountBalance );
        if ( id != null ) {
            accountBalanceDTO.setAccountId( id );
        }
        Long id1 = accountBalanceFinancialAccountYearId( accountBalance );
        if ( id1 != null ) {
            accountBalanceDTO.setFinancialAccountYearId( id1 );
        }
        String durationStr = accountBalanceFinancialAccountYearDurationStr( accountBalance );
        if ( durationStr != null ) {
            accountBalanceDTO.setFinancialAccountYearDurationStr( durationStr );
        }
        String name = accountBalanceAccountName( accountBalance );
        if ( name != null ) {
            accountBalanceDTO.setAccountName( name );
        }
        accountBalanceDTO.setId( accountBalance.getId() );
        accountBalanceDTO.setYearOpenBalance( accountBalance.getYearOpenBalance() );
        accountBalanceDTO.setYearOpenBalanceType( accountBalance.getYearOpenBalanceType() );
        accountBalanceDTO.setTotDebitTrans( accountBalance.getTotDebitTrans() );
        accountBalanceDTO.setTotCreditTrans( accountBalance.getTotCreditTrans() );
        accountBalanceDTO.setModifiedOn( accountBalance.getModifiedOn() );
        accountBalanceDTO.setModifiedBy( accountBalance.getModifiedBy() );

        return accountBalanceDTO;
    }

    @Override
    public AccountBalance toEntity(AccountBalanceDTO accountBalanceDTO) {
        if ( accountBalanceDTO == null ) {
            return null;
        }

        AccountBalance accountBalance = new AccountBalance();

        accountBalance.setFinancialAccountYear( financialAccountYearMapper.fromId( accountBalanceDTO.getFinancialAccountYearId() ) );
        accountBalance.setAccount( mstAccountMapper.fromId( accountBalanceDTO.getAccountId() ) );
        accountBalance.setId( accountBalanceDTO.getId() );
        accountBalance.setYearOpenBalance( accountBalanceDTO.getYearOpenBalance() );
        accountBalance.setYearOpenBalanceType( accountBalanceDTO.getYearOpenBalanceType() );
        accountBalance.setTotDebitTrans( accountBalanceDTO.getTotDebitTrans() );
        accountBalance.setTotCreditTrans( accountBalanceDTO.getTotCreditTrans() );
        accountBalance.setModifiedOn( accountBalanceDTO.getModifiedOn() );
        accountBalance.setModifiedBy( accountBalanceDTO.getModifiedBy() );

        return accountBalance;
    }

    private Long accountBalanceAccountId(AccountBalance accountBalance) {
        if ( accountBalance == null ) {
            return null;
        }
        MstAccount account = accountBalance.getAccount();
        if ( account == null ) {
            return null;
        }
        Long id = account.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long accountBalanceFinancialAccountYearId(AccountBalance accountBalance) {
        if ( accountBalance == null ) {
            return null;
        }
        FinancialAccountYear financialAccountYear = accountBalance.getFinancialAccountYear();
        if ( financialAccountYear == null ) {
            return null;
        }
        Long id = financialAccountYear.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String accountBalanceFinancialAccountYearDurationStr(AccountBalance accountBalance) {
        if ( accountBalance == null ) {
            return null;
        }
        FinancialAccountYear financialAccountYear = accountBalance.getFinancialAccountYear();
        if ( financialAccountYear == null ) {
            return null;
        }
        String durationStr = financialAccountYear.getDurationStr();
        if ( durationStr == null ) {
            return null;
        }
        return durationStr;
    }

    private String accountBalanceAccountName(AccountBalance accountBalance) {
        if ( accountBalance == null ) {
            return null;
        }
        MstAccount account = accountBalance.getAccount();
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
