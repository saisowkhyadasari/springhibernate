package mvcemp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao dao;
	@RequestMapping(value="/addemp",method=RequestMethod.GET)
	public String ShowAddEmployeeForm(){
		return "AddEmployee";
		}

	@RequestMapping(value="/addemp",method=RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("emp")Employee empl)
	{
		ModelAndView mav=new ModelAndView();
		dao.addEmployee(empl);
		mav.setViewName("redirect:viewemployee");
		return mav;
	}
	@RequestMapping(value="/viewemployee")
	public ModelAndView getEmployee(){
		ModelAndView mav=new ModelAndView();
		List<Employee>list=dao.getEmployee();
		mav.addObject("Employee",list);
		mav.setViewName("ViewEmployee");
		return mav;
	}
	@RequestMapping(value="/updateemployee",method=RequestMethod.GET)
	public String ShowUpdateEmployeeForm(){
		return "UpdateEmployee";
		}
	@RequestMapping(value="/updateemployee",method=RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute("emp")Employee empl)
	{
		ModelAndView mav=new ModelAndView();
		dao.updateEmployee(empl);
		mav.setViewName("redirect:viewemployee");
		return mav;
	}
	@RequestMapping(value="/deleteemployee",method=RequestMethod.GET)
	public String ShowDeleteEmployeeForm(){
		return "DeleteEmployee";
		}
	@RequestMapping(value="/deleteemployee",method=RequestMethod.POST)
	public ModelAndView deleteCustomer(@ModelAttribute("emp")Employee empl)
	{
		ModelAndView mav=new ModelAndView();
		dao.deleteEmployee(empl);
		mav.setViewName("redirect:viewviewemployee");
		return mav;
	}
}
