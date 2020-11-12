package org.bitwisemadness.warframeprimeparts.database.model.amounts;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class BaseAmounts implements IBaseAmounts {
    @Id
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
