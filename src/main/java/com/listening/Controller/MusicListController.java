package com.listening.Controller;

import com.listening.Bean.like;
import com.listening.Bean.music;
import com.listening.Service.LikeServer;
import com.listening.Service.MusicServer;
import com.listening.util.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Misaka
 */
@RestController
@RequestMapping("/listening")
public class MusicListController {
    @Autowired
    MusicServer ms;

    @Autowired
    LikeServer ls;

    @PostMapping("/list")
    public Code listaddlike(int userid,int musicid){
        System.out.println("listaddlike "+musicid+' '+userid+" was called");
        like a=new like();
        a.setMusicID(musicid);
        a.setUserID(userid);
        return ls.insertlike(a);
    }

    @GetMapping("/list")
    public List<music> allmusic(){
        System.out.println("allmusc was called");
        return ms.selectall();
    }


}
