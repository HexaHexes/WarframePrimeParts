package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsSecondary extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer barrelRequirement;
    private Integer receiverRequirement;

    public RequirementsSecondary() {
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
}
