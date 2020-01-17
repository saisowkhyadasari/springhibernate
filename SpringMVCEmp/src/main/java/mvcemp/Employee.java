package mvcemp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="emp")
@Component
public class Employee {
	@Id
	private int empno;
	@Column(length=20)
	private String ename;
	
	private double sal;
	
 @Column(length=20)
	private String job;
 private int mgr;
 @Column(length=20)
 private String hiredate;
 public String getHiredate() {
	return hiredate;
}
public void setHiredate(String hiredate) {
	this.hiredate = hiredate;
}
private int comm;
 private int deptno;
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public int getMgr() {
	return mgr;
}
public void setMgr(int mgr) {
	this.mgr = mgr;
}
public int getComm() {
	return comm;
}
public void setComm(int comm) {
	this.comm = comm;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
}
