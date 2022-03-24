package com.lywhxy.mapper;

import java.util.List;

import com.lywhxy.pojo.Sys_user;

public interface SysUserMapper {
	//更新数据库的操作返回类型都是int ，受影响的行。
	int addSysUser(Sys_user sys_user);

	//更新操作
	int updateSysUser(Sys_user sys_user);

	int deleteSysUser(int id);

	//List<Sys_user> selectSysUser();

}
