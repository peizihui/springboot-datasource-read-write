package com.carlton.demo.mapper;

import com.carlton.demo.entity.User;
import com.carlton.demo.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/***
 * mybatis Generator 自动生成的mapper类
* <p>Title: UserMapper</p>  
* <p>Description: </p>  
* @author Carlton  
* @date 2018年9月28日
 */
public interface UserMapper {
	long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}