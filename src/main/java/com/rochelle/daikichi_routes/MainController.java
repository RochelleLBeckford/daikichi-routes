package com.rochelle.daikichi_routes;
//? Pair Programming -> Dominic Bass

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//& Create a new controller called DaikichiController, and be sure you annotate it as a @RestController
@RestController // signifies that this is now the controller for my app
//? How to shorten it so no repetition -> not have to always keep typing /daikichi
// -> put @RequestMapping under rest controller for /daikichi and them remove it from the other routes

//* Note -> if just go to localhost:8080 wiill get the whitelabel error page -> since there is no controller set for this
// -> spring will check static files for something
// -> if go to static and make plain ol html it will show instead of the error page
// -> can add regular tags from html -> even a link tag to act as the links to all the routes we created
// -> it will look alot cleanerimport org.springframework.web.bind.annotation.RestController;
@RequestMapping("/daikichi")


public class MainController {
    // once setup as rest controller now to setup routes -> tell my app what to do when it hits a certain route 
    // route -> when see this route do this 
    // when see this route run this function

    //& Have an http GET request to 'http://localhost:8080/daikichi' display text that says 'Welcome!'
    // @RequestMapping("/daikichi")
    @RequestMapping("")
    // going to retunn a string 
    public String index(){
        // return whatever I want it to return when i go to this route
        
        // return "<h1>Welcome!</h1>";

        //~ What if want welcome to be an h1
        // -> if just returning a string can put the h1 tag around the welcome
            // -> if want to link it back to the index can just add anchor tag w/ the route
        return "<h1>Welcome!</h1><a href=\"/\">Home</a>";
    }

    //& Have an http GET request to 'http://localhost:8080/daikichi/today' display text that says 'Today you will find luck in all your endeavors!'
    // @RequestMapping("/today")
    @RequestMapping("/today")
    public String today() {
        // return "<h2>Today you will find luck in all your endeavors!</h2>";
        return "<h2>Today you will find luck in all your endeavors!</h2><a href=\"/\">Home</a>";
    }

    //& Have an http GET request to 'http://localhost:8080/daikichi/tomorrow' display text that says 'Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'
    // @RequestMapping("/daikichi/tomorrow")
    @RequestMapping("/tomorrow")
    public String tomorrow() {
        // return "<h2>Tomorrow, an opportunity will arise, so be sure to be open to new ideas!</h2>";
        return "<h2>Tomorrow, an opportunity will arise, so be sure to be open to new ideas!</h2><a href=\"/\">Home</a>";
    }
}
