package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsThrowing extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer bladeRequirement;
    private Integer pouchRequirement;

    public RequirementsThrowing() {
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getBladeRequirement() {
        return bladeRequirement;
    }

    public void setBladeRequirement(Integer bladeRequirement) {
        this.bladeRequirement = bladeRequirement;
    }

    public Integer getPouchRequirement() {
        return pouchRequirement;
    }

    public void setPouchRequirement(Integer pouchRequirement) {
        this.pouchRequirement = pouchRequirement;
    }
}
