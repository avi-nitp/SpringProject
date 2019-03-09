package com.avinash.model;

public class Employee {
             private String eid;
             private String name;
             private String designation;
             private String dept;
             private long basic;
             
             
			public Employee() {
				super();
			}


			public Employee(String eid, String name, String designation, String dept, long basic) {
				super();
				this.eid = eid;
				this.name = name;
				this.designation = designation;
				this.dept = dept;
				this.basic = basic;
			}


			public String getEid() {
				return eid;
			}


			public void setEid(String eid) {
				this.eid = eid;
			}


			public String getName() {
				return name;
			}


			public void setName(String name) {
				this.name = name;
			}


			public String getDesignation() {
				return designation;
			}


			public void setDesignation(String designation) {
				this.designation = designation;
			}


			public String getDept() {
				return dept;
			}


			public void setDept(String dept) {
				this.dept = dept;
			}


			public long getBasic() {
				return basic;
			}


			public void setBasic(long basic) {
				this.basic = basic;
			}
             
             
}
