package org.bitwisemadness.warframeprimeparts.database.model.amounts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.amounts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.amounts.BaseAmountsId;
import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.Sentinel;

public class SentinelParts extends BaseAmounts {
    private Sentinel baseRequirement;

    public SentinelParts(BaseAmountsId id, Boolean crafted) {
        super(id, crafted);
    }

    @Override
    public Boolean hasFullSet() {
        return null;
    }

    @Override
    public Integer getFullSets() {
        return null;
    }
}
