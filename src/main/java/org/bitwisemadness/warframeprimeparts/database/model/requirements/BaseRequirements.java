package org.bitwisemadness.warframeprimeparts.database.model.requirements;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseRequirements {
    @Id
    private String name;

    public BaseRequirements() {
    }

    public BaseRequirements(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
