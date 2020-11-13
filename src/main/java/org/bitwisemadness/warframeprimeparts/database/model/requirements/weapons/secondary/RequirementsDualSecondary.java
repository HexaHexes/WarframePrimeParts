package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsDualSecondary extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer linkRequirement;
    private Integer secondaryRequirement;

    public RequirementsDualSecondary() {
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getLinkRequirement() {
        return linkRequirement;
    }

    public void setLinkRequirement(Integer linkRequirement) {
        this.linkRequirement = linkRequirement;
    }

    public Integer getSecondaryRequirement() {
        return secondaryRequirement;
    }

    public void setSecondaryRequirement(Integer secondaryRequirement) {
        this.secondaryRequirement = secondaryRequirement;
    }
}
