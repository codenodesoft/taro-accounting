package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Manager.class)
public abstract class Manager_ {

	public static volatile SingularAttribute<Manager, LocalDate> modifiedOn;
	public static volatile SingularAttribute<Manager, Long> parentEmployeeId;
	public static volatile SingularAttribute<Manager, String> modifiedBy;
	public static volatile SingularAttribute<Manager, Long> id;
	public static volatile SingularAttribute<Manager, Employee> employee;

}

