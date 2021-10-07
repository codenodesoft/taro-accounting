package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.EmployeeStatus;
import org.soptorshi.domain.enumeration.EmploymentType;
import org.soptorshi.domain.enumeration.Gender;
import org.soptorshi.domain.enumeration.MaritalStatus;
import org.soptorshi.domain.enumeration.Religion;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, BigDecimal> hourlySalary;
	public static volatile SingularAttribute<Employee, String> fathersName;
	public static volatile SingularAttribute<Employee, Gender> gender;
	public static volatile SingularAttribute<Employee, String> bankAccountNo;
	public static volatile SingularAttribute<Employee, LocalDate> joiningDate;
	public static volatile SingularAttribute<Employee, String> bankName;
	public static volatile SingularAttribute<Employee, Office> office;
	public static volatile SingularAttribute<Employee, EmployeeStatus> employeeStatus;
	public static volatile SingularAttribute<Employee, String> reasonOfTermination;
	public static volatile SingularAttribute<Employee, LocalDate> terminationDate;
	public static volatile SingularAttribute<Employee, String> bloodGroup;
	public static volatile SingularAttribute<Employee, String> presentAddress;
	public static volatile SingularAttribute<Employee, String> tin;
	public static volatile SingularAttribute<Employee, String> contactNumber;
	public static volatile SingularAttribute<Employee, Long> id;
	public static volatile SingularAttribute<Employee, String> permanentAddress;
	public static volatile SingularAttribute<Employee, Department> department;
	public static volatile SingularAttribute<Employee, String> email;
	public static volatile SingularAttribute<Employee, Long> manager;
	public static volatile SingularAttribute<Employee, EmploymentType> employmentType;
	public static volatile SingularAttribute<Employee, String> emergencyContact;
	public static volatile SingularAttribute<Employee, String> nId;
	public static volatile SingularAttribute<Employee, String> fullName;
	public static volatile SingularAttribute<Employee, byte[]> photo;
	public static volatile SingularAttribute<Employee, String> employeeId;
	public static volatile SingularAttribute<Employee, LocalDate> birthDate;
	public static volatile SingularAttribute<Employee, Religion> religion;
	public static volatile SingularAttribute<Employee, String> mothersName;
	public static volatile SingularAttribute<Employee, Boolean> userAccount;
	public static volatile SingularAttribute<Employee, Designation> designation;
	public static volatile SingularAttribute<Employee, String> photoContentType;
	public static volatile SingularAttribute<Employee, MaritalStatus> maritalStatus;

}

