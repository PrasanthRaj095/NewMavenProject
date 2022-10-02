package org.pomprogram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass{
	
	public SearchHotelPage() {
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id = "location")
	private WebElement selectLocation;
	
	@FindBy(id="username_show")
	private WebElement textWelcomeMsg;

	@FindBy(id = "hotels")
	private WebElement selecthotels;
	
	@FindBy (id = "room_type")
	private WebElement selectRoomType;
	
	@FindBy(id="room_nos")
	private WebElement selectRoomsNo;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id ="datepick_out")
	private WebElement checkoutDate;
	
	@FindBy(id = "adult_room")
	private WebElement selectAdultRoom;
	
	@FindBy(id="child_room")
	private WebElement selectChildRoom;
	
	@FindBy (id = "Submit")
	private WebElement clckSubmit;

	public WebElement getSelectLocation() {
		return selectLocation;
	}
	

	public WebElement getTextWelcomeMsg() {
		return textWelcomeMsg;
	}


	public WebElement getSelecthotels() {
		return selecthotels;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public WebElement getSelectRoomsNo() {
		return selectRoomsNo;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public WebElement getSelectAdultRoom() {
		return selectAdultRoom;
	}

	public WebElement getSelectChildRoom() {
		return selectChildRoom;
	}

	public WebElement getClckSubmit() {
		return clckSubmit;
	}
	
	public void searchHotels(String location, String hotels, String roomType, String roomsNo, 
			String checkInDate, String checkOutDate , String adultRoom, String childRoom) {
		selectOptionByText(getSelectLocation(), location);
		selectOptionByText(getSelecthotels(), hotels);
		selectOptionByText(getSelectRoomType(), roomType);
		elementSendKeys(getSelectRoomsNo(), roomsNo);
		elementSendKeys(getCheckInDate(), checkInDate);
		elementSendKeys(getCheckoutDate(), checkOutDate);
		elementSendKeys(getSelectAdultRoom(), adultRoom);
		elementSendKeys(getSelectChildRoom(), childRoom);
		elementClick(getClckSubmit()); 
		
		
	}
	
	
	
}
