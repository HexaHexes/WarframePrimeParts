package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirement;

import javax.persistence.Entity;

@Entity
public class RequirementsSilvaAegis extends BaseRequirement {
    private Integer blueprintRequirement;
    private Integer bladeRequirement;
    private Integer guardRequirement;
    private Integer hiltRequirement;

    public RequirementsSilvaAegis() {
    }

    public RequirementsSilvaAegis(String name, Integer blueprintRequirement, Integer bladeRequirement, Integer guardRequirement, Integer hiltRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.bladeRequirement = bladeRequirement;
        this.guardRequirement = guardRequirement;
        this.hiltRequirement = hiltRequirement;
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
