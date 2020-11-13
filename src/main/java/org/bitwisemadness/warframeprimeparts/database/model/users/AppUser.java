package org.bitwisemadness.warframeprimeparts.database.model.users;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "AppUser.findByName", query = "SELECT u FROM AppUser u WHERE u.name= :name")
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
