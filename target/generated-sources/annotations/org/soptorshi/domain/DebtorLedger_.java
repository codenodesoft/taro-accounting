package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.BillClosingFlag;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DebtorLedger.class)
public abstract class DebtorLedger_ {

	public static volatile SingularAttribute<DebtorLedger, String> contCode;
	public static volatile SingularAttribute<DebtorLedger, BigDecimal> amount;
	public static volatile SingularAttribute<DebtorLedger, String> orderNo;
	public static volatile SingularAttribute<DebtorLedger, String> vatNo;
	public static volatile SingularAttribute<DebtorLedger, LocalDate> dueDate;
	public static volatile SingularAttribute<DebtorLedger, LocalDate> billDate;
	public static volatile SingularAttribute<DebtorLedger, String> serialNo;
	public static volatile SingularAttribute<DebtorLedger, BillClosingFlag> billClosingFlag;
	public static volatile SingularAttribute<DebtorLedger, LocalDate> modifiedOn;
	public static volatile SingularAttribute<DebtorLedger, String> modifiedBy;
	public static volatile SingularAttribute<DebtorLedger, Long> id;
	public static volatile SingularAttribute<DebtorLedger, String> billNo;
	public static volatile SingularAttribute<DebtorLedger, BigDecimal> paidAmount;
	public static volatile SingularAttribute<DebtorLedger, Customer> customer;

}

