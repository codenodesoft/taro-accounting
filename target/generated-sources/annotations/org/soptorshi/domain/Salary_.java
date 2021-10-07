package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.SalaryStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Salary.class)
public abstract class Salary_ {

	public static volatile SingularAttribute<Salary, LocalDate> endedOn;
	public static volatile SingularAttribute<Salary, LocalDate> modifiedOn;
	public static volatile SingularAttribute<Salary, BigDecimal> gross;
	public static volatile SingularAttribute<Salary, SalaryStatus> salaryStatus;
	public static volatile SingularAttribute<Salary, String> modifiedBy;
	public static volatile SingularAttribute<Salary, Long> id;
	public static volatile SingularAttribute<Salary, BigDecimal> basic;
	public static volatile SingularAttribute<Salary, Employee> employee;
	public static volatile SingularAttribute<Salary, LocalDate> startedOn;

}

