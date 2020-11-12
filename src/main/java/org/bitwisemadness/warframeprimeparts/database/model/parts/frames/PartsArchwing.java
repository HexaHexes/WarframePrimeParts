package org.bitwisemadness.warframeprimeparts.database.model.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsArchwing;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PartsArchwing extends BaseAmounts {
    @ManyToOne
    private RequirementsArchwing baseRequirement;

    public PartsArchwing(BaseAmountsId id, Boolean crafted, RequirementsArchwing baseRequirement) {
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
