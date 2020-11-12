package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsPrimary;

import javax.persistence.ManyToOne;

public class PartsPrimary extends BaseAmounts {
    @ManyToOne
    private RequirementsPrimary baseRequirement;

    public PartsPrimary(BaseAmountsId id, Boolean crafted) {
        super(id, crafted);
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
