package org.bitwisemadness.warframeprimeparts.database.model.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BaseParts;
import org.bitwisemadness.warframeprimeparts.database.model.parts.BasePartsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsWarframe;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "PartsWarframe.findByName", query = "SELECT r FROM PartsWarframe r WHERE r.id.name= :name")
@NamedQuery(name = "PartsWarframe.findByNameByUser", query = "SELECT r FROM PartsWarframe r WHERE r.id.name= :name AND r.id.appUser= :appUser")
public class PartsWarframe extends BaseParts {
    @ManyToOne
    private RequirementsWarframe baseRequirement;
    private Integer blueprintAmount;
    private Integer chassisAmount;
    private Integer neuropticsAmount;
    private Integer systemsAmount;

    public PartsWarframe() {
    }

    public PartsWarframe(RequirementsWarframe baseRequirement, AppUser appUser) {
        this(baseRequirement, appUser, false, 0, 0, 0, 0);
    }

    public PartsWarframe(RequirementsWarframe baseRequirement, AppUser appUser, Boolean crafted, Integer blueprintAmount, Integer chassisAmount, Integer neuropticsAmount, Integer systemsAmount) {
        super(new BasePartsId(baseRequirement.getName(), appUser.getName()), crafted);
        this.blueprintAmount = blueprintAmount;
        this.chassisAmount = chassisAmount;
        this.neuropticsAmount = neuropticsAmount;
        this.systemsAmount = systemsAmount;
    }

    public RequirementsWarframe getBaseRequirement() {
        return baseRequirement;
    }

    public void setBaseRequirement(RequirementsWarframe baseRequirement) {
        this.baseRequirement = baseRequirement;
    }

    public Integer getBlueprintAmount() {
        return blueprintAmount;
    }

    public void setBlueprintAmount(Integer blueprintAmount) {
        this.blueprintAmount = blueprintAmount;
    }

    public Integer getChassisAmount() {
        return chassisAmount;
    }

    public void setChassisAmount(Integer chassisAmount) {
        this.chassisAmount = chassisAmount;
    }

    public Integer getNeuropticsAmount() {
        return neuropticsAmount;
    }

    public void setNeuropticsAmount(Integer neuropticsAmount) {
        this.neuropticsAmount = neuropticsAmount;
    }

    public Integer getSystemsAmount() {
        return systemsAmount;
    }

    public void setSystemsAmount(Integer systemsAmount) {
        this.systemsAmount = systemsAmount;
    }
}
