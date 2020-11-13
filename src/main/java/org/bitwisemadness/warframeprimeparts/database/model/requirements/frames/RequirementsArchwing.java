package org.bitwisemadness.warframeprimeparts.database.model.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsArchwing extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer harnessRequirement;
    private Integer systemsRequirement;
    private Integer wingsRequirement;

    public RequirementsArchwing() {
    }

    public RequirementsArchwing(String name, Integer blueprintRequirement, Integer harnessRequirement, Integer systemsRequirement, Integer wingsRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.harnessRequirement = harnessRequirement;
        this.systemsRequirement = systemsRequirement;
        this.wingsRequirement = wingsRequirement;
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getHarnessRequirement() {
        return harnessRequirement;
    }

    public void setHarnessRequirement(Integer harnessRequirement) {
        this.harnessRequirement = harnessRequirement;
    }

    public Integer getSystemsRequirement() {
        return systemsRequirement;
    }

    public void setSystemsRequirement(Integer systemsRequirement) {
        this.systemsRequirement = systemsRequirement;
    }

    public Integer getWingsRequirement() {
        return wingsRequirement;
    }

    public void setWingsRequirement(Integer wingsRequirement) {
        this.wingsRequirement = wingsRequirement;
    }
}
