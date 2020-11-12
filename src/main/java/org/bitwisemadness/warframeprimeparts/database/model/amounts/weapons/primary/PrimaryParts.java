package org.bitwisemadness.warframeprimeparts.database.model.amounts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.amounts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.amounts.BaseAmountsId;

public class PrimaryParts extends BaseAmounts {
    public PrimaryParts(BaseAmountsId id, Boolean crafted) {
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
