package com.listening.Controller;

import com.listening.Bean.like;
import com.listening.Service.LikeServer;
import com.listening.util.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hahahai
 *
 * @函数1 public List<like> selectbyuid(@PathVariable int id)
 */
@RestController
@RequestMapping("/listening/like")
public class UserLikeController {
    @Autowired
    LikeServer ls;
    @CrossOrigin(origins = "*")
    @GetMapping("/{userid}")
    public List<like> selectbyuid(@PathVariable int userid){
        System.out.println("selectbyuid was called");
        return ls.findbyuserid(userid);
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/{userid}")
    public Code deletelike(@PathVariable int userid, int musicid){
        System.out.println("deletelike was called");
        return ls.deletelike(userid,musicid);
    }


}
