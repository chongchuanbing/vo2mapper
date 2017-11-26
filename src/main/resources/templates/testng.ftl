package ${packageName};

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.ihomefnt.cms.test.BaseTest;

/**
 * 
 * @author chong
 */
public class ${className}Test extends BaseTest {

	@Autowired
	public EarnestMoneyService earnestMoneyService;

	<#list methodList as method>
	@Test
	public void test${method.name?cap_first}() {
		throw new RuntimeException("Test not implemented");
	}
	
	</#list>

}
