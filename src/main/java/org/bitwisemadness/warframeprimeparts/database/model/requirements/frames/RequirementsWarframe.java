package org.bitwisemadness.warframeprimeparts.database.model.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirement;

import javax.persistence.Entity;

@Entity
public class RequirementsWarframe extends BaseRequirement {
    private Integer blueprintRequirement;
    private Integer chassisRequirement;
    private Integer neuropticsRequirement;
    private Integer systemsRequirement;

    public RequirementsWarframe() {
    }

    public RequirementsWarframe(String name, Integer blueprintRequirement, Integer chassisRequirement, Integer neuropticsRequirement, Integer systemsRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.chassisRequirement = chassisRequirement;
        this.neuropticsRequirement = neuropticsRequirement;
        this.systemsRequirement = systemsRequirement;
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getChassisRequirement() {
        return chassisRequirement;
    }

    public void setChassisRequirement(Integer chassisRequirement) {
        this.chassisRequirement = chassisRequirement;
    }

    public Integer getNeuropticsRequirement() {
        return neuropticsRequirement;
    }

    public void setNeuropticsRequirement(Integer neuropticsRequirement) {
        this.neuropticsRequirement = neuropticsRequirement;
    }

    public Integer getSystemsRequirement() {
        return systemsRequirement;
    }

    public void setSystemsRequirement(Integer systemsRequirement) {
        this.systemsRequirement = systemsRequirement;
    }
}
