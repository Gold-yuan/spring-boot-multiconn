package com.shihuc.dbconn.dao.mysql;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.shihuc.dbconn.pojo.mysql.MysqlUser;

public interface IMysqlUser {

	@Select("SELECT *  FROM test WHERE id = #{userId}")
	public MysqlUser getUser(int userId);

    @Insert("insert into test (username,  age) values(#{username}, #{age})")
    public int addUser(MysqlUser user);
}
