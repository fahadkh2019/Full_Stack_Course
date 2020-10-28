package com.fahad.customer.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fahad.customer.dal.entities.Customer;
import com.fahad.customer.dal.repos.CustomerRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerApplicationTests {

	@Autowired
	private CustomerRepository customerrepo;
	
/*	@Test
	public void createStudentTest() {
		Customer customer = new Customer();
		customer.setName("Fahad");
		customer.setEmail("fahad.khalid.lhr@gmail.com");
		customerrepo.save(customer);
	}
	@Test
	public void readStudentTest() {
		Optional<Customer> customer = customerrepo.findById((long) 1);	
		System.out.println(customer);
	}
	@Test
	public void updateStudentTest() {
		Optional<Customer> customer = customerrepo.findById((long) 1);	
		customer.get().setName("Khalid");
	
		customerrepo.save(customer.get());
	}*/
	
	@Test
	public void deleteStudentTest() {
	
		customerrepo.deleteById(1L);
	}
}

