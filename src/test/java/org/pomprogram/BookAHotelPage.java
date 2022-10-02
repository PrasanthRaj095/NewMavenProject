package org.pomprogram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage extends BaseClass{
	
	public BookAHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstname;
	
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	
	@FindBy (id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditCardNo;
	
	@FindBy (id="cc_type")
	private WebElement txtCreditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement txtExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement txtExpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvvNumber;
	
	@FindBy (id="book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardNo() {
		return txtCreditCardNo;
	}

	public WebElement getTxtCreditCardType() {
		return txtCreditCardType;
	}

	public WebElement getTxtExpMonth() {
		return txtExpMonth;
	}

	public WebElement getTxtExpyear() {
		return txtExpyear;
	}

	public WebElement getTxtCvvNumber() {
		return txtCvvNumber;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	
	public void bookAHotel(String txtFirstName, String txtLastName, String txtAddress, String txtCreditCardNo,
			String txtCreditCardType, String txtExpeMonth, String txtExpYear, String txtCvvNumber) {
		
		elementSendKeys(getTxtFirstname(), txtFirstName);
		elementSendKeys(getTxtLastName(), txtLastName);
		elementSendKeys(getTxtAddress(), txtAddress);
		elementSendKeys(getTxtCreditCardNo(), txtCreditCardNo);
		elementSendKeys(getTxtCreditCardType(), txtCreditCardType);
		elementSendKeys(getTxtExpMonth(), txtExpeMonth);
		elementSendKeys(getTxtExpyear(), txtExpYear);
		elementSendKeys(getTxtCvvNumber(), txtCvvNumber);
		elementClick(getBtnBookNow());
	
	
	}
	
	
	
	
}
