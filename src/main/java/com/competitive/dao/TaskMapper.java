package com.competitive.dao;

import com.competitive.pojo.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TaskMapper {

//    //查询所有的任务
//    @Select("select * from task")
//    List<List> selAllTask();

    //查询任务根据标题
    @Select("select * from task where task_title=#{taskTitle}")
    List<Task> selTaskBytitle(String taskTitle);

    //查询任务根据作者的名字
    @Select("select task_title,task_content,author_id,create_time,update_time from task where author_id=#{authorId}")
    List<Task> selTaskById(String authorId);

    //添加任务
    @Insert("insert into task(task_title,task_content,author_id,create_time,end_time,start_time) " +
            "values(#{taskTitle},#{taskContent},#{authorId},#{createTime},#{endTime},#{startTime})")
    int insTask(Task task);

    //更改任务
    @Update("update task set task_title = #{taskTitle},task_content = #{taskContent}," +
            "update_time = #{updateTime},start_time = #{startTime},end_time = #{endTime} where task_id = #{taskId}")
    int updTask(Task task);

    //删除任务
    @Delete("delete from task where task_id=#{taskId}")
    int delTask(int taskId);
}
