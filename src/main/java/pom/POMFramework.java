package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POMFramework extends BasePage implements AutoConstant
{
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstnameTextfield;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement countrycodeDropDownList;
	
	public POMFramework(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submit() throws IOException
	{
		firstnameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 0));
		dropdownbyvisibletext(countrycodeDropDownList, "+852");		
	}
}