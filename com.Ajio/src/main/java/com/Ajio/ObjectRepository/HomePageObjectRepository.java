package com.Ajio.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjectRepository {
	@FindBy(xpath="//input[@name='searchVal']")
	public WebElement searchbox;

	@FindBy(xpath="//button[@class='rilrtl-button']")
	public WebElement searchbtno;

	@FindBy(xpath="//div[@class='nameCls']")
	public List<WebElement> list_of_products;

	@FindBy(xpath="//span[@class='price  ']")
	public List<WebElement> list_of_products_price;

	@FindBy(linkText="//span[@class='orginal-price']")
	public List<WebElement> list_of_products_actprice;

	@FindBy(linkText="//span[@class='discount']")
	public List<WebElement> list_of_products_discount;

	
}
