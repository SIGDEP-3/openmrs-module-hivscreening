package org.openmrs.module.hivscreening;

import org.openmrs.BaseOpenmrsObject;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractObject extends BaseOpenmrsObject implements Serializable {
    public AbstractObject() {
    }

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public void setId(Integer integer) {
    }

    @Override
    public void setUuid(String uuid) {
        super.setUuid(uuid);
    }

}
