package org.bitwisemadness.warframeprimeparts.database.model.requirements;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class BaseRequirement {
    @Id
    private String name;

    public BaseRequirement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
