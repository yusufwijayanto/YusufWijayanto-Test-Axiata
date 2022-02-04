package com.juaracoding.gist.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.gist.driver.DriverSingleton;

public class CreatePage {

	private WebDriver driver;
	
	public CreatePage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="body > div.position-relative.js-header-wrapper > header > div:nth-child(6) > details > summary > svg")
	private WebElement btnPlus;
	
	@FindBy(css ="body > div.position-relative.js-header-wrapper > header > div:nth-child(6) > details > details-menu > a:nth-child(3)")
	private WebElement btnNewgist;
	
	@FindBy(xpath ="//*[@id=\"gists\"]/input")
	private WebElement txtGistdescription;
	
	@FindBy(xpath ="#code-editor > div > pre")
	private WebElement txtIsi;
	
	@FindBy(xpath ="//*[@id=\"new_gist\"]/div/div[2]/div/button")
	private WebElement btnCreatesecretgist;
	
	@FindBy(xpath ="//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[2]/form/button")
	private WebElement btnDelete;
	}