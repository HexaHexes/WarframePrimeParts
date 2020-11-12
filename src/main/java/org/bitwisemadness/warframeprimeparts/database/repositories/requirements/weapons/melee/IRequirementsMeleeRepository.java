package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsMelee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRequirementsMeleeRepository extends JpaRepository<PartsMelee, String> {
}
