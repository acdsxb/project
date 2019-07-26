package com.chensubao.entity.slave;

import com.chensubao.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @author chensubao
 * @date 2019/7/26 15:54
 */
@Data
@Entity
@Table(name = "student")
@EqualsAndHashCode(callSuper = true)
public class Student extends BaseEntity implements Serializable {

    @Column(name = "stu_name")
    private String stuName;
}
