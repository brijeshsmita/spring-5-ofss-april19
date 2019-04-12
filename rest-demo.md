1.  Using STS, New Project (Ctrl+N)

        project :   demo-rest
        package:    com.mahendra
        packaging:  JAR

        dependencies:   web

2.  Create new class "MyMessage" with following code

        public class MyMessage {
            private String message;
            private String user;
            // TODO: Generate Getters , Setters & Constructor

        }

3.  Create a new class "HomeController" with following code:

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        @RestController //Inform Spring Boot project
                        //This controller DOESNOT return VIEW
                        //Its return MODEL data
        public class HomeController {

            @RequestMapping("/")
            public MyMessage home() {
                return new MyMessage("Hello World","Mahendra");
            }
        }

4.  Locate "DemoRestApplication.java" (The Main class Generated bt STS)

    Right Click inside java file > Run as Java Application.

