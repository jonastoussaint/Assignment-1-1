import java.time.LocalDate;
import java.time.Period;

public class HealthProfile
{

  //Private Member data
  private String first;
  private String last; 
  private String gender;
  private double height;
  private double weight;
  private int month;
  private int day;
  private int year;
  
  //Default Constructor
  public HealthProfile()
  {
    this.first = "";
    this.last = "";
    this.gender = "";
    this.height = 0.0;
    this.weight = 0.0;
    this.month = 0;
    this.day = 0;
    this.year = 0;
  }
  
  //Constructor with parameters
  public HealthProfile(String first, String last, String gender,
  double height, double weight, int month, int day, int year)
  {
    this.first = first;
    this.last = last;
    this.gender = gender;
    this.height = height;
    this.weight = weight;
    this.month = month;
    this.day = day;
    this.year = year;
  }
  
  //This function sets the first name
  public void setFirst(String first)
  {
    this.first = first;
  }
  
  //This function gets the first name
  public String getFirst()
  {
    return first;
  }

  //This function sets the last name
  public void setLast(String last)
  {
    this.last = last;
  }
  
  //This function returns the last name
  public String getLast()
  {
    return last;
  }
  
  //This function sets the height
  public void setHeight(double height)
  {
    this.height = height;
  }
  
  //This function returns the height
  public double getHeight()
  {
    return height;
  }
  
  //This function sets the weight
  public void setWeight(double weight)
  {
    this.weight = weight;
  }

  //This function returns the weight
  public double getWeight()
  {
    return weight;
  }
  
  //This function sets the month
  public void setMonth(int month)
  {
    if((month == 1) || (month == 2) || (month == 3) || (month == 4) || (month == 5) || (month == 6) || (month == 7) 
       || (month == 8) || (month == 9) || (month == 10)|| (month == 11)|| (month == 12))
    {
      this.month = month;
    }
    
  }
  
  //This function returns the month
  public int getMonth()
  {
    return month;
  }
  
  //This function sets the day
  public void setDay(int day)
  {
    this.day = day;
  }
  
  //This function returns the day
  public int getDay()
  {
    return day;
  }
  
  //This function sets the year
  public void setYear(int year)
  {
    if(year >= 1900)
    {
      this.year = year;
    }
    
  }
  
  //This function returns the year
  public int getYear()
  {
    return year;
  }
  
  //This function sets the gender
  public void setGender(String gender)
  {
    /*//If male set to male
    if((gender == "Male") || (gender == "male") )
    {
      this.gender = gender;
    }
    //If female set to female
    else if((gender == "Female") || (gender == "female"))
    {
      this.gender = gender;
    }
    else 
    System.out.println("Error!!");
    */
    
    this.gender = gender;
  }
  
  public String getGender()
  {
    return gender;
  }
  
  public int getAge()
  {
    LocalDate today = LocalDate.now();
    LocalDate birthrate = LocalDate.of(year, month, day);
    int age = Period.between(birthrate, today).getYears(); 
    
    return age;  
  }
}