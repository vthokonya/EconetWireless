/**
 * 
 */
package com.econetmedia.developer.interview.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.econetmedia.developer.interview.exception.ValidationException;
import com.econetmedia.developer.interview.model.Customer;
import com.econetmedia.developer.interview.service.CustomerService;

/**
 * @author Victor Tichayana Hokonya
 * 
 * service class implementing {@link com.econetmedia.developer.interview.model.Customer.CustomerService}
 *
 */
public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see com.econetmedia.developer.interview.service.CustomerService#registerCustomer(com.econetmedia.developer.interview.model.Customer)
	 */
	@Override
	public boolean registerCustomer(Customer customer) {
		if(customer.getFirstName()==null || customer.getFirstName().isEmpty())
			throw new ValidationException("First name cannot be null");
		if(customer.getNationalId()==null || customer.getNationalId().length()<5)
			throw new ValidationException("National ID number nust be at least 5 charactors");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.econetmedia.developer.interview.service.CustomerService#findCustomer(java.lang.Long)
	 */
	@Override
	public Optional<Customer> findCustomer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.econetmedia.developer.interview.service.CustomerService#filterByGradeOrSalary(java.lang.String, java.lang.Number, java.util.List)
	 */
	@Override
	public List<Customer> filterByGradeOrSalary(String grade, Number salary, List<Customer> customerInputList) {
		return customerInputList.stream().filter(p->p.getGrade().equals(grade) || p.getSalary()==salary).collect(Collectors.toList());
	}

}
