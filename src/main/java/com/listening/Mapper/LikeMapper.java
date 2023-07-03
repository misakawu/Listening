package com.listening.Mapper;

import com.listening.Bean.like;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LikeMapper {
    @Select("select * from `like` where Userid = #{id}")
    List<like> findbyuserid(int id);

    @Select("select * from `like` where MusicID = #{id}")
    like findbymusicid(int id);

    @Insert("insert into `like` values(#{likeID},#{MusicID},#{UserID})")
    int insertlike(like a);

    @Delete("Delete from `like` where UserID = #{userid} AND MusicID = #{musicid}")
    int deletelike(@Param("userid") int userid,@Param("musicid") int musicid);
}