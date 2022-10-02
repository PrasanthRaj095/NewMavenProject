package org.pomprogram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends BaseClass {
	public CancelBooking() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="my_itinerary")
	private WebElement selectMyitinery;
	
	@FindBy(id="order_id_text")
	private WebElement selectOrderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement selectGo;
	
	@FindBy(xpath="//input[contains(@id,'btn_id_')]")
	private WebElement selectCancelId;
	
	@FindBy(id="search_result_error")
	private WebElement searchResultError;

	public WebElement getSearchResultError() {
		return searchResultError;
	}

	public WebElement getSelectCancelId() {
		return selectCancelId;
	}

	public WebElement getSelectMyitinery() {
		return selectMyitinery;
	}

	public WebElement getSelectOrderId() {
		return selectOrderId;
	}

	public WebElement getSelectGo() {
		return selectGo;
	}

	public void cancelBookingConfirmation(String data) {
		elementClick(getSelectMyitinery());
		elementSendKeys(getSelectOrderId(), data);
		elementClick(getSelectGo());
		elementClick(getSelectCancelId());
		acceptTheAlertbox();
		
	}
	
	
	
	
	
}
