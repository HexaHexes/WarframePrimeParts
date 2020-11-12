package org.bitwisemadness.warframeprimeparts.database.model.requirements.companions;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirement;

import javax.persistence.Entity;

@Entity
public class RequirementsSentinel extends BaseRequirement {
    private Integer blueprintRequirement;
    private Integer carapaceRequirement;
    private Integer cerebrumRequirement;
    private Integer systemsRequirement;

    public RequirementsSentinel(String name) {
        super(name);
    }

    public RequirementsSentinel(String name, Integer blueprintRequirement, Integer carapaceRequirement, Integer cerebrumRequirement, Integer systemsRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.carapaceRequirement = carapaceRequirement;
        this.cerebrumRequirement = cerebrumRequirement;
        this.systemsRequirement = systemsRequirement;
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getCarapaceRequirement() {
        return carapaceRequirement;
    }

    public void setCarapaceRequirement(Integer carapaceRequirement) {
        this.carapaceRequirement = carapaceRequirement;
    }

    public Integer getCerebrumRequirement() {
        return cerebrumRequirement;
    }

    public void setCerebrumRequirement(Integer cerebrumRequirement) {
        this.cerebrumRequirement = cerebrumRequirement;
    }

    public Integer getSystemsRequirement() {
        return systemsRequirement;
    }

    public void setSystemsRequirement(Integer systemsRequirement) {
        this.systemsRequirement = systemsRequirement;
    }
}
