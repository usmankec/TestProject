/*
 * Copyright 2015 www.seleniumtests.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.elastica.tests;

import org.testng.annotations.Test;

import com.elastica.core.SeleniumTestPlan;
import com.elastica.dataobject.User;
import com.elastica.listeners.Priority;
import com.elastica.util.internal.entity.TestEntity;
import com.elastica.webpage.DriveAction;


public class OneDriveOperations extends SeleniumTestPlan {
	DriveAction da= new DriveAction();
	User user= new User();
 
	
    @Priority(1)
    @Test(groups = {"oneDrive"})
    public void aloginToDrive() throws Exception {
    	DriveAction da= new DriveAction();
    	user.setUserID("*******@hotmail.com");
        user.setPassword("*******");
    	da.driveLogin("onedrive", user);
    	Thread.sleep(5000);
    }
    
    
    @Priority(2)
    @Test(groups = {"oneDrive"})
    public void uploadFile() throws Exception {
    	System.out.println("Test upload file file");
    	DriveAction da= new DriveAction();
    	user.setUserID("*******@hotmail.com");
        user.setPassword("Test12!@");
    	da.driveLogin("onedrive", user);
        Thread.sleep(5000);
    	da.clickUplaodLink();
    	da.uploadFileAutoIT("Test.docx");
    	Thread.sleep(5000);
    	
    }
    
    
    @Priority(3)
    @Test(groups = {"oneDrive"})
    public void deleteFile() throws Exception {
    	System.out.println("Test delete file");
    	DriveAction da= new DriveAction();
    	user.setUserID("*********@hotmail.com");
        user.setPassword("Test12!@");
    	da.driveLogin("onedrive", user);
    	Thread.sleep(5000);
    	da.clickFileCheckbox(1);
    	Thread.sleep(5000);
    	da.clickManageLink();
    	da.clickDeleteLink();
    	Thread.sleep(10000);
    	
    }
	
    @Priority(3)
    @Test(groups = {"oneDrive"})
    public void createFolder() throws Exception {
    	System.out.println("Test delete file");
    	Thread.sleep(5000);
    	da.clickCreateLink();
    	da.clickCreateFolderLink();
    	da.typeInFolderNameTextbox("Folder2");
    	da.clickCreateFolderButton();
    	Thread.sleep(10000);
    	
    }
	
    
    @Priority(3)
    @Test(groups = {"oneDrive"})
    public void createTxtFile() throws Exception {
    	System.out.println("Create text file");
    	DriveAction da= new DriveAction();
    	user.setUserID("*********@hotmail.com");
        user.setPassword("Test12!@");
    	da.driveLogin("onedrive", user);
    	Thread.sleep(5000);
    	da.clickCreateLink();
    	da.clickCreateFileLink("TXTFILE", "");
    	Thread.sleep(20000);
    	
    }
	
    @Priority(4)
    @Test(groups = {"oneDrive"})
    public void createWordFile() throws Exception {
    	System.out.println("Test delete file");
    	DriveAction da= new DriveAction();
    	user.setUserID("*********@hotmail.com");
        user.setPassword("Test12!@");
    	da.driveLogin("onedrive", user);
    	Thread.sleep(5000);
    	da.clickCreateLink();
    	da.clickCreateFileLink("WORDFILE", "");
    	Thread.sleep(20000);
    	
    }
    
    @Priority(5)
    @Test(groups = {"oneDrive"})
    public void createExlFile() throws Exception {
    	System.out.println("Test delete file");
    	DriveAction da= new DriveAction();
    	user.setUserID("*********@hotmail.com");
        user.setPassword("Test12!@");
    	da.driveLogin("onedrive", user);
    	Thread.sleep(5000);
    	da.clickCreateLink();
    	da.clickCreateFileLink("EXLFILE", "");
    	Thread.sleep(20000);
    	
    }
    
    @Priority(6)
    @Test(groups = {"oneDrive"})
    public void createPptFile() throws Exception {
    	System.out.println("Test delete file");
    	DriveAction da= new DriveAction();
    	user.setUserID("*********@hotmail.com");
        user.setPassword("Test12!@");
    	da.driveLogin("onedrive", user);
        Thread.sleep(5000);
        da.clickCreateLink();
    	da.clickCreateFileLink("PPTFILE", "");
    	Thread.sleep(20000);
    	
    }
    
    @Priority(7)
    @Test(groups = {"oneDrive"})
    public void createOnenoteFile() throws Exception {
    	System.out.println("Test delete file");
    	DriveAction da= new DriveAction();
    	user.setUserID("*********@hotmail.com");
        user.setPassword("Test12!@");
    	da.driveLogin("onedrive", user);
    	Thread.sleep(5000);
    	da.clickCreateLink();
    	da.clickCreateFileLink("ONENOTE", "");
    	Thread.sleep(20000);
    	
    }
    
    
    @Priority(8)
    @Test(groups = {"oneDrive"})
    public void createExlSurveyFile() throws Exception {
    	System.out.println("Test delete file");
    	DriveAction da= new DriveAction();
    	user.setUserID("*********@hotmail.com");
        user.setPassword("Test12!@");
    	da.driveLogin("onedrive", user);
    	Thread.sleep(5000);
    	da.clickCreateLink();
    	da.clickCreateFileLink("EXLSURVEY", "");
    	Thread.sleep(20000);
    	
    }
    
   
	
    
    
	
    
	@Priority(2)
    @Test(groups = {"oneDrive1"})
    public void loginAsValidUser2() throws Exception {
    	DriveAction da= new DriveAction();
    	User user= new User();
    	user.setUserID("*********@hotmail.com");
        user.setPassword("Test12!@");
    	da.driveLogin("onedrive", user);
    	da.getListFiles();
    	da.getFolderList();
    	da.getFileList();
    	da.clickFileCheckbox(0);
    	da.clickSherLink();
    	da.typeInEmailTo("usman.kec@gmail.com");
    	da.typeInQuickNote("This is for you");
    	da.clickShareButton();
    	Thread.sleep(10000);
    	da.clickCloseButton();
    	da.logout();
    	//da.clickUplaodLink();
    	//Thread.sleep(20000);
    }
    
    
	
	
	
   // @Test(groups = {"oneDrive1"}, dataProvider = "loginData", description ="one Drive")
    public void loginAsValidUser(final TestEntity testEntity, final User user) throws Exception {
    	DriveAction da= new DriveAction();
    	
    	user.setUserID("*********@hotmail.com");
    //	user.setUserID("*********2");
    	user.setPassword("Test12!@");
    	
    	da.driveLogin("onedrive", user);
    	da.getListFiles();
    	da.getFolderList();
    	da.getFileList();
    	da.clickFileCheckbox(0);
    	da.clickSherLink();
    	da.typeInEmailTo("****@gmail.com");
    	da.typeInQuickNote("This is for you");
    	da.clickShareButton();
    	da.clickCloseButton();
    	//da.clickUplaodLink();
    	Thread.sleep(20000);
    	//da.getAllResourceListSize();
    	da.logout();
    	//driveLogin("box", user);
    	//driveLogin("dropbox", user);
    	
    	//user.setUserID("*********2");
        	//user.setPassword("Test12!@");
        //	driveLogin("gdrive", user);
        	
        	//getFileList();
    	//ap.verifyDocumentationDropDown();
    }
    
    
   /* public void driveLogin(String driveName, User user) throws Exception{
    	
    	DriveLoginPage tlp= new DriveLoginPage(driveName);
    	tlp.loginToDrive(user);
    	Thread.sleep(8000);
    	
    
    }
    
    
 public void getFilelist() throws Exception{
    
	 DriveAction da= new DriveAction();
	 da.getListFiles();
    	
    }
    */
    
    
    /* @DataProvider(name = "loginData", parallel = true)
    public static Iterator<Object[]> getUserInfo(final Method m, final ITestContext testContext) throws Exception {
        Filter filter = Filter.equalsIgnoreCase(TestEntity.TEST_METHOD, m.getName());

        LinkedHashMap<String, Class<?>> classMap = new LinkedHashMap<String, Class<?>>();
        classMap.put("TestEntity", TestEntity.class);
        classMap.put("User", User.class);

        return SpreadSheetHelper.getEntitiesFromSpreadsheet(OneDriveOperations.class, classMap, "loginuser.csv", 0, null,
                filter);
    }*/
    
  
}
