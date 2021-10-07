package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.BalanceType;
import org.soptorshi.domain.enumeration.InstrumentType;
import org.soptorshi.domain.enumeration.VoucherType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DtTransaction.class)
public abstract class DtTransaction_ {

	public static volatile SingularAttribute<DtTransaction, BigDecimal> amount;
	public static volatile SingularAttribute<DtTransaction, InstrumentType> instrumentType;
	public static volatile SingularAttribute<DtTransaction, Voucher> voucher;
	public static volatile SingularAttribute<DtTransaction, VoucherType> type;
	public static volatile SingularAttribute<DtTransaction, LocalDate> invoiceDate;
	public static volatile SingularAttribute<DtTransaction, String> instrumentNo;
	public static volatile SingularAttribute<DtTransaction, LocalDate> instrumentDate;
	public static volatile SingularAttribute<DtTransaction, Integer> serialNo;
	public static volatile SingularAttribute<DtTransaction, BigDecimal> convFactor;
	public static volatile SingularAttribute<DtTransaction, String> voucherNo;
	public static volatile SingularAttribute<DtTransaction, String> reference;
	public static volatile SingularAttribute<DtTransaction, LocalDate> modifiedOn;
	public static volatile SingularAttribute<DtTransaction, BalanceType> balanceType;
	public static volatile SingularAttribute<DtTransaction, String> narration;
	public static volatile SingularAttribute<DtTransaction, LocalDate> voucherDate;
	public static volatile SingularAttribute<DtTransaction, LocalDate> postDate;
	public static volatile SingularAttribute<DtTransaction, String> modifiedBy;
	public static volatile SingularAttribute<DtTransaction, Currency> currency;
	public static volatile SingularAttribute<DtTransaction, Long> id;
	public static volatile SingularAttribute<DtTransaction, String> invoiceNo;
	public static volatile SingularAttribute<DtTransaction, BigDecimal> fCurrency;
	public static volatile SingularAttribute<DtTransaction, MstAccount> account;

}

