package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.VoucherType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VoucherNumberGenerator.class)
public abstract class VoucherNumberGenerator_ {

	public static volatile SingularAttribute<VoucherNumberGenerator, VoucherType> voucherType;
	public static volatile SingularAttribute<VoucherNumberGenerator, Integer> voucherNumber;
	public static volatile SingularAttribute<VoucherNumberGenerator, Long> id;
	public static volatile SingularAttribute<VoucherNumberGenerator, FinancialAccountYear> financialAccountYear;

}

