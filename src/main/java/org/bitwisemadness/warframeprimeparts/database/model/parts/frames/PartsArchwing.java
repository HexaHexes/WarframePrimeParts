package org.bitwisemadness.warframeprimeparts.database.model.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsArchwing;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsArchwing.findByName", query = "SELECT r FROM PartsArchwing r WHERE r.id.name= :name")
@NamedQuery(name = "PartsArchwing.findByNameByUser", query = "SELECT r FROM PartsArchwing r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsArchwing extends BaseParts {
    @ManyToOne
    private RequirementsArchwing baseRequirement;
    private Integer blueprintAmount;
    private Integer harnessAmount;
    private Integer systemsAmount;
    private Integer wingsAmount;

    public PartsArchwing() {
    }

    public PartsArchwing(RequirementsArchwing baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0, 0);
    }

    public PartsArchwing(RequirementsArchwing baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer harnessAmount, Integer systemsAmount, Integer wingsAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.harnessAmount = harnessAmount;
        this.systemsAmount = systemsAmount;
        this.wingsAmount = wingsAmount;
    }

    public RequirementsArchwing getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsArchwing baseRequirement) {
        this.baseRequirement = baseRequirement;
    }

    public Integer getBlueprintAmount() {
        return blueprintAmount;
    }

    public void setBlueprintAmount(Integer blueprintAmount) {
        this.blueprintAmount = blueprintAmount;
    }

    public Integer getHarnessAmount() {
        return harnessAmount;
    }

    public void setHarnessAmount(Integer harnessAmount) {
        this.harnessAmount = harnessAmount;
    }

    public Integer getSystemsAmount() {
        return systemsAmount;
    }

    public void setSystemsAmount(Integer systemsAmount) {
        this.systemsAmount = systemsAmount;
    }

    public Integer getWingsAmount() {
        return wingsAmount;
    }

    public void setWingsAmount(Integer wingsAmount) {
        this.wingsAmount = wingsAmount;
    }
}
