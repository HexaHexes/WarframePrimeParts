package org.bitwisemadness.warframeprimeparts.database.model.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsWarframe;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PartsWarframe extends BaseParts {
    @ManyToOne
    private RequirementsWarframe baseRequirement;

    public PartsWarframe(BasePartsId id, Boolean crafted, RequirementsWarframe baseRequirement) {
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
