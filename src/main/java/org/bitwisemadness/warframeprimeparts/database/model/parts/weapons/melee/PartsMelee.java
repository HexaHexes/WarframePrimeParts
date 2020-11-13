package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsMelee;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsMelee.findByName", query = "SELECT r FROM PartsMelee r WHERE r.id.name= :name")
@NamedQuery(name = "PartsMelee.findByNameByUser", query = "SELECT r FROM PartsMelee r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsMelee extends BaseParts {
    @ManyToOne
    private RequirementsMelee baseRequirement;
    private Integer blueprintAmount;
    private Integer bladeAmount;
    private Integer handleAmount;

    public PartsMelee() {
    }

    public PartsMelee(RequirementsMelee baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0);
    }

    public PartsMelee(RequirementsMelee baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer bladeAmount, Integer handleAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.bladeAmount = bladeAmount;
        this.handleAmount = handleAmount;
    }

    public RequirementsMelee getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsMelee baseRequirement) {
        this.baseRequirement = baseRequirement;
    }

    public Integer getBlueprintAmount() {
        return blueprintAmount;
    }

    public void setBlueprintAmount(Integer blueprintAmount) {
        this.blueprintAmount = blueprintAmount;
    }

    public Integer getBladeAmount() {
        return bladeAmount;
    }

    public void setBladeAmount(Integer bladeAmount) {
        this.bladeAmount = bladeAmount;
    }

    public Integer getHandleAmount() {
        return handleAmount;
    }

    public void setHandleAmount(Integer handleAmount) {
        this.handleAmount = handleAmount;
    }
}
