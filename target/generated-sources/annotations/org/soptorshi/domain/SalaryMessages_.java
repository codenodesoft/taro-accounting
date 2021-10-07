package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SalaryMessages.class)
public abstract class SalaryMessages_ {

	public static volatile SingularAttribute<SalaryMessages, MonthlySalary> monthlySalary;
	public static volatile SingularAttribute<SalaryMessages, String> comments;
	public static volatile SingularAttribute<SalaryMessages, LocalDate> commentedOn;
	public static volatile SingularAttribute<SalaryMessages, Long> id;
	public static volatile SingularAttribute<SalaryMessages, Employee> commenter;

}

