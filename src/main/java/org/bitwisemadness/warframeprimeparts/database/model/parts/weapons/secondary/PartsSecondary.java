package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsSecondary;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsSecondary.findByName", query = "SELECT r FROM PartsSecondary r WHERE r.id.name= :name")
@NamedQuery(name = "PartsSecondary.findByNameByUser", query = "SELECT r FROM PartsSecondary r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsSecondary extends BaseParts {
    @ManyToOne
    private RequirementsSecondary baseRequirement;
    private Integer blueprintAmount;
    private Integer barrelAmount;
    private Integer receiverAmount;

    public PartsSecondary() {
    }

    public PartsSecondary(RequirementsSecondary baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0);
    }

    public PartsSecondary(RequirementsSecondary baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer barrelAmount, Integer receiverAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.barrelAmount = barrelAmount;
        this.receiverAmount = receiverAmount;
    }

    public RequirementsSecondary getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsSecondary baseRequirement) {
        this.baseRequirement = baseRequirement;
    }

    public Integer getBlueprintAmount() {
        return blueprintAmount;
    }

    public void setBlueprintAmount(Integer blueprintAmount) {
        this.blueprintAmount = blueprintAmount;
    }

    public Integer getBarrelAmount() {
        return barrelAmount;
    }

    public void setBarrelAmount(Integer barrelAmount) {
        this.barrelAmount = barrelAmount;
    }

    public Integer getReceiverAmount() {
        return receiverAmount;
    }

    public void setReceiverAmount(Integer receiverAmount) {
        this.receiverAmount = receiverAmount;
    }
}
