package PlacementData.Placementcall2;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@Autowired
	UserService service;
	@Autowired
	CompanyService service1;
	@Autowired
	AdminService service2;
	
	@RequestMapping("/")
	public String test(Model model)
	{
           List<User> listUsers=service.listAll();
		   System.out.println(listUsers);
		   model.addAttribute("listUsers", listUsers );
		   List<Company> listCompany=service1.listAll();
		   System.out.println(listCompany);
		   model.addAttribute("listCompany", listCompany);
		   return "index";
	}

   @RequestMapping("/new")
	public String index(Model model)
	{
		System.out.println("index");
		User login = new User();
		Admin admin=new Admin();
		model.addAttribute("user",login );
		model.addAttribute("admin", admin);
		return "login";
	}
    
   
	@RequestMapping("/reg")
	public String showpage(Model model)
	{
		System.out.println("index");
		User user=new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	@RequestMapping("/list")
	public String create(Model model)
	{
		
		List<User> user = service.listAll();
		model.addAttribute("user", user);
		return "userlist";
	}
	
	@RequestMapping("/listc")
	public String created(Model model)
	{
		
		List<Company> company = service1.listAll();
		model.addAttribute("company", company);
		return "companylist";
	}
	
	
	@PostMapping("/reg")
	public String submitForm(@Valid @ModelAttribute("user")User user,BindingResult result ,Model model)
	{
		System.out.println(user);
		if(result.hasErrors())
		{
			return "register";
		}
		else
		{
			service.save(user);
			return "login";
		}
	}
	@RequestMapping("/comregister")
	public String showview(Model model)
	{
		System.out.println("index");
		Company company=new Company();
		model.addAttribute("company", company);
		return "companyreg";
}
	
	@PostMapping("/comregister")
	public String comRegister(@Valid @ModelAttribute("company")Company company,BindingResult result ,Model model)
	{
		System.out.println(company);
		if(result.hasErrors())
		{
			return "companyreg";
		}
		else
		{
			service1.save(company);
			return "index";
		}
	}
	

	@RequestMapping("/adminreg")
	public String show(Model model)
	{
		System.out.println("index");
		Admin admin=new Admin();
		model.addAttribute("admin", admin);
		return "adminreg";
	
}
	@PostMapping("/adminreg")
	public String adminReg(@Valid @ModelAttribute("admin")Admin admin,BindingResult result ,Model model)
	{
		System.out.println(admin);
		if(result.hasErrors())
		{
			return "adminreg";
		}
		else
		{
			service2.save(admin);
			return "index";
		}
	
}
}
