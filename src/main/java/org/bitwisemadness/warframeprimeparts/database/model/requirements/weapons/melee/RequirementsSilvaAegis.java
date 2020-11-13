package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsSilvaAegis extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer bladeRequirement;
    private Integer guardRequirement;
    private Integer hiltRequirement;

    public RequirementsSilvaAegis() {
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

    public Integer getGuardRequirement() {
        return guardRequirement;
    }

    public void setGuardRequirement(Integer guardRequirement) {
        this.guardRequirement = guardRequirement;
    }

    public Integer getHiltRequirement() {
        return hiltRequirement;
    }

    public void setHiltRequirement(Integer hiltRequirement) {
        this.hiltRequirement = hiltRequirement;
    }
}
