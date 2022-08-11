package testPackage;

import org.testng.annotations.Test;

import basePack.BaseClass;

public class TestRegister extends BaseClass {

	@Test
	public void test1() {
		hPage.logInBtnAction(cActn);
		hPage.memberPortalAction(cActn);

	}

}
