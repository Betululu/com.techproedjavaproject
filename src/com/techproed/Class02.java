package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02 {
   // 1. Yeni bir class oluşturun :Homework
   //2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın, Değilse, doğru başlığı(Actual title) yazdırın.
   //  3. Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
   //   4. Ardından Navigate to https://www.walmart.com/
    //   5. Walmart sayfa başlığının "Walmart.com" içerip içermediğini(contains) doğrulayın
    // 6. Navigate back to facebook
     // 7. Sayfayı yenileyin(refresh)
   //8. Maximize the window
  //9. Close the browse
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("http://facebook.com");
        String sayfabas = driver.getTitle();
        System.out.println(sayfabas);
        if(sayfabas.toLowerCase().contains("facebook")){
            System.out.println("Bu kelimeyi iceriyor:");
        }else {
            System.out.println("Bu kelimeyi icermiyor");
        }
        String sayfaurl = driver.getCurrentUrl();
        System.out.println(sayfaurl);

        if(sayfaurl.toLowerCase().contains("facebook")){
            System.out.println("bu kelimeyi iceriyor:");
        }else {
            System.out.println("Bu kelimeyi icermiyor");
        }
         driver.navigate().to("http://Walmart.com");
        if(sayfabas.contains("Walmart")){
            System.out.println("bu kelimeyi iceriyor:");
        }else {
            System.out.println("Bu kelimeyi icermiyor");
        }

         driver.navigate().back();
         driver.navigate().refresh();
         driver.quit();



    }
}
