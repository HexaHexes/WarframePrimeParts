package org.bitwisemadness.warframeprimeparts.database.model.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsWarframe;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PartsWarframe extends BaseAmounts {
    @ManyToOne
    private RequirementsWarframe baseRequirement;

    public PartsWarframe(BaseAmountsId id, Boolean crafted, RequirementsWarframe baseRequirement) {
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
