package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FamilyInformation.class)
public abstract class FamilyInformation_ {

	public static volatile SingularAttribute<FamilyInformation, String> name;
	public static volatile SingularAttribute<FamilyInformation, String> contactNumber;
	public static volatile SingularAttribute<FamilyInformation, Long> id;
	public static volatile SingularAttribute<FamilyInformation, Employee> employee;
	public static volatile SingularAttribute<FamilyInformation, String> relation;

}

