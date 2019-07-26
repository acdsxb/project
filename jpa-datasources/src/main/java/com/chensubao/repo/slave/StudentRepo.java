package com.chensubao.repo.slave;

import com.chensubao.entity.slave.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by IntelliJ IDEA.
 *
 * @author chensubao
 * @date 2019/7/26 16:04
 */
public interface StudentRepo extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {
}
