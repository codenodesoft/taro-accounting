package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DepartmentHead.class)
public abstract class DepartmentHead_ {

	public static volatile SingularAttribute<DepartmentHead, Long> id;
	public static volatile SingularAttribute<DepartmentHead, Office> office;
	public static volatile SingularAttribute<DepartmentHead, Department> department;
	public static volatile SingularAttribute<DepartmentHead, Employee> employee;

}

