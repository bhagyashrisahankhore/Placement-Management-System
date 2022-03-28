package PlacementData.Placementcall2;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class AdminService {

	@Autowired
	private AdminRepository repository;
	  
		
	  @Autowired
	    public AdminService(AdminRepository repository) { 
	      this.repository=repository;
	    }
	    
	  public Admin login(String username, String password) {
		  Admin admin = repository.findByUsernameAndPassword(username, password);
		   return admin;
		  }
		  public List<Admin> listAll()
			{
				return repository.findAll();
			}

		public void save(@Valid Admin admin) {
			
			repository.save(admin);
		}
		
}
