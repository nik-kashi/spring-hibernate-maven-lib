package com.mohi.spring.daos;

import com.mohi.spring.models.Task;
import org.springframework.stereotype.Repository;


/**
 * Created by saeed on 1/March/15 AD.
 */

@Repository
public class TaskDaoImpl extends GenericDaoImpl<Task, Long> implements TaskDao {

}