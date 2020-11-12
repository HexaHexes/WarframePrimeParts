package org.bitwisemadness.warframeprimeparts.database.model.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsSentinel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PartsSentinel extends BaseAmounts {
    @ManyToOne
    private RequirementsSentinel baseRequirement;

    public PartsSentinel(BaseAmountsId id, Boolean crafted) {
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