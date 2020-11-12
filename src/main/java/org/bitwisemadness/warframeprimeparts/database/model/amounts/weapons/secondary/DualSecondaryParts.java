package org.bitwisemadness.warframeprimeparts.database.model.amounts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.amounts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.amounts.BaseAmountsId;

public class DualSecondaryParts extends BaseAmounts {
    public DualSecondaryParts(BaseAmountsId id, Boolean crafted) {
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