package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.Crossbow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICrossbowRepository extends JpaRepository<Crossbow, String> {
}
