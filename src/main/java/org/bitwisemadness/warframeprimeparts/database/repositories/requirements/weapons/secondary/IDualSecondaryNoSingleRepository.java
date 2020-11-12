package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.DualSecondary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDualSecondaryNoSingleRepository extends JpaRepository<DualSecondary, String> {
}
