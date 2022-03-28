package PlacementData.Placementcall2;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User,Long>
{

	User findByUsernameAndPassword(String username, String password);
	
}
