package kr.or.dgit.mybatis_dev;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.services.CourseService;

public class CourseServiceTest {
	private static CourseService courseService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		courseService = new CourseService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
		courseService = null;
	}

	/*@Test
	public void aTestSearchCourse() {
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);
		param.put("courseName", "%java%");
		param.put("startDate", "2013-01-01");
		param.put("endDate", "2013-05-01");
		List<Course> searchCourse = courseService.searchCourse(param);
		Assert.assertNotNull(searchCourse);		
		
	}
	
	@Test
	public void bTestSearchCaseCourse() {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("searchBy", "Tutor");
		param.put("tutorId", 1);
		
		List<Course> courses = courseService.searchCaseCourse(param);
			
		
		param.replace("searchBy", "CouseName");
		param.remove("tutorId");
		param.put("courseName", "%java%");
		courses = courseService.searchCaseCourse(param);
		
	}*/
	
/*	@Test
	public void cTestSearchWhereCourses() {
		Map<String, Object> param = new HashMap<String, Object>();		
		
		List<Course> courses = courseService.searchWhereCourses(param);
			
		
		param.put("tutorId",1);		
		courses = courseService.searchWhereCourses(param);
		
		param.put("courseName","%java%");		
		courses = courseService.searchWhereCourses(param);
		
		param.clear();
		param.put("endDate", new Date());
		courses = courseService.searchWhereCourses(param);
		
	}*/
	
	/*@Test
	public void dTestSearchTrimCourses() {
		Map<String, Object> param = new HashMap<String, Object>();		
		
		List<Course> courses = courseService.searchTrimCourses(param);
			
		
		param.put("tutorId",1);		
		courses = courseService.searchTrimCourses(param);
		
		param.put("courseName","%java%");		
		courses = courseService.searchTrimCourses(param);			
		
	}*/
	/*@Test
	public void eTestSearchForeachCoursesByTutors() {
		Map<String, Object> param = null;
		List<Course> searchForEachCourse = courseService.searchForeachCoursesByTutors(param);
		
		List<Integer> tutorIds = new ArrayList<>();
		tutorIds.add(2);
		
		param = new HashMap<String, Object>();
		param.put("tutorIds", tutorIds);
		
		searchForEachCourse =courseService.searchForeachCoursesByTutors(param);
		tutorIds.add(1);
		searchForEachCourse =courseService.searchForeachCoursesByTutors(param);
		Assert.assertNotNull(searchForEachCourse);
	}*/

}
