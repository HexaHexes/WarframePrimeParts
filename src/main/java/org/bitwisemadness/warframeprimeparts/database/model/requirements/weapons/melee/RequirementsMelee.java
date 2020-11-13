package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsMelee extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer bladeRequirement;
    private Integer handleRequirement;

    public RequirementsMelee() {
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

    public Integer getHandleRequirement() {
        return handleRequirement;
    }

    public void setHandleRequirement(Integer handleRequirement) {
        this.handleRequirement = handleRequirement;
    }
}
