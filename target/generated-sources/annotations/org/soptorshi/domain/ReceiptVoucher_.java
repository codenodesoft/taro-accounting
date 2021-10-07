package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.ApplicationType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ReceiptVoucher.class)
public abstract class ReceiptVoucher_ {

	public static volatile SingularAttribute<ReceiptVoucher, String> voucherNo;
	public static volatile SingularAttribute<ReceiptVoucher, ApplicationType> applicationType;
	public static volatile SingularAttribute<ReceiptVoucher, LocalDate> modifiedOn;
	public static volatile SingularAttribute<ReceiptVoucher, LocalDate> voucherDate;
	public static volatile SingularAttribute<ReceiptVoucher, LocalDate> postDate;
	public static volatile SingularAttribute<ReceiptVoucher, String> modifiedBy;
	public static volatile SingularAttribute<ReceiptVoucher, Long> id;
	public static volatile SingularAttribute<ReceiptVoucher, Long> applicationId;
	public static volatile SingularAttribute<ReceiptVoucher, MstAccount> account;

}

