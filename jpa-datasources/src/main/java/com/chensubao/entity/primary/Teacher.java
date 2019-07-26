package com.chensubao.entity.primary;

import com.chensubao.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @author chensubao
 * @date 2019/7/26 15:43
 */
@Data
@Entity
@Table(name = "teacher")
@EqualsAndHashCode(callSuper = true)
public class Teacher extends BaseEntity implements Serializable {

    private String name;

    private Integer level;
}
