package org.pomprogram;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class EmployeePrasanth extends BaseClass{
	
	@BeforeClass
	public static void beforClass() {
		
		getDriver();
		enterUrl("https://adactinhotelapp.com/");
		maximizeTheWindow();
			
	}

	
	@Test
	public void booking() throws IOException, InterruptedException {
		
//		1.Login
		LoginPage loginPage = new LoginPage();
		loginPage.login(getData("Adactin", 1, 0),getData("Adactin", 1, 1));
		
		
//		2.Search
		SearchHotelPage searchHotelPage = new SearchHotelPage();
		
		WebElement textWelcomeMsg = searchHotelPage.getTextWelcomeMsg();
		String elementGetAttributeValue = elementGetAttributeValue(textWelcomeMsg);
		
		Assert.assertEquals("Verify after login Success Msg", "Hello prasanthrajendranrrr!"	, elementGetAttributeValue);
		
		searchHotelPage.searchHotels(getData("Adactin", 1, 2), getData("Adactin", 1, 3), 
				getData("Adactin", 1, 4), getData("Adactin", 1, 5), getData("Adactin", 1, 6), 
				getData("Adactin", 1, 7), getData("Adactin", 1, 8), getData("Adactin", 1, 9));
		
//		3.Select Hotel
		SelectHotelPage selectHotelPage = new SelectHotelPage();
		WebElement textSelectHotel = selectHotelPage.getTextSelectHotel();
		String elementGetText = elementGetText(textSelectHotel);
		
		Assert.assertEquals("Verify after Search", "Select Hotel", elementGetText);
		selectHotelPage.selectHotelo();
		
//		4.Book a Hotel & Confirmation
		BookAHotelPage bookaHotelPage = new BookAHotelPage();
			bookaHotelPage.bookAHotel(getData("Adactin", 1, 10), getData("Adactin", 1, 11), 
					getData("Adactin", 1, 12), getData("Adactin", 1, 13), getData("Adactin", 1, 14),
					getData("Adactin", 1, 15), getData("Adactin", 1, 16), getData("Adactin", 1, 17));
			
		
//		5.Booking Confirmation
			
			Thread.sleep(9000);
			BookingConfirmation bookingConfirmation = new BookingConfirmation();
			WebElement txtBookingConfirmation = bookingConfirmation.getTxtBookingConfirmation();
			
			String elementGetText2 = elementGetText(txtBookingConfirmation);
			
			Assert.assertEquals("Shown Booking Confirmation", "Booking Confirmation", elementGetText2);
		
			
//		6. Get OrderId
			
			OrderId orderId =new OrderId();
			WebElement getOrderNo = orderId.getGetOrderNo();
			String elementGetAttributeValue2 = elementGetAttributeValue(getOrderNo);
			orderId.writeData("Adactin", 1, 18, elementGetAttributeValue2);
			
//		7.Cancel Booking	
			CancelBooking cancelBooking = new CancelBooking();
			cancelBooking.cancelBookingConfirmation(getData("Adactin", 1, 18));
		
			
			WebElement searchResultError = cancelBooking.getSearchResultError();
			String elementGetText3 = elementGetText(searchResultError);
			
			Assert.assertEquals("Cancelled Booking Verify", "The booking has been cancelled.", elementGetText3);
			
			System.out.println(elementGetText3);
			
			
	}
	
	
	
	
//	@AfterClass
//	public static void afterClass() {
//		quitWindow();
//	}
//	
	
	
	
	
	
	
	
}
