package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PartsTipedo extends BaseParts {
    @ManyToOne
    private PartsTipedo baseRequirement;

    public PartsTipedo(BasePartsId id, Boolean crafted, PartsTipedo baseRequirement) {
        super(id, crafted);
        this.baseRequirement = baseRequirement;
    }

    @Override
    public Boolean hasFullSet() {
        return null;
    }

    @Override
    public Integer getFullSets() {
        return null;
    }
}
