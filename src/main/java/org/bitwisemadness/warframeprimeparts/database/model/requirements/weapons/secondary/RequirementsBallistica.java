package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsBallistica extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer upperLimbRequirement;
    private Integer lowerLimbRequirement;
    private Integer stringRequirement;
    private Integer receiverRequirement;

    public RequirementsBallistica() {
    }

    public RequirementsBallistica(String name, Integer blueprintRequirement, Integer upperLimbRequirement, Integer lowerLimbRequirement, Integer stringRequirement, Integer receiverRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.upperLimbRequirement = upperLimbRequirement;
        this.lowerLimbRequirement = lowerLimbRequirement;
        this.stringRequirement = stringRequirement;
        this.receiverRequirement = receiverRequirement;
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

    public Integer getReceiverRequirement() {
        return receiverRequirement;
    }

    public void setReceiverRequirement(Integer receiverRequirement) {
        this.receiverRequirement = receiverRequirement;
    }
}
