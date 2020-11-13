package org.bitwisemadness.warframeprimeparts.database.model.parts;

import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseParts implements IBaseParts {
    @EmbeddedId
    private BasePartsId id;
    private Boolean crafted;

    public BaseParts() {
    }

    public BaseParts(BasePartsId id, Boolean crafted) {
        this.id = id;
        this.crafted = crafted;
    }

    public BasePartsId getId() {
        return id;
    }

    public void setId(BasePartsId id) {
        this.id = id;
    }

    public Boolean getCrafted() {
        return crafted;
    }

    public void setCrafted(Boolean crafted) {
        this.crafted = crafted;
    }
}
