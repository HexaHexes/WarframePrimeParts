package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsTipedo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsTipedo.findByName", query = "SELECT r FROM PartsTipedo r WHERE r.id.name= :name")
@NamedQuery(name = "PartsTipedo.findByNameByUser", query = "SELECT r FROM PartsTipedo r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsTipedo extends BaseParts {
    @ManyToOne
    private RequirementsTipedo baseRequirement;
    private Integer blueprintAmount;
    private Integer handleAmount;
    private Integer ornamentAmount;

    public PartsTipedo() {
    }

    public PartsTipedo(RequirementsTipedo baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0);
    }

    public PartsTipedo(RequirementsTipedo baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer handleAmount, Integer ornamentAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.handleAmount = handleAmount;
        this.ornamentAmount = ornamentAmount;
    }

    public RequirementsTipedo getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsTipedo baseRequirement) {
        this.baseRequirement = baseRequirement;
    }

    public Integer getBlueprintAmount() {
        return blueprintAmount;
    }

    public void setBlueprintAmount(Integer blueprintAmount) {
        this.blueprintAmount = blueprintAmount;
    }

    public Integer getHandleAmount() {
        return handleAmount;
    }

    public void setHandleAmount(Integer handleAmount) {
        this.handleAmount = handleAmount;
    }

    public Integer getOrnamentAmount() {
        return ornamentAmount;
    }

    public void setOrnamentAmount(Integer ornamentAmount) {
        this.ornamentAmount = ornamentAmount;
    }
}
