package it.com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import it.com.entity.User;

public interface UserMapper {

    @Select("SELECT * FROM user")
    @Results({
        @Result(property = "id",  column = "id"),
        @Result(property = "userName", column = "username")
    })
    List<User> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
        @Result(property = "id",  column = "id"),
        @Result(property = "userName", column = "username"),
    })
    User getOne(Integer id);

    @Insert("INSERT INTO user(username) VALUES(#{userName})")
    void insert(User user);

    @Update("UPDATE user SET userName=#{userName} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Integer id);

}
