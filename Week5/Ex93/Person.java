package Week5.Ex93;

import java.time.LocalDate;

public class Person {
  private String name;
  private LocalDate birthday;

  public Person(String name, int day, int month, int year) {
    this.name = name;
    this.birthday = LocalDate.of(year, month, day);
  }

  public int ageInYears() {
    LocalDate currentDate = LocalDate.now();
    int age = currentDate.compareTo(this.birthday);

    return age;
  }

  public boolean olderThan(Person comparedPerson) {
    return ageInYears() > comparedPerson.ageInYears() ? true : false;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return this.name + ", birthday: " + this.birthday;
  }
}
