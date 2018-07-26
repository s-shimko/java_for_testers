package ru.stqa.pft.addressbook.model;

import java.io.File;

public class ContactData {

  private String firstname;
  private String secondname;
  private String group;

  private File photo;

  public ContactData(){};

  public ContactData(String firstname, String secondname, String group) {
    this.firstname = firstname;
    this.secondname = secondname;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getSecondname() {
    return secondname;
  }

  public String getGroup() {
    return group;
  }

  public File getPhoto() {
    return photo;
  }

  public ContactData withPhoto(File photo) {
    this.photo = photo;
    return this;
  }

//  public ContactData infoFromEditForm(ContactData contact) {
//    initContactModificationById(contact.getId());
//    }
}
