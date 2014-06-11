/*package com.yswsoft.base_web.test.test;

import java.util.List;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yswsoft.base_web.core.page.PageBean;
import com.yswsoft.base_web.core.page.PageList;
import com.yswsoft.base_web.test.test.dao.StudentDao;
import com.yswsoft.base_web.test.test.model.Student;

*//**
 * @author FengJianBo
 * 2014年3月17日 上午11:04:17
 *//*

@Component  
@org.springframework.transaction.annotation.Transactional  
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })  
public class StudentDaoImplTest {
	@Autowired
	private StudentDao studentDao;
	
	//@Test
	@Rollback(false) 
	public void add(){
		Student stu = new Student();
		stu.setName("13dedde");
		stu.setSex("男");
		stu.setAge(23);
		try {
			studentDao.add(stu);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
		
	}
	//@Test
	@Rollback(false)
	public void update(){
		try {
			Student stu = studentDao.findById("1");
			stu.setName("我改我改我改改改");
			studentDao.update(stu);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	public void delete(){
		try {
			this.studentDao.deleteById("test");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	@Test
	public void findAll(){
		List<Student> students;
		try {
			students = studentDao.findAll();
			System.out.println("findAll:"+students);
			PageBean pageBean = new PageBean(1, 5);
			PageList<Student> pageList = studentDao.findAll(pageBean);
			System.out.println("findAll(PageBean):"+pageList);
			Student student = new Student();
			student.setName("test");
			pageList = studentDao.findForList(student, pageBean);
			System.out.println("findForList(T,PageBean):"+pageList);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
		
	}

}
*/