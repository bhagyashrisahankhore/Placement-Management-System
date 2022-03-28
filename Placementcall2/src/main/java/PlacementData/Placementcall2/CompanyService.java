package PlacementData.Placementcall2;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	  
		
	  @Autowired
	    public CompanyService(CompanyRepository companyRepository) { 
	      this.companyRepository = companyRepository;
	    }
	    
		public Company findByEmail(String email) {
			return CompanyRepository.findByEmail(email);
		}
		
	 
		public void saveUser(Company company) {
			companyRepository.save(company);
}

		public void saveCompany(Object company) {
			
			
		}

		public List<Company> listAll() {
			
			return companyRepository.findAll();
		}

		public void save(@Valid Company company) {
			companyRepository.save(company);
			
		}
}
