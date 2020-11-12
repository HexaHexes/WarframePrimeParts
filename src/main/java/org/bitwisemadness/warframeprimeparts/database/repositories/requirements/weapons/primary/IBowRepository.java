package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.Bow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBowRepository extends JpaRepository<Bow, String> {
}
