package org.emp;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class EmployeePrasanthOld {
	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeePrasanthOld ep = new EmployeePrasanthOld();
		ep.ticketBooking();
	}
	
	public void ticketBooking() throws IOException, InterruptedException {
		BaseClass baseClass = new BaseClass();
		
		baseClass.getDriver();
		baseClass.enterUrl("https://adactinhotelapp.com/index.php");
		
		WebElement useerName = baseClass.findLocatorById("username");
		String data = baseClass.getData("Adactin",1,0);
		baseClass.elementSendKeys(useerName, data);
		
		WebElement txtPass = baseClass.findLocatorById("password");
		String data2 = baseClass.getData("Adactin", 1, 1);
		baseClass.elementSendKeys(txtPass, data2);
		
		
		WebElement clkLogin = baseClass.findLocatorById("login");
		baseClass.elementClick(clkLogin);
		
		WebElement selectLocation = baseClass.findLocatorById("location");
		String data3 = baseClass.getData("Adactin", 1, 2);
		baseClass.elementSendKeys(selectLocation, data3);
		
		WebElement selectHotels = baseClass.findLocatorById("hotels");
		String data4 = baseClass.getData("Adactin", 1, 3);
		baseClass.elementSendKeys(selectHotels, data4);
		
		WebElement selectRoomType = baseClass.findLocatorById("room_type");
		String data5 = baseClass.getData("Adactin", 1, 4);
		baseClass.elementSendKeys(selectRoomType, data5);
	
		WebElement selectNoRooms = baseClass.findLocatorById("room_nos");
		String data6 = baseClass.getData("Adactin", 1, 5);
		baseClass.elementSendKeys(selectNoRooms, data6);
		
		WebElement selectCheckInDate = baseClass.findLocatorById("datepick_in");
		String data7 = baseClass.getData("Adactin", 1, 6);
		baseClass.elementSendKeys(selectCheckInDate, data7);
		
		WebElement selectCheckOutDate = baseClass.findLocatorById("datepick_out");
		String data8 = baseClass.getData("Adactin", 1, 7);
		baseClass.elementSendKeys(selectCheckOutDate, data8);
		
		WebElement selectAdultno = baseClass.findLocatorById("adult_room");
		String data9 = baseClass.getData("Adactin", 1, 8);
		baseClass.elementSendKeys(selectAdultno, data9);
		
		WebElement selectChildPerRoom = baseClass.findLocatorById("child_room");
		String data10 = baseClass.getData("Adactin", 1, 9);
		baseClass.elementSendKeys(selectChildPerRoom, data10);
		
		WebElement selectSearch = baseClass.findLocatorById("Submit");
		baseClass.elementClick(selectSearch);
		
		WebElement clkRadioBtn = baseClass.findLocatorById("radiobutton_0");
		baseClass.elementClick(clkRadioBtn);
		
		WebElement clkContinue = baseClass.findLocatorById("continue");
		baseClass.elementClick(clkContinue);
		
		WebElement txtFirstName = baseClass.findLocatorById("first_name");
		String data11 = baseClass.getData("Adactin", 1, 10);
		baseClass.elementSendKeys(txtFirstName, data11);
		
		WebElement txtLastName = baseClass.findLocatorById("last_name");
		String data12 = baseClass.getData("Adactin", 1, 11);
		baseClass.elementSendKeys(txtLastName, data12);
		
		WebElement txtAddress = baseClass.findLocatorById("address");
		String data13 = baseClass.getData("Adactin", 1, 12);
		baseClass.elementSendKeys(txtAddress, data13);
		
		WebElement numCardNo = baseClass.findLocatorById("cc_num");
		String data14 = baseClass.getData("Adactin", 1, 13);
		baseClass.elementSendKeys(numCardNo, data14);
		
		WebElement selectCardtype = baseClass.findLocatorById("cc_type");
		String data15 = baseClass.getData("Adactin", 1, 14);
		baseClass.elementSendKeys(selectCardtype, data15);
		
		WebElement expiryMonth = baseClass.findLocatorById("cc_exp_month");
		String data16 = baseClass.getData("Adactin", 1, 15);
		baseClass.elementSendKeys(expiryMonth, data16);
		
		WebElement expiryYear = baseClass.findLocatorById("cc_exp_year");
		String data17 = baseClass.getData("Adactin", 1, 16);
		baseClass.elementSendKeys(expiryYear, data17);
		
		WebElement numCcv = baseClass.findLocatorById("cc_cvv");
		String data18 = baseClass.getData("Adactin", 1, 17);
		baseClass.elementSendKeys(numCcv, data18);
		
		WebElement clkSearchnext = baseClass.findLocatorById("book_now");
		baseClass.elementClick(clkSearchnext);

		Thread.sleep(7000);
		WebElement txtOrderNo = baseClass.findLocatorById("order_no");
		String elementGetAttributeValue = baseClass.elementGetAttributeValue(txtOrderNo);
		baseClass.writeData("Adactin", 1, 18, elementGetAttributeValue);
		
			
	
	}
	
	
}

