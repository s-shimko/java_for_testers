package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;

public class ContactCreationTests extends TestBase {
  
  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactCreation();
    File photo = new File("");
    app.getContactHelper().fillContactForm(new ContactData().withPhoto(photo), true);
    app.getContactHelper().submitContactCreation("submit");
    app.getContactHelper().returnToHomePage();
  }

//  @Test
//  public void testCurrentDir() {
//    File currentDir = new File("src/test/resources/bird.png");
//    System.out.println(currentDir.getAbsolutePath());
//    File photo = new File("src/test/resources/bird.png");
//    System.out.println(photo.getAbsolutePath());
//    System.out.println(photo.exists());
//
//  }
}
