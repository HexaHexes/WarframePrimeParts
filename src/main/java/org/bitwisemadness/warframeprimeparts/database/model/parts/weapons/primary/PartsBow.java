package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsBow;

import javax.persistence.ManyToOne;

public class PartsBow extends BaseAmounts {
    @ManyToOne
    private RequirementsBow baseRequirement;

    public PartsBow(BaseAmountsId id, Boolean crafted) {
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
