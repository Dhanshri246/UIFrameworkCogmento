package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class DropDownHelper extends BaseClass {
	public static  List<WebElement> selectValue(List<WebElement>list,String value){
		for(WebElement ss:list) {
			String statusList=ss.getText();
			if(statusList.equalsIgnoreCase(value)) {
			WebElementHelper.click(ss);
			break;
			}

}
		return null;
}
}