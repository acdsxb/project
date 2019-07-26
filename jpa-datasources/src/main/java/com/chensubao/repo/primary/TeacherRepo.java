package com.chensubao.repo.primary;

import com.chensubao.entity.primary.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by IntelliJ IDEA.
 *
 * @author chensubao
 * @date 2019/7/26 16:03
 */
public interface TeacherRepo extends JpaRepository<Teacher, Long>, JpaSpecificationExecutor<Teacher> {
}
