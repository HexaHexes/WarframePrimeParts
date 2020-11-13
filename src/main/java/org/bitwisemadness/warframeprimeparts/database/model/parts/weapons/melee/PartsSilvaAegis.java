package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsSilvaAegis;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsSilvaAegis.findByName", query = "SELECT r FROM PartsSilvaAegis r WHERE r.id.name= :name")
@NamedQuery(name = "PartsSilvaAegis.findByNameByUser", query = "SELECT r FROM PartsSilvaAegis r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsSilvaAegis extends BaseParts {
    @ManyToOne
    private RequirementsSilvaAegis baseRequirement;
    private Integer blueprintAmount;
    private Integer bladeAmount;
    private Integer guardAmount;
    private Integer hiltAmount;

    public PartsSilvaAegis() {
    }

    public PartsSilvaAegis(RequirementsSilvaAegis baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0, 0);
    }

    public PartsSilvaAegis(RequirementsSilvaAegis baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer bladeAmount, Integer guardAmount, Integer hiltAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.bladeAmount = bladeAmount;
        this.guardAmount = guardAmount;
        this.hiltAmount = hiltAmount;
    }

    public RequirementsSilvaAegis getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsSilvaAegis baseRequirement) {
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

    public Integer getGuardAmount() {
        return guardAmount;
    }

    public void setGuardAmount(Integer guardAmount) {
        this.guardAmount = guardAmount;
    }

    public Integer getHiltAmount() {
        return hiltAmount;
    }

    public void setHiltAmount(Integer hiltAmount) {
        this.hiltAmount = hiltAmount;
    }
}
