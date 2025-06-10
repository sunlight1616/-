package kr.co.hanbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Bookmark {

    private List<Bookmark> bookmarks = new ArrayList<>();

    @RequestMapping(method = RequestMethod.POST, path = "/bookmark")
    public String registerBookmark(@RequestBody Bookmark bookmark){
        return "registered";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/bookmarks")
    public List<Bookmark> getBookmarks(){
        return bookmarks;
    }
}
