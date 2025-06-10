package kr.co.hanbit;

import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SimpleRestController {
    @RequestMapping("/article")
    public String createArticle(@RequestParam("title")String title,
                                @RequestParam("content")String content){
        return String.format("title=%s/content=%s",title,content);
    }



    @RequestMapping("/")
    public String Hello(){
        return "<h1>Hello<h1> <h3><strong>Backend</strong><h3>";
    }


    @RequestMapping("/bye")
    public String Bye(){
        return "Bye";
    }


    @RequestMapping("/lihuiyong")
    public String Myinfo(){
        return "lihuiyong";
    }
}
