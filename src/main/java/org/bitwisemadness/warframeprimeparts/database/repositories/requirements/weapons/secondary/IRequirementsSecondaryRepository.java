package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsSecondary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRequirementsSecondaryRepository extends JpaRepository<RequirementsSecondary, String> {
}
