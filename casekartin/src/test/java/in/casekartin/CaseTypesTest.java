package in.casekartin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaseTypesTest {

	// test case for display phone models
	@Test
	public void testCase1() {
		CaseTypes.displayCaseModels();
	}
	/*
	 * phone type, mobile model & case types availability checking test case for not
	 * available types
	 */

	@Test
	public void testCase2() {
		System.out.println("\n************Invalid case Types as a input************");
		String mobileType = "Feature Phone";
		boolean isPhoneTypeValid = CaseTypes.phoneTypeValidation(mobileType);
		assertEquals(true, isPhoneTypeValid);

		String mobileModel = "lava APS97";
		boolean isPhoneModelValid = CaseTypes.phoneModelValidation(mobileType, mobileModel);
		assertEquals(false, isPhoneModelValid);

		String caseType = "POLYCARBONATE";
		boolean isCaseTypeValid = CaseTypes.caseTypeValidation(mobileType, caseType);
		assertEquals(false, isCaseTypeValid);

		boolean actual = CaseTypes.mobileCaseTypeValidation(mobileType, mobileModel, caseType);
		assertEquals(false, actual);
	}

	/*
	 * phone type, mobile model & case types availability checking test case for
	 * available types
	 */
	@Test
	public void testCase3() {
		System.out.println("\n***********Valid case Types as a input*************");
		// Test case 1
		// user phone Type case availability checking
		String mobileType = "iPhone";
		boolean isPhoneTypeValid = CaseTypes.phoneTypeValidation(mobileType);
		assertEquals(true, isPhoneTypeValid);

		String mobileModel = "iPhone 12 Pro";
		boolean isPhoneModelValid = CaseTypes.phoneModelValidation(mobileType, mobileModel);
		assertEquals(true, isPhoneModelValid);

		String caseType = "POLYCARBONATE";
		boolean isCaseTypeValid = CaseTypes.caseTypeValidation(mobileType, caseType);
		assertEquals(true, isCaseTypeValid);

		boolean actual = CaseTypes.mobileCaseTypeValidation(mobileType, mobileModel, caseType);
		assertEquals(true, actual);

	}

}
