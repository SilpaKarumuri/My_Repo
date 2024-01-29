package CucumberStepsDemo1;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooksDemo1 
{
	@Before
public void beforeScenario()
{
	System.out.println("beforeScenario of CucumberHooksDemo1");
}
	
	@After
public void afterScenario()
{
	System.out.println("afterScenario of CucumberHooksDemo1");
}
	
}