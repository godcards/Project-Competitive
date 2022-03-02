package com.competitive.dao;

import com.competitive.pojo.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TaskMapper {
    @Select("select * from plan where task_title=#{task_title}")
    Task selplanByTask(String taskTitle);

    @Select("select task_title,task_content,author_id from task where author_id=#{authorId}")
    Task selTaskById(String authorId);

    @Insert("insert into studio(task_title,task_content,author_id) values(#{task_title},#{task_content},#{author_id})")
    int insTask(Task task);

    @Update("update task set task_title = #{task_title},task_content = #{task_content},author_id = #{author_id} where task_id = #{task_id}")
    int updTask(Task task);

    @Delete("delete from task where task_id=#{task_id}")
    int delTask(int taskId);
}
