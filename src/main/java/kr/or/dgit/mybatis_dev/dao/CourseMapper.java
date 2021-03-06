package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Course;

public interface CourseMapper {
	List<Course> searchCourse(Map<String, Object> param);
	List<Course> searchCaseCourse(Map<String, Object> param);
	List<Course> searchWhereCourses(Map<String, Object> param);
	List<Course> searchTrimCourses(Map<String, Object> param);
	List<Course> searchForeachCoursesByTutors(Map<String, Object> param);
}
