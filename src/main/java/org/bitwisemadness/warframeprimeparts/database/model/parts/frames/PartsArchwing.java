package org.bitwisemadness.warframeprimeparts.database.model.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsArchwing;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PartsArchwing extends BaseParts {
    @ManyToOne
    private RequirementsArchwing baseRequirement;

    public PartsArchwing(BasePartsId id, Boolean crafted, RequirementsArchwing baseRequirement) {
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
