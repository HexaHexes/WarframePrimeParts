package org.bitwisemadness.warframeprimeparts.database.model.parts;

import java.io.Serializable;
import java.util.Objects;

public class BasePartsId implements Serializable {
    private String name;
    private String appUser;

    public BasePartsId() {
    }

    public BasePartsId(String name, String appUser) {
        this.name = name;
        this.appUser = appUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppUser() {
        return appUser;
    }

    public void setAppUser(String appUser) {
        this.appUser = appUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasePartsId)) return false;
        BasePartsId that = (BasePartsId) o;
        return name.equals(that.name) &&
                appUser.equals(that.appUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appUser);
    }
}
