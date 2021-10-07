package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.ProvidentFundStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProvidentFund.class)
public abstract class ProvidentFund_ {

	public static volatile SingularAttribute<ProvidentFund, LocalDate> modifiedOn;
	public static volatile SingularAttribute<ProvidentFund, Double> rate;
	public static volatile SingularAttribute<ProvidentFund, String> modifiedBy;
	public static volatile SingularAttribute<ProvidentFund, Long> id;
	public static volatile SingularAttribute<ProvidentFund, Employee> employee;
	public static volatile SingularAttribute<ProvidentFund, LocalDate> startDate;
	public static volatile SingularAttribute<ProvidentFund, ProvidentFundStatus> status;

}

