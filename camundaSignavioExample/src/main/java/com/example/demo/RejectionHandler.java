package com.example.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("InvoiceRejectedAdapter")
public class RejectionHandler  implements JavaDelegate{
	 public void execute(DelegateExecution execution) throws Exception {
		 System.out.println("____________________________");
		 System.out.println("your message has been successfully rejected");
		 System.out.println("____________________________");
		  }
}
