package org.pomprogram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
			private WebElement textSelectHotel;
	
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	
	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}

	@FindBy(id="radiobutton_0")
	private WebElement selectHotel;

	public WebElement getSelectHotel() {
		return selectHotel;
	}
	
	public void selectHotelo() {
		elementClick(getSelectHotel());
		elementClick(getBtnContinue());
	}
	

}
