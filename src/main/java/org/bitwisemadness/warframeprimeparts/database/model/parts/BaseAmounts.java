package org.bitwisemadness.warframeprimeparts.database.model.parts;

import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseAmounts implements IBaseAmounts {
    @EmbeddedId
    private BaseAmountsId id;
    private Boolean crafted;

    public BaseAmounts(BaseAmountsId id, Boolean crafted) {
        this.id = id;
        this.crafted = crafted;
    }

    public BaseAmountsId getId() {
        return id;
    }

    public void setId(BaseAmountsId id) {
        this.id = id;
    }

    public Boolean getCrafted() {
        return crafted;
    }

    public void setCrafted(Boolean crafted) {
        this.crafted = crafted;
    }
}
