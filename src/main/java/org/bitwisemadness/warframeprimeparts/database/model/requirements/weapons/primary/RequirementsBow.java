package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirement;

import javax.persistence.Entity;

@Entity
public class RequirementsBow extends BaseRequirement {
    private Integer blueprintRequirement;
    private Integer upperLimbRequirement;
    private Integer lowerLimbRequirement;
    private Integer stringRequirement;
    private Integer gripRequirement;

    public RequirementsBow() {
    }

    public RequirementsBow(String name, Integer blueprintRequirement, Integer upperLimbRequirement, Integer lowerLimbRequirement, Integer stringRequirement, Integer gripRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.upperLimbRequirement = upperLimbRequirement;
        this.lowerLimbRequirement = lowerLimbRequirement;
        this.stringRequirement = stringRequirement;
        this.gripRequirement = gripRequirement;
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getUpperLimbRequirement() {
        return upperLimbRequirement;
    }

    public void setUpperLimbRequirement(Integer upperLimbRequirement) {
        this.upperLimbRequirement = upperLimbRequirement;
    }

    public Integer getLowerLimbRequirement() {
        return lowerLimbRequirement;
    }

    public void setLowerLimbRequirement(Integer lowerLimbRequirement) {
        this.lowerLimbRequirement = lowerLimbRequirement;
    }

    public Integer getStringRequirement() {
        return stringRequirement;
    }

    public void setStringRequirement(Integer stringRequirement) {
        this.stringRequirement = stringRequirement;
    }

    public Integer getGripRequirement() {
        return gripRequirement;
    }

    public void setGripRequirement(Integer gripRequirement) {
        this.gripRequirement = gripRequirement;
    }
}
