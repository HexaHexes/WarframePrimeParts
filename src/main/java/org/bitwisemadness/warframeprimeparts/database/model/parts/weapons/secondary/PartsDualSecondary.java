package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsDualSecondary;

import javax.persistence.ManyToOne;

public class PartsDualSecondary extends BaseAmounts {
    @ManyToOne
    private RequirementsDualSecondary baseRequirement;

    public PartsDualSecondary(BaseAmountsId id, Boolean crafted) {
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
