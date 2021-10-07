package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.BalanceType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AccountBalance.class)
public abstract class AccountBalance_ {

	public static volatile SingularAttribute<AccountBalance, LocalDate> modifiedOn;
	public static volatile SingularAttribute<AccountBalance, BalanceType> yearOpenBalanceType;
	public static volatile SingularAttribute<AccountBalance, BigDecimal> totDebitTrans;
	public static volatile SingularAttribute<AccountBalance, BigDecimal> yearOpenBalance;
	public static volatile SingularAttribute<AccountBalance, String> modifiedBy;
	public static volatile SingularAttribute<AccountBalance, Long> id;
	public static volatile SingularAttribute<AccountBalance, FinancialAccountYear> financialAccountYear;
	public static volatile SingularAttribute<AccountBalance, BigDecimal> totCreditTrans;
	public static volatile SingularAttribute<AccountBalance, MstAccount> account;

}

