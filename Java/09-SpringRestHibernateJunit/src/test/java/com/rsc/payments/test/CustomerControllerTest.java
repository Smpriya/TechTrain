package com.rsc.payments.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.rsc.payments.controller.CustomerController;
import com.rsc.payments.entity.model.Customer;
import com.rsc.payments.service.CustomerMgrImpl;

class CustomerControllerTest extends AbstractTest {

	@Override
	@BeforeEach
	public void setUp() {
		System.out.println("========super setup");
		super.setUp();
	}

	@Test
	public void getCustomersList() throws Exception {
		String uri = "/api/customers";
		
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
				.accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		//System.out.println("==========content..." + content);
		Customer[] customerlist = super.mapFromJson(content, Customer[].class);
		//System.out.println(customerlist.length);
		assertTrue(customerlist.length > 2);
	}

	
	@Test
	public void createCustomers() throws Exception {
		String uri = "/api/customer";
		
		Customer cust1 = new Customer();
		cust1.setId(1);
		cust1.setAddress("addres123");
		cust1.setCreatedBy("isha");
		cust1.setCreatedDate(Calendar.getInstance());
		cust1.setEmail("isha123@rsc.com");
		cust1.setFirstName("Siva");
		cust1.setLastName("kumar");
		cust1.setPhonenumber("1234567899");
		cust1.setTimeofOpening(Calendar.getInstance());
		
		String customer = super.mapToJson(cust1);
		
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
				.contentType(MediaType.APPLICATION_JSON)
				.content(customer)).andReturn();
		
		int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        
        String content = mvcResult.getResponse().getContentAsString();
        System.out.println("#####====" + content);
        Customer customerRes = super.mapFromJson(content, Customer.class);
        
        assertEquals(customerRes.getPhonenumber(), "1234567899");				
	}
	
	
	@Test
	public void getCustomerbyId() throws Exception {
		String uri = "/api/customer/6";
		
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
				.accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		
		int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        
        String content = mvcResult.getResponse().getContentAsString();
        System.out.println("#####====" + content);
        Customer customerRes = super.mapFromJson(content, Customer.class);
        
        assertEquals(customerRes.getPhonenumber(), "12345678190");				
	}

	@Test
	public void getCustomerbyIdExp() throws Exception {
		String uri = "/api/customer/6";
		
		System.out.println("============================start");
		
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
				.accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		
		int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        
        String content = mvcResult.getResponse().getContentAsString();
        System.out.println("#####====" + content);
        Customer customerRes = super.mapFromJson(content, Customer.class);
        System.out.println("============================end");
        
        assertEquals(customerRes.getPhonenumber(), "12345678190");				
	}

}
