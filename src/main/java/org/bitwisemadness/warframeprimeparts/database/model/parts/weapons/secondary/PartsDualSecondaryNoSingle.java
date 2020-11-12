package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsDualSecondaryNoSingle;

import javax.persistence.ManyToOne;

public class PartsDualSecondaryNoSingle extends BaseAmounts {
    @ManyToOne
    private RequirementsDualSecondaryNoSingle baseRequirement;

    public PartsDualSecondaryNoSingle(BaseAmountsId id, Boolean crafted) {
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
