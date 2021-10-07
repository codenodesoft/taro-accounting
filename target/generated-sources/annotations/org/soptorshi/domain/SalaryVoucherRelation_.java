package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.MonthType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SalaryVoucherRelation.class)
public abstract class SalaryVoucherRelation_ {

	public static volatile SingularAttribute<SalaryVoucherRelation, String> voucherNo;
	public static volatile SingularAttribute<SalaryVoucherRelation, LocalDate> modifiedOn;
	public static volatile SingularAttribute<SalaryVoucherRelation, MonthType> month;
	public static volatile SingularAttribute<SalaryVoucherRelation, Integer> year;
	public static volatile SingularAttribute<SalaryVoucherRelation, String> modifiedBy;
	public static volatile SingularAttribute<SalaryVoucherRelation, Long> id;
	public static volatile SingularAttribute<SalaryVoucherRelation, Office> office;

}

