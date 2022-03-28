package PlacementData.Placementcall2;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



    @Service
	@Transactional
	public class UserService {
	@Autowired
	private UserRepo repo;
	  
	  public User login(String username, String password) {
	  User user = repo.findByUsernameAndPassword(username, password);
	   return user;
	  }
	  public List<User> listAll()
		{
			return repo.findAll();
		}
	  
	  public void save(User user)
	  {
		  repo.save(user);
	  }
	}