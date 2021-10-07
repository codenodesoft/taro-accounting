package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.ApplicationType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PaymentVoucher.class)
public abstract class PaymentVoucher_ {

	public static volatile SingularAttribute<PaymentVoucher, String> voucherNo;
	public static volatile SingularAttribute<PaymentVoucher, ApplicationType> applicationType;
	public static volatile SingularAttribute<PaymentVoucher, LocalDate> modifiedOn;
	public static volatile SingularAttribute<PaymentVoucher, LocalDate> voucherDate;
	public static volatile SingularAttribute<PaymentVoucher, LocalDate> postDate;
	public static volatile SingularAttribute<PaymentVoucher, String> modifiedBy;
	public static volatile SingularAttribute<PaymentVoucher, Long> id;
	public static volatile SingularAttribute<PaymentVoucher, Long> applicationId;
	public static volatile SingularAttribute<PaymentVoucher, MstAccount> account;

}

