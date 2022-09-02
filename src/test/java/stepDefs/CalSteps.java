package stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalSteps {
	
	int results =0;
	int pricelist;
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Inside the Calculator Class ");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
	   results = num1+num2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int res) {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(res, results);
	}

	@When("I sub {int} and {int}")
	public void i_sub_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
		results = num1-num2;
	}

	@Then("I should get the result {int}")
	public void i_should_get_the_result(int res2) {
	    // Write code here that turns the phrase above into concrete actions
		 Assert.assertEquals(res2, results);
	}

	
	
	@When("I add below numbers using datatable")
	public void i_add(io.cucumber.datatable.DataTable dataTable) {
	     
		int row =dataTable.height();
		
		for ( int i = 0; i<row; i++) {
				
			results= results+ Integer.parseInt(dataTable.cell(i, 0));
		}
	}
	
	@When("I add below numbers using list")
	public void i_add_below_numbers_using_list(List<Integer> number) {
		
		for (int num:number) {
			results = results+num;
		}
	   
	}
	
	   
	   @When("I order below items using map")
	    public void i_order_below_items(Map<String, Integer> priceList) {
	       
	        for(String key: priceList.keySet() ) {
	            
	            results = results + priceList.get(key);
	        }
	    }

	  /* @When("I order below items using quantity")
	   public void i_order_below_items_using_quantity(io.cucumber.datatable.DataTable dataTable) {
		   
		int colum= dataTable.height();
		  for (int i=0; i<colum; i++) {
			 int price = Integer.parseInt(dataTable.cell(i, 2));
			 int quantity=  Integer.parseInt(dataTable.cell(i, 1));
			 
			 pricelist =results+ price*quantity;
		  }
		
	     
	   }*/
	   
	   @When("I order below items using quantity and price")
	   public void i_order_below_items_using_quantity_and_price(io.cucumber.datatable.DataTable dataTable) {
		   
		   int colum= dataTable.height();
			  for (int i=0; i<colum; i++) {
				 int price = Integer.parseInt(dataTable.cell(i, 2));
				 int quantity=  Integer.parseInt(dataTable.cell(i, 1));
				 
				 results =results+ price*quantity;
			  }
	      
	 
	   }
	   @Then("I should get the result <pricelist>")
	   public void i_should_get_the_result_pricelist() {
		 
		  Assert.assertEquals((pricelist), (results));
		
		

	   }   
	   
}
	      
	   

	 
	



