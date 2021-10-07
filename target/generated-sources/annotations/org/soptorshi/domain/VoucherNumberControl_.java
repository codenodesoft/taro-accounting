package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.VoucherResetBasis;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VoucherNumberControl.class)
public abstract class VoucherNumberControl_ {

	public static volatile SingularAttribute<VoucherNumberControl, LocalDate> modifiedOn;
	public static volatile SingularAttribute<VoucherNumberControl, BigDecimal> voucherLimit;
	public static volatile SingularAttribute<VoucherNumberControl, Voucher> voucher;
	public static volatile SingularAttribute<VoucherNumberControl, String> modifiedBy;
	public static volatile SingularAttribute<VoucherNumberControl, Long> id;
	public static volatile SingularAttribute<VoucherNumberControl, VoucherResetBasis> resetBasis;
	public static volatile SingularAttribute<VoucherNumberControl, Integer> startVoucherNo;
	public static volatile SingularAttribute<VoucherNumberControl, FinancialAccountYear> financialAccountYear;

}

