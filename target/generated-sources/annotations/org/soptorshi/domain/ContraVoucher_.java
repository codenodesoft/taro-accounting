package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.ApplicationType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ContraVoucher.class)
public abstract class ContraVoucher_ {

	public static volatile SingularAttribute<ContraVoucher, String> voucherNo;
	public static volatile SingularAttribute<ContraVoucher, ApplicationType> applicationType;
	public static volatile SingularAttribute<ContraVoucher, LocalDate> modifiedOn;
	public static volatile SingularAttribute<ContraVoucher, BigDecimal> conversionFactor;
	public static volatile SingularAttribute<ContraVoucher, LocalDate> voucherDate;
	public static volatile SingularAttribute<ContraVoucher, LocalDate> postDate;
	public static volatile SingularAttribute<ContraVoucher, String> modifiedBy;
	public static volatile SingularAttribute<ContraVoucher, Currency> currency;
	public static volatile SingularAttribute<ContraVoucher, Long> id;
	public static volatile SingularAttribute<ContraVoucher, Long> applicationId;

}

