package com.lywhxy.mybatistest;

import com.lywhxy.mapper.SysUserMapper;
import com.lywhxy.pojo.Sys_user;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test {
	public static void addSysUser() {
		Sys_user user = new Sys_user();
		user.setUser_code("x002");
		user.setUser_name("老王11");
		user.setUser_password("123");
		user.setUser_state(1);
		System.out.println("insert前:" + user);
		SqlSession session = MybatisUtils.getSqlSession();
		int row = session.insert("com.lywhxy.mapper.SysUserMapper.addSysUser", user);
		if (row > 0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
		//新添加的用户id
		System.out.println("insert后：" + user);
		session.commit();
		session.close();
	}
	public static void modifySysUser() {
		//需要修改的对象
		Sys_user user = new Sys_user();
		user.setUser_id(2);//被修改的用户id
		user.setUser_code("s002");
		user.setUser_name("小王");
		user.setUser_password("789");
		//获取SQL Session
		SqlSession session = MybatisUtils.getSqlSession();
		SysUserMapper mapper = session.getMapper(SysUserMapper.class);
		mapper.updateSysUser(user);
		session.commit();
		session.close();
	}
	public static void deleteSysUser() {
		System.out.println("----deleteSysUser----");
		SqlSession session = MybatisUtils.getSqlSession();
		SysUserMapper mapper = session.getMapper(SysUserMapper.class);
		int row = mapper.deleteSysUser(3);
		System.out.println("Row:" + row);
		session.commit();
		session.close();
		System.out.println("=======deleteSysUser======");
	}
	public static void selectOneSysUser() {
		System.out.println("-----selectOneSysUser-----");
		SqlSession session = MybatisUtils.getSqlSession();
		SysUserMapper mapper = session.getMapper(SysUserMapper.class);
		Sys_user user = mapper.selectOneSysUser(2);
		System.out.println(user);
		session.close();
		System.out.println("======selectOneSysUser========");
	}
	
	
	public static void main(String[] args) throws IOException {	     
		//addSysUser();
		//modifySysUser();
		//deleteSysUser();
		selectOneSysUser();
	}
}
