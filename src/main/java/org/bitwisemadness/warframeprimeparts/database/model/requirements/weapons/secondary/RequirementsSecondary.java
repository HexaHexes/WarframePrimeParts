package org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.BaseRequirements;

import javax.persistence.Entity;

@Entity
public class RequirementsSecondary extends BaseRequirements {
    private Integer blueprintRequirement;
    private Integer barrelLimbRequirement;
    private Integer receiverLimbRequirement;

    public RequirementsSecondary() {
    }

    public RequirementsSecondary(String name, Integer blueprintRequirement, Integer barrelLimbRequirement, Integer receiverLimbRequirement) {
        super(name);
        this.blueprintRequirement = blueprintRequirement;
        this.barrelLimbRequirement = barrelLimbRequirement;
        this.receiverLimbRequirement = receiverLimbRequirement;
    }

    public Integer getBlueprintRequirement() {
        return blueprintRequirement;
    }

    public void setBlueprintRequirement(Integer blueprintRequirement) {
        this.blueprintRequirement = blueprintRequirement;
    }

    public Integer getBarrelLimbRequirement() {
        return barrelLimbRequirement;
    }

    public void setBarrelLimbRequirement(Integer barrelLimbRequirement) {
        this.barrelLimbRequirement = barrelLimbRequirement;
    }

    public Integer getReceiverLimbRequirement() {
        return receiverLimbRequirement;
    }

    public void setReceiverLimbRequirement(Integer receiverLimbRequirement) {
        this.receiverLimbRequirement = receiverLimbRequirement;
    }
}
