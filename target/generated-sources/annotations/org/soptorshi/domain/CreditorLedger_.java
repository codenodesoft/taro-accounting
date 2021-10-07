package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.BalanceType;
import org.soptorshi.domain.enumeration.BillClosingFlag;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CreditorLedger.class)
public abstract class CreditorLedger_ {

	public static volatile SingularAttribute<CreditorLedger, String> contCode;
	public static volatile SingularAttribute<CreditorLedger, BigDecimal> amount;
	public static volatile SingularAttribute<CreditorLedger, String> orderNo;
	public static volatile SingularAttribute<CreditorLedger, String> vatNo;
	public static volatile SingularAttribute<CreditorLedger, LocalDate> dueDate;
	public static volatile SingularAttribute<CreditorLedger, LocalDate> billDate;
	public static volatile SingularAttribute<CreditorLedger, Integer> serialNo;
	public static volatile SingularAttribute<CreditorLedger, BillClosingFlag> billClosingFlag;
	public static volatile SingularAttribute<CreditorLedger, LocalDate> modifiedOn;
	public static volatile SingularAttribute<CreditorLedger, BalanceType> balanceType;
	public static volatile SingularAttribute<CreditorLedger, Vendor> vendor;
	public static volatile SingularAttribute<CreditorLedger, String> modifiedBy;
	public static volatile SingularAttribute<CreditorLedger, Long> id;
	public static volatile SingularAttribute<CreditorLedger, String> billNo;
	public static volatile SingularAttribute<CreditorLedger, BigDecimal> paidAmount;

}

