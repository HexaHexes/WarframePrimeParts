package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.amounts.weapons.melee.Melee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMeleeRepository extends JpaRepository<Melee, String> {
}
