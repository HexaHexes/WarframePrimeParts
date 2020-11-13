package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsCrossbow extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer barrelRequirement;
    private Integer receiverRequirement;
    private Integer stringRequirement;
    private Integer gripRequirement;

    public RequirementsCrossbow() {
    }

    public RequirementsCrossbow(String name, Integer blueprintRequirement, Integer barrelRequirement, Integer receiverRequirement, Integer stringRequirement, Integer gripRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.barrelRequirement = barrelRequirement;
        this.receiverRequirement = receiverRequirement;
        this.stringRequirement = stringRequirement;
        this.gripRequirement = gripRequirement;
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getBarrelRequirement() {
        return barrelRequirement;
    }

    public void setBarrelRequirement(Integer barrelRequirement) {
        this.barrelRequirement = barrelRequirement;
    }

    public Integer getReceiverRequirement() {
        return receiverRequirement;
    }

    public void setReceiverRequirement(Integer receiverRequirement) {
        this.receiverRequirement = receiverRequirement;
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
