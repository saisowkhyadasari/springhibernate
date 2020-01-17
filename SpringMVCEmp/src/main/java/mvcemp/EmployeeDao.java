package mvcemp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDao {
@Autowired
SessionFactory sessionFactory;
public void addEmployee(Employee empl){
	Session session=sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(empl);
	tx.commit();
	session.close();
}
public List<Employee>getEmployee(){
	Session session=sessionFactory.openSession();
	@SuppressWarnings("unchecked")
	List<Employee>employeelist=session.createQuery("from Employee").list();
	return employeelist;
}
public void updateEmployee(Employee empl)
{
	Session session=sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	session.update(empl);
	tx.commit();
	session.close();
}
public void deleteEmployee(Employee empl)
{
	Session session=sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	session.delete(empl);
	tx.commit();
	session.close();
}

}
