package com.stepdefs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.Ajio.ObjectRepository.HomePageObjectRepository;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef extends HomePageObjectRepository {

	public WebDriver driver;
	String s_search_string = "Jeans";

	@Given("^user should be on Home page$")
	public void user_should_be_on_Home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91814\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Application launch");

	}

	@When("^user enter Jeans in searchBox$")
	public void user_enter_Jeans_in_searchBox() throws Throwable {
		// Check Search Box is Displayed
		WebElement searchbx = driver.findElement(By.xpath("//input[@name='searchVal']"));
		Assert.assertEquals(searchbx.isDisplayed(), true);
		// Enter Jeans in Search text box
		searchbx.sendKeys(s_search_string);

	}

	@When("^user click on  search button$")
	public void user_click_on_search_button() throws Throwable {
		// Clicked on Search button
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		String exp_search_title = s_search_string;
		String actual_search_title = driver.getTitle();

		if (actual_search_title.toLowerCase().contains(exp_search_title.toLowerCase())) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Then("^user will see the number of jeans$")
	public void user_will_see_the_number_of_jeans() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> list_of_products = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<WebElement> list_of_products_price = driver.findElements(By.xpath("//span[@class='price  ']"));
		List<WebElement> list_of_products_actprice = driver.findElements(By.xpath("//span[@class='orginal-price']"));
		List<WebElement> list_of_products_discount = driver.findElements(By.xpath("//span[@class='discount']"));
		for (int i = 0; i < 6; i++) {
			WebElement product = list_of_products.get(i);
			String Product_text = product.getText();
			System.out.println("Jeans Name:- "+Product_text);

			WebElement product_price = list_of_products_price.get(i);
			String price_text = product_price.getText();
			System.out.println("Jeans Discount Price:- "+price_text);

			WebElement product_actprice = list_of_products_actprice.get(i);
			String actprice_text = product_actprice.getText();
			System.out.println("Jeans Actual Price:- "+actprice_text);
			
		}
		ArrayList<String> actlist_of_products_discount = new ArrayList<String>();
		for (int i = 0; i < 6; i++) {
			WebElement product_discount = list_of_products_discount.get(i);
			String discount_text = product_discount.getText();
			System.out.println("Discount on Jeans:- "+discount_text);
			actlist_of_products_discount.add(discount_text);
		}
		Collections.sort(actlist_of_products_discount);
		System.out.println(
				"Highest discount" + actlist_of_products_discount.get(actlist_of_products_discount.size() - 1));
		}

	}

