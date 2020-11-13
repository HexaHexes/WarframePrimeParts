package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsTipedo extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer handleRequirement;
    private Integer ornamentRequirement;

    public RequirementsTipedo() {
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getHandleRequirement() {
        return handleRequirement;
    }

    public void setHandleRequirement(Integer handleRequirement) {
        this.handleRequirement = handleRequirement;
    }

    public Integer getOrnamentRequirement() {
        return ornamentRequirement;
    }

    public void setOrnamentRequirement(Integer ornamentRequirement) {
        this.ornamentRequirement = ornamentRequirement;
    }
}
