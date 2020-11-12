package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirement;

import javax.persistence.Entity;

@Entity
public class RequirementsMelee extends BaseRequirement {
    private Integer blueprintRequirement;
    private Integer bladeRequirement;
    private Integer handleRequirement;

    public RequirementsMelee() {
    }

    public RequirementsMelee(String name, Integer blueprintRequirement, Integer bladeRequirement, Integer handleRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.bladeRequirement = bladeRequirement;
        this.handleRequirement = handleRequirement;
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
