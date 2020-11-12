package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PartsTipedo extends BaseAmounts {
    @ManyToOne
    private PartsTipedo baseRequirement;

    public PartsTipedo(BaseAmountsId id, Boolean crafted, PartsTipedo baseRequirement) {
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
