package springmvc.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.Model.User;

@Repository
//@Transactional(readOnly = false)
public class UserDao {

	@Autowired
	private HibernateTemplate hiberTemp ;
	
	@Transactional
	public int saveUser(User user) {
		Integer id= (Integer) this.hiberTemp.save(user);
		return id;
	}
}
