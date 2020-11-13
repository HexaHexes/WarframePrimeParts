package org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsSecondary;
import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsThrowing.findByName", query = "SELECT r FROM PartsThrowing r WHERE r.id.name= :name")
@NamedQuery(name = "PartsThrowing.findByNameByUser", query = "SELECT r FROM PartsThrowing r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsThrowing extends BaseParts {
    @ManyToOne
    private RequirementsSecondary baseRequirement;
    private Integer blueprintAmount;
    private Integer bladesAmount;
    private Integer pouchAmount;

    public PartsThrowing() {
    }

    public PartsThrowing(RequirementsSecondary baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0);
    }

    public PartsThrowing(RequirementsSecondary baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer bladesAmount, Integer pouchAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.bladesAmount = bladesAmount;
        this.pouchAmount = pouchAmount;
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

    public Integer getBladesAmount() {
        return bladesAmount;
    }

    public void setBladesAmount(Integer bladesAmount) {
        this.bladesAmount = bladesAmount;
    }

    public Integer getPouchAmount() {
        return pouchAmount;
    }

    public void setPouchAmount(Integer pouchAmount) {
        this.pouchAmount = pouchAmount;
    }
}
