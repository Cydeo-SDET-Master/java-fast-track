package day2;

public class Ex05MethodChaining {

    public static void main(String[] args) {

        String s = "    Hello World    ";

        System.out.println(s.trim().charAt(0));
        System.out.println(s.trim().toLowerCase().substring(0,2));
        System.out.println(s
                .trim()
                .substring(0, s.trim().indexOf(" "))
                .toLowerCase()
                .equals("hello")
        );


        /*
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         */

        /*
        new Select(driver.findElement(By.id("dropdown"))).getFirstSelectedOption().getText();
         */

        /*
                given().log().body()
                .contentType(ContentType.JSON)
                .pathParam("id",id)
                .body(requestBody)
                .when().put("/api/spartans/{id}")
                .then().statusCode(204);
         */

    }
}
