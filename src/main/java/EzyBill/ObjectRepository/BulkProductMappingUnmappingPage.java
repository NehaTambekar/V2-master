package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkProductMappingUnmappingPage {

	@FindBy(id = "mapped")
	private WebElement bulkProductMappingRadioBtn;
	
	@FindBy(id = "ummapped")
	private WebElement bulkProductUnmappingRadioBtn;
	
	@FindBy(id = "edit")
	private WebElement bulkProductEditRadioBtn;
	
	@FindBy(id = "file")
	private WebElement uploadFileForProductMapping;
	
	@FindBy(id = "un_file")
	private WebElement uploadFileForProductUnmapping;
	
	@FindBy(id = "edit_file")
	private WebElement uploadFileForProductEdit;
	
	@FindBy(id = "btnimport")
	private WebElement productMapImportBtn;
	
	@FindBy(id = "import")
	private WebElement productUnmapImportBtn;
	
	@FindBy(id = "editbutton")
	private WebElement productEdtImportBtn;

	public WebElement getBulkProductMappingRadioBtn() {
		return bulkProductMappingRadioBtn;
	}

	public WebElement getBulkProductUnammpingRadioBtn() {
		return bulkProductUnmappingRadioBtn;
	}

	public WebElement getBulkProductEditRadioBtn() {
		return bulkProductEditRadioBtn;
	}

	public WebElement getUploadFileForProductMapping() {
		return uploadFileForProductMapping;
	}

	public WebElement getUploadFileForProductUnmapping() {
		return uploadFileForProductUnmapping;
	}

	public WebElement getUploadFileForProductEdit() {
		return uploadFileForProductEdit;
	}

	public WebElement getProductMapimportBtn() {
		return productMapImportBtn;
	}

	public WebElement getProductUnmapImportBtn() {
		return productUnmapImportBtn;
	}

	public WebElement getProductEdtimportBtn() {
		return productEdtImportBtn;
	}

	public BulkProductMappingUnmappingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void bulkProductMapping(String uploadFile)
	{
		bulkProductMappingRadioBtn.click();
		uploadFileForProductMapping.sendKeys(uploadFile);
		productMapImportBtn.click();
	}
	
	public void bulkProductUnapping(String uploadFile)
	{
		bulkProductUnmappingRadioBtn.click();
		uploadFileForProductUnmapping.sendKeys(uploadFile);
		productUnmapImportBtn.click();
	}
	
	public void bulkProductEdit(String uploadFile)
	{
		bulkProductEditRadioBtn.click();
		uploadFileForProductEdit.sendKeys(uploadFile);
		productEdtImportBtn.click();
	}
}
