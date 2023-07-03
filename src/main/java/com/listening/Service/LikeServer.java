package com.listening.Service;

import com.listening.Bean.like;
import com.listening.Mapper.LikeMapper;
import com.listening.util.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeServer {
    @Autowired
    LikeMapper lm;

    public List<like> findbyuserid(int id){
        return lm.findbyuserid(id);
    }

    public like findbymusicid(int id){
        return lm.findbymusicid(id);
    }

    public Code insertlike(like a){
        Code x=new Code(11,"添加收藏失败","failed");
        try{
            if (lm.insertlike(a)==1){
                x.setDescription("添加收藏成功");
                x.setData("success");
                x.setType(10);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return x;
    }

    public Code deletelike(int UserID, int MusicID){
        Code x=new Code(12,"删除收藏失败","failed");
        try{
            if (lm.deletelike(UserID,MusicID)==1) {
                x.setData("success");
                x.setType(13);
                x.setDescription("删除收藏成功");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return x;
    }
}