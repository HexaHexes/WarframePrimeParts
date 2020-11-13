package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsDualSecondaryNoSingle extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer linkRequirement;
    private Integer receiverRequirement;
    private Integer barrelRequirement;

    public RequirementsDualSecondaryNoSingle() {
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

    public Integer getReceiverRequirement() {
        return receiverRequirement;
    }

    public void setReceiverRequirement(Integer receiverRequirement) {
        this.receiverRequirement = receiverRequirement;
    }

    public Integer getBarrelRequirement() {
        return barrelRequirement;
    }

    public void setBarrelRequirement(Integer barrelRequirement) {
        this.barrelRequirement = barrelRequirement;
    }
}
