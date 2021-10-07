package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.ApplicationType;
import org.soptorshi.domain.enumeration.VoucherReferenceType;
import org.soptorshi.domain.enumeration.VoucherType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(JournalVoucher.class)
public abstract class JournalVoucher_ {

	public static volatile SingularAttribute<JournalVoucher, ApplicationType> applicationType;
	public static volatile SingularAttribute<JournalVoucher, BigDecimal> conversionFactor;
	public static volatile SingularAttribute<JournalVoucher, VoucherType> type;
	public static volatile SingularAttribute<JournalVoucher, Long> referenceId;
	public static volatile SingularAttribute<JournalVoucher, String> voucherNo;
	public static volatile SingularAttribute<JournalVoucher, VoucherReferenceType> reference;
	public static volatile SingularAttribute<JournalVoucher, LocalDate> modifiedOn;
	public static volatile SingularAttribute<JournalVoucher, LocalDate> voucherDate;
	public static volatile SingularAttribute<JournalVoucher, LocalDate> postDate;
	public static volatile SingularAttribute<JournalVoucher, String> modifiedBy;
	public static volatile SingularAttribute<JournalVoucher, Currency> currency;
	public static volatile SingularAttribute<JournalVoucher, Long> id;
	public static volatile SingularAttribute<JournalVoucher, Long> applicationId;

}

