package org.bitwisemadness.warframeprimeparts.database.model.amounts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.amounts.BaseAmounts;
import org.bitwisemadness.warframeprimeparts.database.model.amounts.BaseAmountsId;

public class SilvaAegisParts extends BaseAmounts {
    public SilvaAegisParts(BaseAmountsId id, Boolean crafted) {
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
