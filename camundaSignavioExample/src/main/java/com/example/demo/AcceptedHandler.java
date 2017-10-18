package com.example.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("InvoiceAcceptedAdapter")
public class AcceptedHandler  implements JavaDelegate {
	 public void execute(DelegateExecution execution) throws Exception {
		 System.out.println("===============================");
		 System.out.println("your message has been successfully accepted");
		 System.out.println("===============================");
		  }
}
