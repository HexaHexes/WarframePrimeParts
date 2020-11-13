package org.bitwisemadness.warframeprimeparts.database.model.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsSentinel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PartsSentinel extends BaseParts {
    @ManyToOne
    private RequirementsSentinel baseRequirement;

    public PartsSentinel(BasePartsId id, Boolean crafted) {
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
