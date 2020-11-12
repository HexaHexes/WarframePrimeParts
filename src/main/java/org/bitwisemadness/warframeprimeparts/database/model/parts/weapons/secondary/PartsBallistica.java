package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsBallistica;

import javax.persistence.ManyToOne;

public class PartsBallistica extends BaseAmounts {
    @ManyToOne
    private RequirementsBallistica baseRequirement;

    public PartsBallistica(BaseAmountsId id, Boolean crafted) {
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
