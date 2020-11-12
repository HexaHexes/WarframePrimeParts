package org.bitwisemadness.warframeprimeparts.database.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AppUser {
    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
