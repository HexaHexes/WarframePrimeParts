package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsSilvaAegis;

import javax.persistence.ManyToOne;

public class PartsSilvaAegis extends BaseAmounts {
    @ManyToOne
    private RequirementsSilvaAegis baseRequirement;

    public PartsSilvaAegis(BaseAmountsId id, Boolean crafted) {
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
