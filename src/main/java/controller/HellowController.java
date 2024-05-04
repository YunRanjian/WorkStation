package controller;

public class HellowController {
    @RequestMapping("/Hellow")
    public String Hellow() {
        return "Hellow World!";
    }
}
