package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;


public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroup("delete");
    returnToGroupPage();
  }

}
