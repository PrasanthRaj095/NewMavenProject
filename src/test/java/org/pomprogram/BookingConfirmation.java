package org.pomprogram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {
	
public BookingConfirmation() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//td[text()='Booking Confirmation '] ")
private WebElement txtBookingConfirmation;

public WebElement getTxtBookingConfirmation() {
	return txtBookingConfirmation;
}



}
