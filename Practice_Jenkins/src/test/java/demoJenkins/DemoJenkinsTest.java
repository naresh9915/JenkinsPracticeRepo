package demoJenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoJenkinsTest {

	@Test
public void test() {
	Reporter.log(">>>>>>>>>>>Hi from jenkins1*************<<<<<<<<<<<<<",true);
	
	Reporter.log(">>>>>>>>>>>Hi from jenkins2*************<<<<<<<<<<<<<",true);	
}
}
