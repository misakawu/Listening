package com.listening.Controller;

import com.listening.Bean.like;
import com.listening.Bean.music;
import com.listening.Service.LikeServer;
import com.listening.Service.MusicServer;
import com.listening.util.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Misaka
 */
@RestController
@RequestMapping("/listening")
public class SearchController {
    @Autowired
    MusicServer ms;
    @Autowired
    LikeServer ls;
    /**
     * @param key
     * @return 模糊搜索（按歌名）key
     */
    @CrossOrigin(origins = "http://localhost:8090")
    @GetMapping("/search")
    public List<music> search(String key){
        System.out.println("search was called");
        return ms.fuzzysearch(key);
    }

    /**
     * @param userid
     * @param musicid
     * @return
     */
    @CrossOrigin(origins = "http://localhost:8090")
    @PostMapping("/search")
    public Code searchaddlike(int userid, int musicid){
        System.out.println("searchaddlike "+musicid+' '+userid+" was called");
        like a=new like();
        a.setMusicID(musicid);
        a.setUserID(userid);
        return ls.insertlike(a);
    }
}
