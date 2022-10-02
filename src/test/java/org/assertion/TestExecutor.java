package org.assertion;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.Result;

@RunWith(Suite.class)
@SuiteClasses({Test1.class, Test2.class, Test3.class})


public class TestExecutor {
	
	public static void main(String[] args) {
		
  Result runClasses = JUnitCore.runClasses(TestExecutor.class);	
  int runCount = runClasses.getRunCount();
  System.out.println("Total Run Count :"+runCount);
  
  int ignoreCount = runClasses.getIgnoreCount();
  System.out.println("Total Ingone Count :"+ignoreCount);
  
  int failureCount = runClasses.getFailureCount();
  System.out.println("Total number of Failure:"+failureCount);
  
  List<Failure> failures = runClasses.getFailures();
  for (Failure failure : failures) {
	System.out.println(failures);
}
  
	}

}
