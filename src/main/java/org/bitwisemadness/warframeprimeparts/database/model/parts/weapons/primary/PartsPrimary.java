package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsPrimary;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsPrimary.findByName", query = "SELECT r FROM PartsPrimary r WHERE r.id.name= :name")
@NamedQuery(name = "PartsPrimary.findByNameByUser", query = "SELECT r FROM PartsPrimary r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsPrimary extends BaseParts {
    @ManyToOne
    private RequirementsPrimary baseRequirement;
    private Integer blueprintAmount;
    private Integer barrelAmount;
    private Integer receiverAmount;
    private Integer stockAmount;

    public PartsPrimary() {
    }

    public PartsPrimary(RequirementsPrimary baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0, 0);
    }

    public PartsPrimary(RequirementsPrimary baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer barrelAmount, Integer receiverAmount, Integer stockAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.barrelAmount = barrelAmount;
        this.receiverAmount = receiverAmount;
        this.stockAmount = stockAmount;
    }

    public RequirementsPrimary getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsPrimary baseRequirement) {
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

    public Integer getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }
}
